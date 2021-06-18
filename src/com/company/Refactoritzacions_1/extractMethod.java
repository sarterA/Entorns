package com.company.Refactoritzacions_1;
import java.util.Scanner;
import com.company.Ejercicio_classes_objectes.Persona;

public class extractMethod {

    public static void datos_persona(Persona persona1) {
        System.out.println("Dades de la persona: ");
        System.out.println("Nom: "  + persona1.getNom());
        System.out.println("Edat: " + persona1.getEdat());
    }

    public static void introducir_numero() {
        Scanner scanner = new Scanner(System.in);

        int [] numero = new int[5];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introdueix un número: ");
            numero[i] = scanner.nextInt();
        }

        System.out.println("Els números introduïts són:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
    }

    public static void sumar_numeros() {
        Scanner scanner = new Scanner(System.in);

        int [] numero = new int[5];
        int suma = 0;
        double promedio;

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introdueix un número: ");
            numero[i] = scanner.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }

        promedio = (double)suma / numero.length;
        System.out.println("La suma és: " + promedio);
    }

    public static String palabra_masLarga(String frase) {
        String paraulaActualInversa = "";
        String palabraMasLarga = "";

        int counter = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                paraulaActualInversa = frase.charAt(i) + paraulaActualInversa;
            } else {
                if (paraulaActualInversa.length() > palabraMasLarga.length()) {
                    palabraMasLarga = paraulaActualInversa;
                }
                paraulaActualInversa = "";
            }
        }
        return palabraMasLarga;
    }

    public static String frase_nueva(String frase) {
        String palabraActual = "";
        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                palabraActual = frase.charAt(i) + palabraActual;
            } else {
                novaFrase += palabraActual + ' ';
                palabraActual = "";
            }
        }
        return novaFrase;
    }

}
