package com.tns1.framework;

public abstract class SavingAcc extends BankAcc {
 
	private boolean isSalaried;
	private static final float MINBAL = 1000;
//---------------------------------------------------------
	public SavingAcc(int accNo, String accName, int accBal, boolean isSalaried) {
		super(accNo, accName, accBal);
		this.isSalaried= isSalaried;
		
	}
//---------------------------------------------------------------------------------------
	@Override
	//This method will tell whether the user can withdraw the desired amount or not
	public void withdraw(float amount)
	{
		if(d-amount < MINBAL)
		{
			System.out.println("You are not allowed to with draw amount because amount is exceeding the minimum balance");
		}
		else
		{
			System.out.println("You can take "+amount);
		}
		
	}
	
@Override
  public String toString()
  {
	return " ";
  }
}
