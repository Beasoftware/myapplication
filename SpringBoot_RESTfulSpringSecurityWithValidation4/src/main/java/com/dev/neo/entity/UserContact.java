package com.dev.neo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "user_contacttbl")
public class UserContact {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int contactId;
	private long mobileNo;
    private String emailId;
    private String address;
    public UserContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserContact(int contactId, long mobileNo, String emailId, String address) {
		super();
		this.contactId = contactId;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.address = address;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}// end class
