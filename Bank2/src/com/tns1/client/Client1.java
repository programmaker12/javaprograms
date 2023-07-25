package com.tns1.client;

import com.tns1.framework.BankFactory;
import com.tns1.application.MMBankFactory;
import com.tns1.framework.SavingAcc;
import com.tns1.application.MMSavingAcc;
import com.tns1.framework.CurrentAcc;
import com.tns1.application.MMCurrentAcc;
import java.util.Scanner;

public class Client1 {
	public static void main(String [] args)
	{
	//BankFactory b = new MMBankFactory();
	Scanner sc = new Scanner(System.in);
	System.out.println("This is for saving account");
	System.out.println("Enter the account number");
	int number = sc.nextInt();
	System.out.println("Enter the account holder name ");
	String name = sc.next();
	System.out.println("Enter the deposited amount ");
	int amount = sc.nextInt();
	System.out.println("Are you salaried monthly ? ");
	String ans = sc.next();
	boolean salary = false;
	if (ans == "Yes")
	{
		 salary = true;
	}
	SavingAcc s = new MMSavingAcc(number, name, amount, salary);
	
	System.out.println("How much you want to withdraw ?");
    s.withdraw(sc.nextFloat());
    
    System.out.println("This is for current account");
    System.out.println("Enter the account number ");
	number = sc.nextInt();
	System.out.println("Enter the account holder name ");
	 name = sc.next();
	System.out.println("Enter the deposited amount ");
	amount = sc.nextInt();
	System.out.println("Set the credit limit");
	int cl = sc.nextInt();
    CurrentAcc c = new MMCurrentAcc(number, name, amount, cl);
    
    System.out.println("How much you want to withdraw ?");
    c.withdraw(sc.nextFloat());
    c.toString();
}
}
