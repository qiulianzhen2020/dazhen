package com.git.dao;

public class Test {

	private int id;
	private String username;
	private String password;
	
	public int getId() {

		return id + 10;


	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username+110;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password+102;
	}
	public void setPassword(String password)  {
		this.password = password;
	}
}
