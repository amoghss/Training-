package com.answer10.presentation;

public interface Main {
	
	void takeOrder();
	
	/*
	 * The customer will give order which will be forwarded to CashierService class in Service Layer
	 */

	int payBill();
	
	/*
	 * Customer will pay the bill amount that will be provided to them.
	 * 1 meaning bill paid
	 * 0 meaning not paid
	 */
	
	int orderStatus();
	
	/*
	 * The completion of order will be pinged to the customer
	 * 1 meaning Order Completed
	 * 0 meaning preparing
	 */
	
}
