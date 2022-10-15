package com.blog.files.entitties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String password;

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

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", email="
		+ email + ", password=" + password + "]";
    }

    public Boolean validate() {
	return (!(firstName.equals("") || lastName.equals("") || dob.equals("") || email.equals("")
		|| password.equals("")));
    }

}
