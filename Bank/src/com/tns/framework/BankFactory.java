package com.tns.framework;



public abstract class BankFactory {
	public abstract SavingAcc getSavingAccount(int accNo,String accNm, float charges,boolean isSalaried);
	public abstract CurrentAcc getBankAccount(int accNo,String accNm, float charges,float creditLimit);
}
