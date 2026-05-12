/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 * Classe abstrata que representa a prova final de uma universidade.
 *
 * @author Gabriel
 */
public abstract class ProvaFinalUniversidade {

    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade provaUniversidade;

    /**
     * Construtor da prova final.
     *
     * @param provaUniversidade prova da universidade vinculada
     * @param pesoProvaFinal peso da prova final
     */
    protected ProvaFinalUniversidade(ProvaUniversidade provaUniversidade, double pesoProvaFinal) {
        this.provaUniversidade = provaUniversidade;
        this.pesoProvaFinal = pesoProvaFinal;
        this.notaProvaFinal = 0.0;
        this.realizouProva = false;
    }

    /**
     * Verifica se o aluno esta habilitado a realizar a prova final.
     *
     * @return true se habilitado, false caso contrario
     */
    public abstract boolean habilitadoRealizarProva();

    /**
     * Registra a nota da prova final e aplica o resultado.
     *
     * @param nota nota tirada na prova final
     */
    public void realizarProva(double nota) {
        if (habilitadoRealizarProva()) {
            this.notaProvaFinal = nota;
            this.realizouProva = true;
            this.provaUniversidade.realizouProvaFinal = true;
            System.out.println("Prova final realizada. Nota: " + nota);
            aplicarResultado();
        } else {
            System.out.println("Aluno nao esta habilitado para realizar a prova final.");
        }
    }

    /**
     * Aplica o resultado da prova final no calculo da media.
     */
    protected abstract void aplicarResultado();

    public double getNotaProvaFinal() {
        return notaProvaFinal;
    }

    public void setNotaProvaFinal(double notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }

    public double getPesoProvaFinal() {
        return pesoProvaFinal;
    }

    public void setPesoProvaFinal(double pesoProvaFinal) {
        this.pesoProvaFinal = pesoProvaFinal;
    }

    public boolean isRealizouProva() {
        return realizouProva;
    }

    public void setRealizouProva(boolean realizouProva) {
        this.realizouProva = realizouProva;
    }

    public ProvaUniversidade getProvaUniversidade() {
        return provaUniversidade;
    }

    public void setProvaUniversidade(ProvaUniversidade provaUniversidade) {
        this.provaUniversidade = provaUniversidade;
    }
}
