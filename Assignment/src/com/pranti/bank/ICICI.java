package com.pranti.bank;

import java.util.Scanner;

public class ICICI extends Bank {

	@Override
	public void rateOfInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Interest rate of ICICI");
        float f=sc.nextFloat();
        interestRate=f;
      
	}

}
