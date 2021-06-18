package com.company.Refactoritzacions_8.introduce_local_extension;

public class MyConversor extends Conversor {

    public static double euro2Pound(double qty) {
        return qty * 1.23;
    }

    public static double pound2Euro(double qty) {
        return qty * 0.3;
    }

}
