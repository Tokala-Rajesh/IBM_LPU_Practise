package com.example.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.example")
@PropertySource({"classpath:db.properties"})
public class DemoAppConfig implements WebMvcConfigurer 
{
	@Autowired
	private Environment env;
	private Logger logger = Logger.getLogger(getClass().getName());
	@Bean
	public DataSource datasource()
	{
		ComboPooledDataSource datasource = new ComboPooledDataSource();
		try 
		{
			datasource.setDriverClass("com.mysql.jdbc.Driver");		
		}
		catch (PropertyVetoException exc) 
		{
			throw new RuntimeException(exc);
		}
		logger.info("jdbc.url=" + env.getProperty("jdbc.url"));
		logger.info("jdbc.user=" + env.getProperty("jdbc.user"));
		
		datasource.setJdbcUrl(env.getProperty("jdbc.url"));
		datasource.setUser(env.getProperty("jdbc.user"));
		datasource.setPassword(env.getProperty("jdbc.password"));
		
		datasource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		datasource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		datasource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));		
		datasource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
		return datasource;
		
	}
	private Properties getHibernateProperties() 
	{
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		
		return props;				
	}

	
	private int getIntProperty(String propName)
	{
		
		String propVal = env.getProperty(propName);
		int intPropVal = Integer.parseInt(propVal);
		
		return intPropVal;
	}	
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource());
		sessionFactory.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
		sessionFactory.setHibernateProperties(getHibernateProperties());
		return sessionFactory;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) 
	{
	
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}	

}
