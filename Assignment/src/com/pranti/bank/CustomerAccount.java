package com.pranti.bank;

import java.util.Scanner;

public class CustomerAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Bank Name");
		String bankName = sc.nextLine();
		Bank bank = getBankName(bankName.trim().toUpperCase());
		if(bank !=null)
		  bank.printCustomerDetails();
		else
			System.out.println("Please enter correct bank name(SBI,ICICI or HDFC)");
		
	}

	public static Bank getBankName(String bankName) {
		// break is not required because i have used return statement in case.
		switch (bankName) {
		case "SBI":
			return new SBI();
		case "ICICI":
			return new ICICI();
		case "HDFC":
			return new HDFC();
		default:
			return null;
		}
	}

}
