package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.example")
public class DemoConfig implements WebMvcConfigurer 
{
	public ViewResolver viewResolver()
	{
		 InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		 viewResolver.setViewClass(JstlView.class);
		 viewResolver.setPrefix("/WEB-INF/pages");
		 viewResolver.setSuffix(".jsp");
		 return viewResolver;
	}
	 public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
	   {
	        configurer.enable();
	    }

}
