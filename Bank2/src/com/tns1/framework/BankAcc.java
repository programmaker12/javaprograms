/*
 Design a simple framework for Bank Application to represent Saving Accounts
and Current Accounts.

Objectives
• To understand the concept of framework in application development.
• Areas of application for Abstract classes, abstract methods etc.
• Polymorphism and its uses,
• Final fields and Lazy Initialization
• Getter and Setter methods
• Lazy Binding of methods

 */
package com.tns1.framework;

public abstract class BankAcc {
  // Parameters required for a bank account  
	private int accNo;
	private String accNm;
	protected float accBal;
	protected double d;
// Getter Setter-------------------------------
	private String getAccNm() {
		return accNm;
	}

	private void setAccNm(String accNm) {
		this.accNm = accNm;
	}
//-------------------------------------------------------	
	private float getAccBal() {
		return accBal;
	}
	private void setAccBal(float accBal) {
		this.accBal = accBal;
	}
//------------------------------------------------------------
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
//------------------------------------------------------------	
	public BankAcc(int accNo, String accNm, int accBal ) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		d=accBal;
	}
//------------------------------------------------
//------------------Methods-----------------------------
	public void  withdraw(float amount)
	{
	 //System.out.println("You entered in bank");
	 
	}
	public void deposit(float amount)
	{
		//double d = charges;
		System.out.println("You have deposited "+amount+" Rs");
	}
	@Override
	public String toString() {
		return "NormalAcc [getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() +  ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
