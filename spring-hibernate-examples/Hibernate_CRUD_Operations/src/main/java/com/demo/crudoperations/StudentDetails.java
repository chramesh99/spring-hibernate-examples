package com.demo.crudoperations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	private int sId;
	private String sName;
	private String sAddress;
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
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public long getsPhoneNumber() {
		return sPhoneNumber;
	}
	public void setsPhoneNumber(long sPhoneNumber) {
		this.sPhoneNumber = sPhoneNumber;
	}
}
