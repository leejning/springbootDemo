package com.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * java属性注入方式
 * prefix：指定application.properties文件里的jdbc前缀
 * @author Administrator
 *
 */
//@ConfigurationProperties(prefix="jdbc")
public class JdbcProperties {
	private String url;
    private String driverClass;
    private String username;
    private String password;
    
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
