/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova.teste;

import universidade.prova.ProvaUCB;
import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaAV3UCB;
import universidade.prova.ProvaFinalFafifo;

/**
 * Classe principal de teste do sistema de avaliacao.
 *
 * @author Gabriel
 */
public class Teste {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE AVALIACAO UNIVERSITARIA ===");
        System.out.println();

        System.out.println("--- UCB ---");
        ProvaUCB ucb = new ProvaUCB();
        ucb.setNotaAV1(8.0);
        ucb.setNotaAV2(6.0);

        System.out.println("Notas: AV1=" + ucb.getNotaAV1() + " AV2=" + ucb.getNotaAV2());
        System.out.println("Pesos: AV1=" + ucb.getPesoAV1() + " AV2=" + ucb.getPesoAV2());
        System.out.println("Media: " + ucb.calcularMedia());
        System.out.println("Situacao: " + (ucb.aprovado() ? "Aprovado" : "Reprovado"));

        System.out.println();
        System.out.println("Realizando AV3 UCB...");
        ProvaAV3UCB av3Ucb = (ProvaAV3UCB) ucb.getProvaFinalUniversidade();
        av3Ucb.realizarProva(9.0);
        System.out.println("Media apos AV3: " + ucb.calcularMedia());
        System.out.println("Situacao apos AV3: " + (ucb.aprovado() ? "Aprovado" : "Reprovado"));

        System.out.println();

        System.out.println("--- FAFIFO ---");
        ProvaFafifo fafifo = new ProvaFafifo();
        fafifo.setNotaAV1(5.0);
        fafifo.setNotaAV2(4.0);

        System.out.println("Notas: AV1=" + fafifo.getNotaAV1() + " AV2=" + fafifo.getNotaAV2());
        System.out.println("Pesos: AV1=" + fafifo.getPesoAV1() + " AV2=" + fafifo.getPesoAV2() + " AV3=" + fafifo.getPesoAV3());
        System.out.println("Media: " + fafifo.calcularMedia());
        System.out.println("Situacao: " + (fafifo.aprovado() ? "Aprovado" : "Reprovado"));

        System.out.println();
        System.out.println("Verificando habilitacao para AV3 Fafifo...");
        ProvaFinalFafifo av3Fafifo = (ProvaFinalFafifo) fafifo.getProvaFinalUniversidade();
        System.out.println("Habilitado: " + av3Fafifo.habilitadoRealizarProva());
        av3Fafifo.realizarProva(7.0);
        System.out.println("Media apos AV3: " + fafifo.calcularMediaComAV3());
        System.out.println("Situacao apos AV3: " + (fafifo.calcularMediaComAV3() >= 6.0 ? "Aprovado" : "Reprovado"));

        System.out.println();
        System.out.println("==========================================");
    }
}
