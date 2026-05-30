/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.modelo;

/**
 * Classe Autor, representa um autor de livro.
 * Herda de Pessoa (heranca).
 */
public class Autor extends Pessoa {

    private String nacionalidade;
    private String dataNascimento;

    /**
     * Construtor padrao.
     */
    public Autor() {
        super();
        this.nacionalidade = "";
        this.dataNascimento = "";
    }

    /**
     * Construtor parametrizado.
     *
     * @param id Identificador unico do autor
     * @param nome Nome completo do autor
     * @param nacionalidade Nacionalidade do autor
     * @param dataNascimento Data de nascimento no formato dd/mm/aaaa
     */
    public Autor(int id, String nome, String nacionalidade, String dataNascimento) {
        super(id, nome);
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    /**
     * Exibe as informacoes do autor no console.
     * Sobrescreve o metodo abstrato da superclasse (polimorfismo).
     */
    @Override
    public void exibirInfo() {
        System.out.println("=== AUTOR ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("=============");
    }

    /**
     * @return a nacionalidade do autor
     */
    public String getNacionalidade() {
        return this.nacionalidade;
    }

    /**
     * @param nacionalidade nova nacionalidade do autor
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return a data de nascimento do autor
     */
    public String getDataNascimento() {
        return this.dataNascimento;
    }

    /**
     * @param dataNascimento nova data de nascimento do autor
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
