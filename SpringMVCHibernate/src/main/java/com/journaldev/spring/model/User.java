package com.journaldev.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message = "should not be blank")
	private String username;
	@NotBlank(message = "should not be blank")
	private String password;
	@NotBlank(message = "should not be blank")
	private String confirmpassword;
	@NotBlank(message = "should not be blank")
	@Email
	private String confirmemail;
	@NotBlank(message = "should not be blank")
	@Email
	private String email;
	@NotBlank(message = "should not be blank")
	private String dob;
	
	
	
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public String getConfirmemail() {
		return confirmemail;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public void setConfirmemail(String confirmemail) {
		this.confirmemail = confirmemail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	public String getDob() {
		return dob;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
	
}
	