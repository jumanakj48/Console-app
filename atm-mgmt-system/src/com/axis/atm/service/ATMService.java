package com.axis.atm.service;

import java.util.List;

public interface ATMService {
	boolean withdrawl(String accountNumber, double amount);
	boolean deposit(String accountNumber, double amount);
	double checkBalance(String accountNumber);
	List<String> getMiniStatement(String accountNumber);
	boolean changePIN(String accountNumber);	
}
