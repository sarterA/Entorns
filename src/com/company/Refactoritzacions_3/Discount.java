package com.company.Refactoritzacions_3;

public class Discount {

        public static double applyDiscount(Customer customer, double price, double discount) {
            double finalPrice;
            double appliedVat;

            appliedVat = applyVat(customer);
            finalPrice = calculateFinalPrice(customer, price);

            return finalPrice * appliedVat - discount;
        }

        public static double applyVat(Customer customer) {
            switch (customer.getType()) {
                case Customer.SPECIAL:
                    return 1.15f;
                case Customer.VIP:
                    return 1.04f;
                default:
                    return 1.21f;
            }
        }

        public static double calculateFinalPrice(Customer customer, double price) {
            if (price > 50 && customer.isVip()) {
                return price * 0.5;
            } else if (price > 10 && customer.isSpecial()) {
                return price * 0.1;
            } else {
                return price;
            }
        }
    }

