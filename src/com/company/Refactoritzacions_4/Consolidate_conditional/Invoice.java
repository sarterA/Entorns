package com.company.Refactoritzacions_4.Consolidate_conditional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Invoice {

	private Customer customer;
	private int year;

	public Invoice(Customer customer, int year) {
		this.customer = customer;
		this.year = year;
	}

	public float calculateTotal(float subtotal, float vat) {
		if (invalidForVat(subtotal)) {
			return 0;
		}
		return subtotal * vat;
	}

	public boolean invalidForVat(float subtotal) {
		return customer.getAge() < 18 || new GregorianCalendar().get(Calendar.YEAR) > year || subtotal < 0.5f;
	}
}
