package com.answer1.dao;

import com.answer1.beans.Transaction;

public interface TransactionDao {
	
	int addTransaction(Transaction transaction); // will add a new transaction when a issue request is validated
	int addTransactionEnd(Transaction transaction); //will add a return date to transaction when return request is validated

}
