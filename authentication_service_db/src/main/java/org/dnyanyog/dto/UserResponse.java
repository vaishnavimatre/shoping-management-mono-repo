package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class UserResponse extends UserData{
	
	
private  String status;
private String message;
private  long userId;
private String username;
private String Password;
private String email;
private String age;
	
	public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}