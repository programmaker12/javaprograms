package com.tns.application;
import com.tns.framework.SavingAcc;
public class MMSavingAcc extends SavingAcc {
	private static final float minBalance=0;
	public MMSavingAcc(int accNo, String accNm, float charges, boolean is) {
		super(accNo, accNm, charges, is);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float charges) {
		System.out.println("Dear Saving account  member, your product charges are: "+charges);
	}
	
	/*@Override
	public String toString()
	{
		return " ";
	}*/
    
}
