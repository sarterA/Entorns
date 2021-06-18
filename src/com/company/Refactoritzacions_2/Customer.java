package com.company.Refactoritzacions_2;

public class Customer {

    private String name;
    private int age;
    private float salary;


        public Customer(String name, int age, float salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

    boolean ageMin = age > 17;
    boolean ageMax = age < 66;
    float salarybase = salary - salary * 0.2f;


        public float applyDiscount (float totalAmount){
            if ((ageMin && ageMax) && (salarybase) < 1000f && totalAmount * 0.5 < 100) {
                return totalAmount * 0.9f;
            }
                return totalAmount;
            }
        }

