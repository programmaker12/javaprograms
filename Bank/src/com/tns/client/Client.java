package com.tns.client;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.application.MMBankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankFactory;
public class Client {
 
	public static void main(String[] args) {
		MMBankFactory sf = new MMBankFactory();
		
		
		SavingAcc pa = new MMSavingAcc(321,"Faiz",1000, true);
		pa.withdraw(pa.getCharges());
		//pa.toString();
		
		CurrentAcc na = new MMCurrentAcc(100,"Pradhnya",2000,100);
		na.withdraw(na.getcreditLimit());
		na.toString();
}
}
