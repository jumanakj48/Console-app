package com.axis.atm.controller;

import java.util.Scanner;

import com.axis.atm.service.ATMService;
import com.axis.atm.service.ATMService_Impl;

public class ATMController {
	private static final String NEW_LINE = "\n";
	private static Scanner sc = new Scanner(System.in);
	ATMService atmService = new ATMService_Impl();
	
	public void showMenu() {
		System.out.println(prepareMenu());
		System.out.println("Please enter your option");
		handleUserOption();
	}

	private void handleUserOption() {
		int option = sc.nextInt();
		processUserRequest(option);
	}

	private void processUserRequest(int option) {
		switch (option) {
		case 1: {
			processWithdrawl();
			break;
		}
		case 2: {
			processDeposit();
			break;
		}
		case 3: {
			processBalanceEnquiry();
			break;
		}
		case 4: {
			System.out.println("Sorry, this service is unavailable");
			break;
		}
		case 5: {
			processPinChange();
			break;
		}
		case 6: {
			System.exit(0);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}

	}

	private void processPinChange() {
		System.out.println("Sorry, this service is unavailable");
	}

	private void processBalanceEnquiry() {
		System.out.println("Enter account number");
		String accountNumber = sc.next();
		double balance = atmService.checkBalance(accountNumber);
		System.out.println("Your account balance : " + balance);
	}

	private void processDeposit() {
		System.out.println("Enter account number");
		String accountNumber = sc.next();
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		boolean result = atmService.deposit(accountNumber, amount);
		if (result) {
			System.out.println("Deposit success");
		} else {
			System.out.println("Deposit failed");
		}
	}

	private void processWithdrawl() {
		System.out.println("Enter account number");
		String accountNumber = sc.next();
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		boolean result = atmService.withdrawl(accountNumber, amount);
		if (result) {
			System.out.println("Please collect the cash");
		} else {
			System.out.println("Withdrawl failed");
		}
	}

	private String prepareMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("1. Withdrawl");
		sb.append(NEW_LINE);
		sb.append("2. Deposit");
		sb.append(NEW_LINE);
		sb.append("3. Balance Enquiry");
		sb.append(NEW_LINE);
		sb.append("4. Mini Statement");
		sb.append(NEW_LINE);
		sb.append("5. PIN Change");
		sb.append(NEW_LINE);
		sb.append("6. Exit");
		sb.append(NEW_LINE);
		return sb.toString();
	}
}
