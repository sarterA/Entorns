package com.company.Refactoritzacions_8.introduce_local_extension;


public class Main {
	private Conversor conversor = new Conversor();
	
	public double convert (double amount) {
		return conversor.euro2Dollar(amount);
	}
}
