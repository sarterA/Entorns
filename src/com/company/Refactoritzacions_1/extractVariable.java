package com.company.Refactoritzacions_1;

import java.util.Scanner;

public class extractVariable {

    public static boolean Menorde18(int age){
        if(age < 18){
            return true;
        }
        return false;
    }
    /**
     * Àrea d'una cirfunferència: PI * r ^ 2
     */
    public static double Area() {
        double area = 3.14 * (4 * 4);
        return area;
    }

    /**
     * Volum cilindre: PI * radi ^ 2 * altura
     */
    public static double Volume() {
        double volum = 3.14 * (4 * 4) * 5;
        return volum;
    }

    public static void exercici4() {
        int[] elements = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void exercici5() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean yFound = false;

        for (int i = 0; i < "lorem ipsum".length(); i++) {
            if ("lorem ipsum".charAt(i) == 'y') {
                yFound = true;
            }
            if (yFound && "lorem ipsum".charAt(i) == 'x') {
                counter++;
            }
        }

        System.out.println("Número d'aparicions del caràcter 'x' " +
                "després de la primera 'y': " + counter);
    }

}

