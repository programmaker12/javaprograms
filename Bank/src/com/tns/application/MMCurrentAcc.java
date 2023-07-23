package com.tns.application;
import com.tns.framework.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float charges, float creditLimit) {
		super(accNo, accNm, charges, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
    public void withdraw(float withdraw) {
		
		System.out.println("Dear Current User, your charges are: " +getCharges()+
				" and delivery charge is " + withdraw);
	}
    
    /*@Override
	public String toString()
	{
		return " ";
	}*/


}
