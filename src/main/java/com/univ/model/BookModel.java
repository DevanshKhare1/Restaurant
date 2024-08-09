package com.univ.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class BookModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cid;
	String name;
	String email;
	String date;
	String people;
	@Override
	public String toString() {
		return "BookModel [cid=" + cid + ", name=" + name + ", email=" + email + ", date=" + date + ", people=" + people
				+ ", request=" + request + "]";
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public BookModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	String request;
	public BookModel(int cid, String name, String email, String date, String people, String request) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.date = date;
		this.people = people;
		this.request = request;
	}
}
