package com.answer1.service;

import com.answer1.beans.Admin;
import com.answer1.beans.Inventory;

public interface AdminService {
	
	int validateAdmin(Admin admin);			// Validate the admin
	int updateStock(Inventory inventory);	// updates the stock
	int updatePassword(Admin admin);		// updates the password
	int updateContact(Admin admin);			// updates the contact
	

}
