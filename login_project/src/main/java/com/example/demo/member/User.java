package com.example.demo.member;

public class User {
	
	private String userName;
	private String userDate;
	private String userId;
	private String userPass;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserDate() {
		return userDate;
	}
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	
	@Override
	public String toString() {
		return "MemberDTO [username=" + userName + ", userDate=" + userDate 
				+ ", userId=" + userDate + ", userPass=" + userPass + "]";
	}
}
