package com.answer1.beans;

import java.time.LocalDate;

public class User {
	
	private int userId;
	private String userName;
	private long userContact;
	private String userEmail;
	private LocalDate userRegistrationDate;
	
	//Getters and Setters
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public LocalDate getUserRegistrationDate() {
		return userRegistrationDate;
	}
	public void setUserRegistrationDate(LocalDate userRegistrationDate) {
		this.userRegistrationDate = userRegistrationDate;
	}
	
	
	

}
