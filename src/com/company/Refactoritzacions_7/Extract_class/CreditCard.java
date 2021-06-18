package com.company.Refactoritzacions_7.Extract_Class;

import java.util.Date;

public class CreditCard {

    private String creditCard;
    private Date creditCardDate;
    private int creditCardControlNumber;

    // constructor...
    public CreditCard() {

    }

    public boolean isCardExpired () {
        return creditCardDate.before(new Date());
    }

    public boolean isValid () {
        boolean result = false;
        // Some code here...
        return result;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Date getCreditCardDate() {
        return creditCardDate;
    }

    public void setCreditCardDate(Date creditCardDate) {
        this.creditCardDate = creditCardDate;
    }

    public int getCreditCardControlNumber() {
        return creditCardControlNumber;
    }

    public void setCreditCardControlNumber(int creditCardControlNumber) {
        this.creditCardControlNumber = creditCardControlNumber;
    }



}
