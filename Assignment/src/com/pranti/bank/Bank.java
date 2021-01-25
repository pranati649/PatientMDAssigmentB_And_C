package com.pranti.bank;

import java.util.Scanner;

public abstract class Bank {
	public Long accountNumber;
	public String loanType;
	public float interestRate;
	

	/*
	 * This method is used to receive the account number from keyboard.
	 * Used to print the account details
	 * @author Pranati
	*/
	public void accountDetails() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter Account Number");
		Long accountNumber = sc1.nextLong();
		this.accountNumber = accountNumber;

	}
	/*
	 * This method is used to receive the loan type from keyboard.
	 * Used to print the loan details
	 * @author Pranati
	*/
	public void loanDetails() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter Loan Type");
		String loanType = sc2.next();
		this.loanType = loanType;

	}

	public abstract void rateOfInterest(); 

	/*
	 * This method is used to print account ,load details and rate of interest
	 * this is a template method to execute sequentially
	 * @author Pranati
	*/
	public final void printCustomerDetails() 
	{
		accountDetails();
		loanDetails();
		rateOfInterest();
		System.out.println("==============Customer Details Start here================");
		System.out.println("Account Number = " + this.accountNumber);
		System.out.println("Loan Type = " + this.loanType);
		System.out.println("Rate of Interest = " + this.interestRate);
		System.out.println("==============Customer Details end here================");
	}
}
