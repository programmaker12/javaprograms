package com.tns1.framework;

public abstract class CurrentAcc extends BankAcc{
	protected float sum;
	private final float creditLimit = 1000;
//--------------------------------------------------------------------
public CurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.sum = creditLimit + accBal;
		// TODO Auto-generated constructor stub
	}
//------------------------------------------------------------------------

//-------------------------------Methods---------------------------------------------

 @Override
 //This method will tell whether user can take the amount or not
 public void  withdraw(float amount) {
	 if(amount > sum) {
		 System.out.println("You exceeded the credit limit");
	 }
	 else
	 {
		 System.out.println("You can take the amount"); 
	 }
 }
 @Override
 public String toString()
 {
	 return " ";
 }
}
