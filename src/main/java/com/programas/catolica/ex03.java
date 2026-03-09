package com.programas.catolica;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: "); double n1 = sc.nextDouble();
        System.out.print("Peso 1: "); double p1 = sc.nextDouble();
        System.out.print("Nota 2: "); double n2 = sc.nextDouble();
        System.out.print("Peso 2: "); double p2 = sc.nextDouble();
        System.out.print("Nota 3: "); double n3 = sc.nextDouble();
        System.out.print("Peso 3: "); double p3 = sc.nextDouble();

        double media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
        System.out.printf("Média ponderada: %.2f%n", media);
    }
        
   }


        

