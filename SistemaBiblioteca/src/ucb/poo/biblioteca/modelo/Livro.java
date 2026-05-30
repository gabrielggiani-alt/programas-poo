/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.modelo;

/**
 * Classe Livro, representa um livro do acervo da biblioteca.
 */
public class Livro {

    private int id;
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private Autor autor;
    private boolean disponivel;

    /**
     * Construtor padrao.
     */
    public Livro() {
        this.id = 0;
        this.titulo = "";
        this.isbn = "";
        this.anoPublicacao = 0;
        this.autor = null;
        this.disponivel = true;
    }

    /**
     * Construtor parametrizado.
     *
     * @param id Identificador unico do livro
     * @param titulo Titulo do livro
     * @param isbn Codigo ISBN do livro
     * @param anoPublicacao Ano de publicacao
     * @param autor Autor do livro
     */
    public Livro(int id, String titulo, String isbn, int anoPublicacao, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.disponivel = true;
    }

    /**
     * Exibe as informacoes do livro no console.
     */
    public void exibirInfo() {
        System.out.println("=== LIVRO ===");
        System.out.println("ID: " + this.id);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Ano de Publicacao: " + this.anoPublicacao);
        if (this.autor != null) {
            System.out.println("Autor: " + this.autor.getNome());
        } else {
            System.out.println("Autor: (sem autor)");
        }
        if (this.disponivel) {
            System.out.println("Status: Disponivel");
        } else {
            System.out.println("Status: Emprestado");
        }
        System.out.println("=============");
    }

    /**
     * @return o id do livro
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id novo id do livro
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return o titulo do livro
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * @param titulo novo titulo do livro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return o ISBN do livro
     */
    public String getIsbn() {
        return this.isbn;
    }

    /**
     * @param isbn novo ISBN do livro
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return o ano de publicacao do livro
     */
    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    /**
     * @param anoPublicacao novo ano de publicacao
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * @return o autor do livro
     */
    public Autor getAutor() {
        return this.autor;
    }

    /**
     * @param autor novo autor do livro
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return true se o livro esta disponivel para emprestimo
     */
    public boolean isDisponivel() {
        return this.disponivel;
    }

    /**
     * @param disponivel novo status de disponibilidade
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
