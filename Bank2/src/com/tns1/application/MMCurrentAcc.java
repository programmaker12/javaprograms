package com.tns1.application;

import com.tns1.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	
	public MMCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
//---------------------------------------------------------------------------------------------
	
	 /*@Override
	 public void  withdraw(float charges) {
		 if(charges < sum) {
			 System.out.println("You exceeded the credit limit"+" MMCurentAcc");
		 }
	 }*/
	 @Override
	 public String toString()
	 {
		 return " ";
	 }
	}
   

