package com.javatpoint.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message="* Your name cant be blank")
	@Size(min = 3 , max = 15 , message= "* Your name should have char between 3-15")
	private String userName;

	@NotBlank(message="* Crush name cant be blank")
	@Size(min = 3 , max = 15 , message= "* Crush name should have char between 3-15")
	private String crushName;
	
	@AssertTrue(message = "* You have to agree Terms & condition")
	private boolean termAndConsition;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	public boolean isTermAndConsition() {
		return termAndConsition;
	}
	public void setTermAndConsition(boolean termAndConsition) {
		this.termAndConsition = termAndConsition;
	}
	

	

}
