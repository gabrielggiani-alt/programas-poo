/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 * Prova AV3 (substitutiva) da UCB.
 *
 * @author Gabriel
 */
public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade, 1.0);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return true;
    }

    @Override
    protected void aplicarResultado() {
        if (provaUniversidade.getNotaAV1() <= provaUniversidade.getNotaAV2()) {
            provaUniversidade.setNotaAV1(notaProvaFinal);
        } else {
            provaUniversidade.setNotaAV2(notaProvaFinal);
        }
        provaUniversidade.setNotaAV3(notaProvaFinal);
        System.out.println("AV3 UCB aplicada. Nova media: " + provaUniversidade.calcularMedia());
    }
}
