package com.axis.atm.repository;

import java.sql.SQLException;

public interface AccountRepository {
	Boolean updateBalance(String accountNumber, double balance) throws SQLException;
	Double getBalance(String accountNumber) throws SQLException;
	Boolean changePIN(String accountNumber, int pin) throws SQLException;
}
