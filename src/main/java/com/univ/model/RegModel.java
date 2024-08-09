package com.univ.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Registration")
public class RegModel 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int cid;
String unm;
String pw;
String email;
String Address;
public RegModel() {
	super();
	// TODO Auto-generated constructor stub
}
public RegModel(int cid, String unm, String pw, String email, String address) {
	super();
	this.cid = cid;
	this.unm = unm;
	this.pw = pw;
	this.email = email;
	Address = address;
}
@Override
public String toString() {
	return "RegModel [cid=" + cid + ", unm=" + unm + ", pw=" + pw + ", email=" + email + ", Address=" + Address + "]";
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getUnm() {
	return unm;
}
public void setUnm(String unm) {
	this.unm = unm;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}	
}
