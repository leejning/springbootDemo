package com.springboot.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * @EnableConfigurationProperties(JdbcProperties.class) 开启java属性注入 指定注入的配置类
 * @author Administrator
 *
 */
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
	/*
	 * 1、自动注入
	 */
//	@Autowired
//	private JdbcProperties jdbc;

	/*
	 * 2、构造注入
	 */
//	private JdbcProperties jdbc;
//	public JdbcConfig(JdbcProperties jdbc) {
//		super();
//		this.jdbc = jdbc;
//	}

	/*
	 * 3、方法参数注入
	 */
//	@Bean
//	public DataSource dataSource(JdbcProperties jdbcProperties) throws PropertyVetoException {
//		ComboPooledDataSource dataSource = new ComboPooledDataSource();
//		dataSource.setDriverClass(jdbcProperties.getDriverClass());
//		dataSource.setJdbcUrl(jdbcProperties.getUrl());
//		dataSource.setUser(jdbcProperties.getUsername());
//		dataSource.setPassword(jdbcProperties.getPassword());
//		return dataSource;
//	}
	
	
	/*
	 * 	属性注入究极方式
	 */
	@Bean
	@ConfigurationProperties(prefix="jdbc")
	public DataSource dataSource() throws PropertyVetoException {
		return new ComboPooledDataSource();
	}

}
