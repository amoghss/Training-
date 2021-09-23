package com.answer10.service;

import java.util.Queue;

import com.answer10.beans.Order;

public interface BaristaService {
	
	Order getOrder(Queue<Order> orderQueue);
	
	/*
	 * This function is responsible for taking the next in queue item from orderQueue and
	 * place it in the preparing phase. and after the required time return the prepared item
	 * to serve the customer.
	 */
	
	Order checkOrder(Queue<Order> orderQueue, Queue<Order> completedOrder);
	
	/*
	 * This Function checks the order that is completed and pops it from the orderQueue and 
	 * pushes it into the completedQueue, and then ping the order completion for the Customer so
	 * they can receive it.
	 */
	

}
