package com.springdemo.wallettransaction.service.creditwalletservice;

public class CreditWalletRequest {

	private String mobileNUmber;
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getMobileNUmber() {
		return mobileNUmber;
	}

	public void setMobileNUmber(String mobileNUmber) {
		this.mobileNUmber = mobileNUmber;
	}
	
}
