package com.answer1.dao;

import com.answer1.beans.User;
public interface UserDao {
	
	int validateUser(User user);  		// will validate user while login
	int updateUserPassword(User user); 	// will update the user password 
	int updateUserContact(User user); 	//will update the user contact detail

}
