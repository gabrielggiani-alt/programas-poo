/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.modelo;

/**
 * Classe Emprestimo, representa um emprestimo de livro feito por um usuario.
 */
public class Emprestimo {

    private int id;
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;

    /**
     * Construtor padrao.
     */
    public Emprestimo() {
        this.id = 0;
        this.livro = null;
        this.usuario = null;
        this.dataEmprestimo = "";
        this.dataDevolucao = "";
    }

    /**
     * Construtor parametrizado.
     *
     * @param id Identificador unico do emprestimo
     * @param livro Livro que esta sendo emprestado
     * @param usuario Usuario que esta pegando o livro
     * @param dataEmprestimo Data do emprestimo no formato dd/mm/aaaa
     */
    public Emprestimo(int id, Livro livro, Usuario usuario, String dataEmprestimo) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = "";
    }

    /**
     * Exibe as informacoes do emprestimo no console.
     */
    public void exibirInfo() {
        System.out.println("=== EMPRESTIMO ===");
        System.out.println("ID: " + this.id);
        if (this.livro != null) {
            System.out.println("Livro: " + this.livro.getTitulo());
        } else {
            System.out.println("Livro: (nao informado)");
        }
        if (this.usuario != null) {
            System.out.println("Usuario: " + this.usuario.getNome());
        } else {
            System.out.println("Usuario: (nao informado)");
        }
        System.out.println("Data do Emprestimo: " + this.dataEmprestimo);
        if (this.dataDevolucao.equals("")) {
            System.out.println("Data de Devolucao: (nao devolvido)");
        } else {
            System.out.println("Data de Devolucao: " + this.dataDevolucao);
        }
        System.out.println("==================");
    }

    /**
     * @return o id do emprestimo
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id novo id do emprestimo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return o livro emprestado
     */
    public Livro getLivro() {
        return this.livro;
    }

    /**
     * @param livro novo livro emprestado
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * @return o usuario que pegou o livro
     */
    public Usuario getUsuario() {
        return this.usuario;
    }

    /**
     * @param usuario novo usuario do emprestimo
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return a data do emprestimo
     */
    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    /**
     * @param dataEmprestimo nova data do emprestimo
     */
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return a data de devolucao
     */
    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    /**
     * @param dataDevolucao nova data de devolucao
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
