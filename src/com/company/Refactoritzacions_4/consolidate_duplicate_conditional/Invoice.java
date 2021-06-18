package com.company.Refactoritzacions_4.consolidate_duplicate_conditional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Invoice {
	
	private Customer customer;
	private float price;
	private int qty;
	
	public Invoice (Customer customer, float price, int qty) {
		this.customer = customer;
		this.price = price;
		this.qty = qty;
	}
	
	public float calculateTotal (float vat, float discount) {
		float subtotal = price * qty;
		if (customer.isVip()) {
			subtotal = subtotal - discount;
		}
		return subtotal * (1 + (vat/100));
	}
}
