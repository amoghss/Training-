package com.answer10.beans;

public class Order {
	
	private int tokenNumber;
	private int billAmount;
	private String[] orderItems;
	private String CustomerName;
	
	// Getters and Setters
	
	
	public int getTokenNumber() {
		return tokenNumber;
	}
	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String[] getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(String[] orderItems) {
		this.orderItems = orderItems;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	// Getters and Setters
	
	
	
	
}
