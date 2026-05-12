/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 * Prova da UCB.
 *
 * @author Gabriel
 */
public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB() {
        super(1.0, 1.0, 1.0, 7.0);
    }

    @Override
    public double calcularMedia() {
        return (notaAV1 * pesoAV1 + notaAV2 * pesoAV2) / (pesoAV1 + pesoAV2);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}
