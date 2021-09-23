package com.answer10.service;

import com.answer10.beans.Order;

public interface CashierService {
	
	Order placeOrder(String[] orderItems, String CustomerName);
	
	/* Place Order function will be responsible for placing the order
	 * by storing it in the "order" object and also will provide a valid
	 * tokenId or orderId to each order. And then calculate a Bill amount 
	 * for the order under the customer name.
	 */
	
	int pingOrder(Order order);
	
	/* When the customer pays the entire bill amount the order is forwarded to the
	 * Barista waiting order queue, and provides an ETA to the customer
	 * the int return type is estimated time in seconds until arrival of order.
	 */
	
}
