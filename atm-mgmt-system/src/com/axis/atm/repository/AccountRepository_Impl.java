package com.axis.atm.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRepository_Impl implements AccountRepository {
	private String jdbcURL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private String jdbcUsername = "system";
	private String jdbcPassword = "Byts2";

	private static final String UPDATE_BALANCE_SQL = "update Account set balance = ? where AccountNumber = ?";
	private static final String SELECT_BALANCE_SQL = "select Balance from Account where AccountNumber = ?";
	private static final String UPDATE_PIN_SQL = "update Account set pin = ? where AccountNumber = ?";

	private Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public Boolean updateBalance(String accountNumber, double balance) throws SQLException {
		Boolean result = false;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BALANCE_SQL)) {
			preparedStatement.setDouble(1, balance);
			preparedStatement.setString(2, accountNumber);
			preparedStatement.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Double getBalance(String accountNumber) throws SQLException {
		Double balance = null;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BALANCE_SQL)) {
			preparedStatement.setString(1, accountNumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			balance = resultSet.getDouble("Balance");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return balance;
	}

	@Override
	public Boolean changePIN(String accountNumber, int pin) throws SQLException {
		Boolean result = false;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PIN_SQL)) {
			preparedStatement.setInt(1, pin);
			preparedStatement.setString(2, accountNumber);
			preparedStatement.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
