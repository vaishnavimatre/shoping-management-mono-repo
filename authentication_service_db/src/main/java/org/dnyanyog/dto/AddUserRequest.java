package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class AddUserRequest {
 private String action;
 private long user_id;
 private String user_name;
 private String user_email;
 private String user_age;
 
 
 public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
	
}


public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_email() {
	return user_email;
}
public void setUser_email(String user_email) {
	this.user_email = user_email;
}
public String getUser_age() {
	return user_age;
}
public void setUser_age(String user_age) {
	this.user_age = user_age;
}

 
}
