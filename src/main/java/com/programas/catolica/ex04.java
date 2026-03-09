package com.programas.catolica;
import java.util.Scanner;

public class ex04 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário atual: R$ ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.25;
        System.out.printf("Novo salário (25%% de aumento): R$ %.2f%n", novoSalario);
    }
}