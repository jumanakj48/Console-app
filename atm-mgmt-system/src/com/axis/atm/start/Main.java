package com.axis.atm.start;

import com.axis.atm.controller.ATMController;

public class Main {

	public static void main(String[] args) {
		ATMController menu = new ATMController();
		menu.showMenu();
	}
}
