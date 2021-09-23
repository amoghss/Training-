package com.answer1.dao;

import com.answer1.beans.Inventory;

public interface InventoryDao {
	
	int validateIssueRequest(Inventory inventory);		// will validate the issue request made by user
	int validateReturnRequest(Inventory inventory);    // will validate the return request made by user
	int updateStock(Inventory inventory);              // will update the stock for book

}
