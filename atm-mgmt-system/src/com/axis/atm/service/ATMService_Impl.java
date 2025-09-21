package com.axis.atm.service;

import java.util.List;

public class ATMService_Impl implements ATMService {

	AccountService accountService = new AccountService_Impl();
	
	@Override
	public boolean withdrawl(String accountNumber, double amount) {
		boolean result = false;
		try {
			double balance = accountService.getBalance(accountNumber);
			if (amount <= balance) {
				balance -= amount;
				accountService.updateBalance(accountNumber, balance);
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return result;
	}

	@Override
	public boolean deposit(String accountNumber, double amount) {
		boolean result = false;
		try {
			double balance = accountService.getBalance(accountNumber);
			balance += amount;
			accountService.updateBalance(accountNumber, balance);
			result = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public double checkBalance(String accountNumber) {
		double result = 0;
		try {
			result = accountService.getBalance(accountNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<String> getMiniStatement(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changePIN(String accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
