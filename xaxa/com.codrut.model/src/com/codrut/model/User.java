package com.codrut.model;

public class User {
	private Long id;
	private String userName;
	private String password;
	private String email;
	private int balance;
	
	public User(Long id, String userName, String password, String email, int balance) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.balance = balance;
	}
	
	public User() {
		
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}
	
	
}
