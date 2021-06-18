package com.company.Refactoritzacions_3;

public class Customer {

    private boolean isVip;
    private boolean isSpecial;
    private int type;

    public static final int NORMAL = 0;
    public static final int SPECIAL = 1;
    public static final int VIP = 2;

    public Customer(boolean isVip, boolean isSpecial, int type) {
        this.isVip = isVip;
        this.isSpecial = isSpecial;
        this.type = type;
    }

    public double applyDiscount(double price, double discount) {
        return Discount.applyDiscount(this, price, discount);
    }

    public int getType() {
        return type;
    }

    public boolean isVip() {
        return isVip;
    }

    public boolean isSpecial() {
        return isSpecial;
    }
}