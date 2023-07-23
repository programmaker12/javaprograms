package com.tns.framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	private static final float MinBal = 1000;
	
	public SavingAcc(int accNo, String accNm, float charges, boolean isSalaried)
	{
		super(accNo, accNm, charges);
		this.isSalaried = isSalaried;
	}
	
	public void withdraw(float charges)
	{
		System.out.println("charges are: "+ charges);
	}
	
	/*@Override
	public String toString()
	{
		return " ";
	}*/
}
