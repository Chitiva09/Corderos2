package com.camilo.ejercicio1;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        float calificacion1;
        float calificacion2;
        float calificacion3;
        float promedio;

        System.out.println("escrbir nota numero 1");
        Scanner scan = new Scanner(System.in);
        calificacion1 = scan.nextFloat();

        System.out.println("escrbir nota numero 2");

        calificacion2 = scan.nextFloat();

        System.out.println("escrbir nota numero 3");
        calificacion3 = scan.nextFloat();

        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        if ((promedio >= 9.5) && (promedio <= 10.0)) {
            System.out.println("recibe una beca del 80%");
        } else if ((promedio >= 8.5) && (promedio <= 9.4)) {
            System.out.println("recibe una beca del 40%");
        } else if ((promedio >= 8.0) && (promedio <= 8.4)) {
            System.out.println("recibe una beca del 25%");
        } else if (promedio <= 7.9) {
            System.out.println("no recibe beca");

        } else {
            System.out.println("el promedio esta fuera del rango");
        }

    }
}
