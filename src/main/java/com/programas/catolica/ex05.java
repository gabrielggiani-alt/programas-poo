package com.programas.catolica;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário atual: R$ ");
        double salario = sc.nextDouble();
        System.out.print("Percentual de aumento (%): ");
        double percentual = sc.nextDouble();

        double valorAumento = salario * (percentual / 100);
        double novoSalario = salario + valorAumento;

        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
    }
}