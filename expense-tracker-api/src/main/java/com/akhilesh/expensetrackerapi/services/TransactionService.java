package com.akhilesh.expensetrackerapi.services;

import com.akhilesh.expensetrackerapi.domain.Transaction;
import com.akhilesh.expensetrackerapi.exceptions.EtBadRequestException;
import com.akhilesh.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionService {

    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Transaction addTransaction(Integer userId,Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void  updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws  EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws  EtResourceNotFoundException;
}
