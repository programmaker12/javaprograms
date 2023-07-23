package com.tns.framework;

public class CurrentAcc extends BankAcc {

	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float charges, float creditLimit) {
		// TODO Auto-generated constructor stub
		super(accNo, accNm, charges);
		this.creditLimit = creditLimit;
	}
	
	public float getcreditLimit() {
		return creditLimit;
	}
	
	public void withdraw(float charges)
	{
		System.out.println("The charges are: "+ charges);
	}
	
	/*@Override
	public String toString()
	{
		return " ";
	}*/
}
