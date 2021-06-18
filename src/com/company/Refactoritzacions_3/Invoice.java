package com.company.Refactoritzacions_3;

public class Invoice {
    public float totalPrice (float price, float vat, float discount){

        float total = 0;

        float priceVat = (vat * price) / 100;
                System.out.println("Applied vat: " + priceVat);

            total = price + priceVat;
                System.out.println("total with vat: " + total);

        return total - discount;

    }
}
