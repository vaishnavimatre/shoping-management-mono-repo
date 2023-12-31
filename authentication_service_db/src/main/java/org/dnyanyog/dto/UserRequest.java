package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class UserRequest  {

	private String username;
	 private String Password;
	 private String email;
	 private String age;
	 private long Userid;
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
	public long getUserid() {
		return Userid;
	}
	public void setUserid(long userid) {
		Userid = userid;
	}
	
	
	 
}
