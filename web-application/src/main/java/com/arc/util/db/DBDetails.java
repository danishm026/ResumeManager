package com.arc.util.db;

public class DBDetails {
	private static String url = "jdbc:mysql://localhost:3306/resume_manager";
	private static String username = "root";
	private static String password = "dhasni123nishom";
	
	private DBDetails() {
	}

	public static String getUrl() {
		return url;
	}

	public static String getUsername() {
		return username;
	}

	public static String getPassword() {
		return password;
	}
	
}
