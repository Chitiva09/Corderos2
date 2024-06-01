package com.camilo.ejercicio1;

import java.util.Scanner;

public class AreaDeUnCuadrado {
    public static void main(String[] args) {
        
        int ladoA;
        int ladoB;
        int area; 
        System.out.println("digite el lado A");
        Scanner scan = new Scanner (System.in);
        ladoA = scan.nextInt();
        
         System.out.println("digite el lado B");
        ladoB = scan.nextInt();
        
        area=ladoA*ladoB;
        
        System.out.println("el area del cuadro es: "+ area);
        
        
    }
}
