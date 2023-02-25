package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre, profesión y país de origen: ");
        String entrada = teclado.nextLine();
        String[] separado = entrada.split( " ");
        System.out.println("Nombre: " + separado[0].toUpperCase());
        System.out.println("Profesión: " + separado[1].toUpperCase());
        System.out.println("País: " + separado[2].toUpperCase());

    }
}