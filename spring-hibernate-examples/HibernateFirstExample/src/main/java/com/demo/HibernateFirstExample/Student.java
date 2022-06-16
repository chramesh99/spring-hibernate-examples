package com.demo.HibernateFirstExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	private long sPhoneNumber;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getsPhoneNumber() {
		return sPhoneNumber;
	}
	public void setsPhoneNumber(long sPhoneNumber) {
		this.sPhoneNumber = sPhoneNumber;
	}
	
	
}
