package com.springdemo.wallettransaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = true, unique = true)
	private long id;
	
	@Column(name = "user_hash_id", nullable = true)
	private String userHashId;
	
	@Column(name = "first_name", nullable = true)
	private String firstName;
	
	@Column(name = "last_name", nullable = true)
	private String lastName;
	
	@Column(name = "email", nullable = true, unique = true)
	private String email;
	
	@Column(name = "mobile_number", nullable = true, unique = true)
	private String mobileNumber;
	
	@Column(name = "balance", nullable = true)
	private double balance;
	
	@Column(name = "wallet_status", nullable = true)
	private boolean walletStatus;
	
	public User() {
		
	}
	

	public User(String userHashId, String firstName, String lastName, String email, String mobileNumber,
			double balance, boolean walletStatus) {
		
		this.userHashId = userHashId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
		this.walletStatus = walletStatus;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserHashId() {
		return userHashId;
	}


	public void setUserHashId(String userHashId) {
		this.userHashId = userHashId;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public boolean isWalletStatus() {
		return walletStatus;
	}


	public void setWalletStatus(boolean walletStatus) {
		this.walletStatus = walletStatus;
	}


}
