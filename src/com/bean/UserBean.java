/**
 * 
 */
/**
 * @author rushi
 *
 */
package com.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserBean {
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	private String firstName;
	private String lastName;
	private String address;
	private Double phoneNumber;
	private String emailId;
	private String userName;
	private String password; 
	public String login() {
		
		if (userName.equals("admin") && password.equals("admin")) {
		return "myresponse";
		} else
		return "failure";
		}
}
