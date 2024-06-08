package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int aid;

	public Address() {
		super();
	}

	public Address(String sdetail) {
		super();
		this.sdetail = sdetail;
	}

	String sdetail;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getSdetail() {
		return sdetail;
	}

	public void setSdetail(String sdetail) {
		this.sdetail = sdetail;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", sdetail=" + sdetail + ", eid=]";
	}
}
