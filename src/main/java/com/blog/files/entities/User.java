package com.blog.files.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NaturalId;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String dob;

    @NaturalId(mutable = true)
    private String email;

    private String password;

    private Boolean loginStatus = false;

    private String profile = "default.png";

    @CreationTimestamp
    private Date creationTime;

    public User() {
	super();
    }

    public User(String firstName, String lastName, String dob, String email, String password) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.email = email;
	this.password = password;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

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

    public String getDob() {
	return dob;
    }

    public void setDob(String dob) {
	this.dob = dob;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Boolean getLoginStatus() {
	return loginStatus;
    }

    public void setLoginStatus(Boolean loginStatus) {
	this.loginStatus = loginStatus;
    }

    public String getProfile() {
	return profile;
    }

    public void setProfile(String profile) {
	this.profile = profile;
    }

    public Date getCreationTime() {
	return creationTime;
    }

    public void setCreationTime(Date creationTime) {
	this.creationTime = creationTime;
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", email="
		+ email + ", password=" + password + ", loginStatus=" + loginStatus + ", profile=" + profile + "]";
    }

    public Boolean validate() {
	return (!(firstName.equals("") || lastName.equals("") || dob.equals("") || email.equals("")
		|| password.equals("")));
    }

}
