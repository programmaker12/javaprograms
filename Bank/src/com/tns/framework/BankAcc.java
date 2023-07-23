package com.tns.framework;
//
public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	BankAcc(int accNo, String accNm, float charges)
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	int getaccNo()
	{
		return accNo;
	}
	
	public void  setaccNo()
	{
		this.accNo = accNo;
	}
	
	public String getaccNm()
	{
		return accNm;
	}
	
	public float getCharges() {
		return charges;
		}


		public void setCharges(float charges) {
			this.charges = charges;
		}
	public void withdraw(float charges)
	{
		System.out.println("Product booked and the charges are: " +charges);
	}
	
	public void deposit(float charges)
	{
		System.out.println("Items are delivered with charegs: " + charges);
	}
	/*@Override
	public String toString()
	{
		return " ";
	}*/

}
