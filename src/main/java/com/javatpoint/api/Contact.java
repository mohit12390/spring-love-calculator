package com.javatpoint.api;

import java.util.List;

public class Contact {

	private String firstname;
	private String lastname;
	private String email;
	private String birthday;
	private List<String> country;
	public String getBirthday() {
		return birthday;
	}
	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", birthday="
				+ birthday + ", country=" + country + ", subject=" + subject + ", remember=" + remember + ", gender="
				+ gender + "]";
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	private String subject;
	private boolean remember;
	private String gender;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getCountry() {
		return country;
	}
	public void setCountry(List<String> country) {
		this.country = country;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isRemember() {
		return remember;
	}
	public void setRemember(boolean remember) {
		this.remember = remember;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
