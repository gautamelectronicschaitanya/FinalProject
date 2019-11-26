package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_LOGIN_CREDENTIALS")
public class Login_Credentials {

	@Id
	@GeneratedValue
	@Column(name="LOGIN_ID")
	private int loginid;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User_Profile userprofile;

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
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

	public User_Profile getUserprofile() {
		return userprofile;
	}

	public void setUserprofile(User_Profile userprofile) {
		this.userprofile = userprofile;
	}

	@Override
	public String toString() {
		return "Login_Credentials [loginid=" + loginid + ", username=" + username + ", password=" + password
				+ ", userprofile=" + userprofile + "]";
	}
	
	
	
	
	
}
