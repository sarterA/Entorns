package com.company.Refactoritzacions_4.consolidate_duplicate_conditional;

public class Customer {
	private boolean isVip;
	
	public Customer (boolean isVip) {
		this.isVip = isVip;
	}

	public boolean isVip () {
		return isVip;
	}
}
