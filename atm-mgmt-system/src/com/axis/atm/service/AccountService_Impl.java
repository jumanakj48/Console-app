package com.axis.atm.service;

import java.sql.SQLException;

import com.axis.atm.repository.AccountRepository;
import com.axis.atm.repository.AccountRepository_Impl;

public class AccountService_Impl implements AccountService {

	AccountRepository repository = new AccountRepository_Impl();

	@Override
	public boolean updateBalance(String accountNumber, double balance) throws SQLException {
		return repository.updateBalance(accountNumber, balance);
	}

	@Override
	public double getBalance(String accountNumber) throws SQLException {
		return repository.getBalance(accountNumber);	
	}

	@Override
	public boolean changePIN(String accountNumber, int pin) throws SQLException {
		return repository.changePIN(accountNumber, pin);
	}

}
