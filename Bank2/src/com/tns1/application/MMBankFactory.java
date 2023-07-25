package com.tns1.application;

import com.tns1.framework.BankFactory;
import com.tns1.framework.CurrentAcc;
import com.tns1.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

}
