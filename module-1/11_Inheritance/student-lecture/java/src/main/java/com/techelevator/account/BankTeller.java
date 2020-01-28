package com.techelevator.account;

import java.math.BigDecimal;

public class BankTeller {

	public static void main(String[] args) {
	
		SavingsAccount savings = new SavingsAccount(new BigDecimal(50), "12343234", new BigDecimal(5.7));    //open account with $50
		CheckingAccount checking = new CheckingAccount(new BigDecimal(25), "973834", true);
		
		
		
		
		
		BigDecimal newBalance = checking.deposit(new BigDecimal(1000));
		System.out.println("OpeningBalance for Account: " + checking.getAccountNumber() + " is " + checking.getBalance() + ",  New Balance After Deposit: " + newBalance);
		
		newBalance = checking.withdrawal(new BigDecimal(25));
		System.out.println("Balance for Account: " + checking.getAccountNumber() + " is " + checking.getBalance() + ",  New Balance After Withdrawal: " + newBalance);
	}

}
