package com.univ.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact")
public class ContactModel 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int cid;
String name;
String email;
String subject;
String message;
public ContactModel(int cid, String name, String email, String subject, String message) {
	super();
	this.cid = cid;
	this.name = name;
	this.email = email;
	this.subject = subject;
	this.message = message;
}
public ContactModel() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "ContactModel [cid=" + cid + ", name=" + name + ", email=" + email + ", subject=" + subject + ", message="
			+ message + "]";
}
}
