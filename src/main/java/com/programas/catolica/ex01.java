package com.programas.catolica;
import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1 numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2 numero: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o 3 numero: ");
        int n3 = sc.nextInt();
        System.out.print("Digite o 4 numero: ");
        int n4 = sc.nextInt();

        int soma = n1 + n2 + n3 + n4;
        System.out.println("Soma: " + soma);
    }
}