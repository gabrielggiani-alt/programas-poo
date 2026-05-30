/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.modelo;

/**
 * Classe Usuario, representa um usuario da biblioteca.
 * Herda de Pessoa (heranca).
 */
public class Usuario extends Pessoa {

    private String endereco;
    private String telefone;

    /**
     * Construtor padrao.
     */
    public Usuario() {
        super();
        this.endereco = "";
        this.telefone = "";
    }

    /**
     * Construtor parametrizado.
     *
     * @param id Identificador unico do usuario
     * @param nome Nome completo do usuario
     * @param endereco Endereco completo do usuario
     * @param telefone Telefone de contato do usuario
     */
    public Usuario(int id, String nome, String endereco, String telefone) {
        super(id, nome);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * Exibe as informacoes do usuario no console.
     * Sobrescreve o metodo abstrato da superclasse (polimorfismo).
     */
    @Override
    public void exibirInfo() {
        System.out.println("=== USUARIO ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("===============");
    }

    /**
     * @return o endereco do usuario
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * @param endereco novo endereco do usuario
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return o telefone do usuario
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * @param telefone novo telefone do usuario
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
