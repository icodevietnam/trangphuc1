package com.icoding.trangphuc.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	public static final long serialVersionUID = 0L;

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String address;
	private Boolean sex;
	private Date dataOfBirth;
	private Boolean enabled;
	private Boolean accountExpired;
	private Boolean accountLock;
	private Boolean passwordExpired;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Date getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getAccountExpired() {
		return accountExpired;
	}

	public void setAccountExpired(Boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	public Boolean getAccountLock() {
		return accountLock;
	}

	public void setAccountLock(Boolean accountLock) {
		this.accountLock = accountLock;
	}

	public Boolean getPasswordExpired() {
		return passwordExpired;
	}

	public void setPasswordExpired(Boolean passwordExpired) {
		this.passwordExpired = passwordExpired;
	}

}