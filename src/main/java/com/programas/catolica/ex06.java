package com.programas.catolica;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário base: R$ ");
        double salarioBase = sc.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.printf("Gratificação (5%%): R$ %.2f%n", gratificacao);
        System.out.printf("Imposto (7%%): R$ %.2f%n", imposto);
        System.out.printf("Salário a receber: R$ %.2f%n", salarioFinal);
    }
}