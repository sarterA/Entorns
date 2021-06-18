package com.company.Refactoritzacions_6.Parametrize_method;


public class Invoice {
	private float subtotal;
	private Customer customer;

	public Invoice(float subtotal, Customer customer) {
		this.subtotal = subtotal;
		this.customer = customer;
	}

	public float charge() {
		if (customer.getAge() < 18) {
			return charge(0.5f);
		}
		if (customer.payInCash()) {
			return charge(0.8f);
		}
		return charge(1f);
	}

	private float charge(float amount) {
		return subtotal * amount;
	}

}
