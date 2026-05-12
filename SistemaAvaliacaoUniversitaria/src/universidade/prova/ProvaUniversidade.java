/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 * Classe abstrata que representa uma prova de uma universidade.
 *
 * @author Gabriel
 */
public abstract class ProvaUniversidade {

    protected double notaAV1;
    protected double notaAV2;
    protected double notaAV3;
    protected double pesoAV1;
    protected double pesoAV2;
    protected double pesoAV3;
    protected double mediaMinima;
    protected boolean realizouProvaFinal;

    /**
     * Construtor da prova.
     *
     * @param pesoAV1 peso da AV1
     * @param pesoAV2 peso da AV2
     * @param pesoAV3 peso da AV3
     * @param mediaMinima media minima para aprovacao
     */
    protected ProvaUniversidade(double pesoAV1, double pesoAV2, double pesoAV3, double mediaMinima) {
        this.notaAV1 = 0.0;
        this.notaAV2 = 0.0;
        this.notaAV3 = 0.0;
        this.pesoAV1 = pesoAV1;
        this.pesoAV2 = pesoAV2;
        this.pesoAV3 = pesoAV3;
        this.mediaMinima = mediaMinima;
        this.realizouProvaFinal = false;
    }

    /**
     * Calcula a media do aluno.
     *
     * @return media calculada
     */
    public abstract double calcularMedia();

    /**
     * Retorna a prova final correspondente.
     *
     * @return prova final da universidade
     */
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    /**
     * Verifica se o aluno foi aprovado.
     *
     * @return true se aprovado, false caso contrario
     */
    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public double getNotaAV3() {
        return notaAV3;
    }

    public void setNotaAV3(double notaAV3) {
        this.notaAV3 = notaAV3;
    }

    public double getPesoAV1() {
        return pesoAV1;
    }

    public void setPesoAV1(double pesoAV1) {
        this.pesoAV1 = pesoAV1;
    }

    public double getPesoAV2() {
        return pesoAV2;
    }

    public void setPesoAV2(double pesoAV2) {
        this.pesoAV2 = pesoAV2;
    }

    public double getPesoAV3() {
        return pesoAV3;
    }

    public void setPesoAV3(double pesoAV3) {
        this.pesoAV3 = pesoAV3;
    }

    public double getMediaMinima() {
        return mediaMinima;
    }

    public void setMediaMinima(double mediaMinima) {
        this.mediaMinima = mediaMinima;
    }

    public boolean isRealizouProvaFinal() {
        return realizouProvaFinal;
    }

    public void setRealizouProvaFinal(boolean realizouProvaFinal) {
        this.realizouProvaFinal = realizouProvaFinal;
    }
}
