package com.company.Refactoritzacions_4.Descompose_conditional;

public class Invoice {
	private Customer customer;
	
	public Invoice (Customer customer) {
		this.customer = customer;
	}
	
	public float calculatePayment (float price, float discount, float vat) {
		if (isValidAge()) {
			return price * discount * vat;
		}
		return price * vat;
	}

	public boolean isValidAge() {
		return customer.getAge() < 18 || customer.getAge() > 65;
	}
}
