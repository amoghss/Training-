package com.answer1.dao;

import com.answer1.beans.Admin;

public interface AdminDao {
	
	int validateAdmin(Admin admin);  // will validate admin while login
	int updatePassword(Admin admin); // will update the admin password 
	int updateContact(Admin admin); //will update the admin contact detail

}
