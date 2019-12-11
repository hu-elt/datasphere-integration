package com.datasphere.db.config;

public class MSSQLConfig extends DBConfig {

	
    String databaseName;
	
	String user;
	
	String password;

	public String getDatabaseName() {
		return databaseName;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
