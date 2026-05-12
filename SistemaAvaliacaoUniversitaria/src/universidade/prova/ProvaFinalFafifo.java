/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 * Prova final da Fafifo.
 *
 * @author Gabriel
 */
public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade, 3.0);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return !provaUniversidade.aprovado();
    }

    @Override
    protected void aplicarResultado() {
        provaUniversidade.setNotaAV3(notaProvaFinal);
        ProvaFafifo fafifo = (ProvaFafifo) provaUniversidade;
        System.out.println("AV3 Fafifo aplicada. Nova media: " + fafifo.calcularMediaComAV3());
    }
}
