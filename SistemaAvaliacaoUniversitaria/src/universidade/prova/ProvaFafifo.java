/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 * Prova da Fafifo.
 *
 * @author Gabriel
 */
public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo() {
        super(1.0, 1.0, 3.0, 6.0);
    }

    @Override
    public double calcularMedia() {
        return (notaAV1 * pesoAV1 + notaAV2 * pesoAV2) / (pesoAV1 + pesoAV2);
    }

    /**
     * Calcula a media incluindo a nota da AV3.
     *
     * @return media com AV3
     */
    public double calcularMediaComAV3() {
        return (notaAV1 * pesoAV1 + notaAV2 * pesoAV2 + notaAV3 * pesoAV3) / (pesoAV1 + pesoAV2 + pesoAV3);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }
}
