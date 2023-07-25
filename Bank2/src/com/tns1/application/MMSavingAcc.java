package com.tns1.application;

import com.tns1.framework.SavingAcc;
//import com.tns.framework.BankAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL = 1000;
	public MMSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried)
	{
		super(accBal, accNm, accBal, isSalaried);
		
	}
	
	/*@Override
	public void withdraw(float charges)
	{
		if(d-charges != MINBAL)
		{
			System.out.println("You are not allowed to with draw amount because amount is exceeding the minimum balance");
		}
	}*/
	
	@Override
	public String toString()
	{
		return " ";
	}
}

