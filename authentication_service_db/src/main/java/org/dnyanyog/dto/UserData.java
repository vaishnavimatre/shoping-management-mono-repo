package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class UserData {
private String username;
private String password;
private String email;
private String age;
private Long userid;
public Long getUserid() {
	return userid;
}
public void setUserid(Long userid) {
	this.userid = userid;
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
}
