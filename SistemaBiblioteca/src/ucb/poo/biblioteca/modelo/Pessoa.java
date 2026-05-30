/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.modelo;

/**
 * Classe abstrata Pessoa.
 * Serve como base para Autor e Usuario, demonstrando os pilares de
 * abstracao e heranca.
 */
public abstract class Pessoa {

    protected int id;
    protected String nome;

    /**
     * Construtor padrao.
     */
    public Pessoa() {
        this.id = 0;
        this.nome = "Sem nome";
    }

    /**
     * Construtor parametrizado.
     *
     * @param id Identificador unico da pessoa
     * @param nome Nome completo da pessoa
     */
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Metodo abstrato que cada subclasse deve implementar para exibir
     * suas informacoes no console (polimorfismo).
     */
    public abstract void exibirInfo();

    /**
     * @return o id da pessoa
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id novo id da pessoa
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return o nome da pessoa
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome novo nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
