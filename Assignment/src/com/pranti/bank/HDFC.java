package com.pranti.bank;

import java.util.Scanner;

public class HDFC extends Bank {

	@Override
	public void rateOfInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Interest rate of HDFC");
        float f=sc.nextFloat();
        interestRate=f;
       
	}

}
