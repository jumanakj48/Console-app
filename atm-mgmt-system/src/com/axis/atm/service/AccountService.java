package com.axis.atm.service;

import java.sql.SQLException;

public interface AccountService {
	boolean updateBalance(String accountNumber, double balance)  throws SQLException;
	double getBalance(String accountNumber)  throws SQLException;
	boolean changePIN(String accountNumber, int pin)  throws SQLException;
}
