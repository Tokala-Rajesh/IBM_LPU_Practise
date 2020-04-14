package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JDBC_Config.class})
@ComponentScan({"com.example"})
public class MyConfig
{
	

}
