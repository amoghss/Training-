package com.answer1.service;

import com.answer1.beans.Book;
import com.answer1.beans.User;

public interface UserService {
	
	int validateAdmin(User user);
	int updatePassword(User user);
	int updateContact(User user);
	int issueBook(Book book);
	int returnBook(Book book);
	

}
