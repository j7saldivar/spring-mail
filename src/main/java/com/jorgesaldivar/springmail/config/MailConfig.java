package com.jorgesaldivar.springmail.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.mail")
public class MailConfig {

	private String host;
	private Integer port;
	private String username;
	private String password;

	public String getHost() {
		return host;
	}

	public String getPassword() {
		return password;
	}

	public Integer getPort() {
		return port;
	}

	public String getUsername() {
		return username;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "MailConfig [host=" + host + ", port=" + port + ", username=" + username + ", password=" + password
				+ "]";
	}

}
