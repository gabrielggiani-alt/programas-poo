/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.controle;

import java.util.ArrayList;
import ucb.poo.biblioteca.modelo.Autor;
import ucb.poo.biblioteca.modelo.Livro;

/**
 * Controller responsavel pelas operacoes de CRUD da entidade Livro.
 * Os dados sao armazenados em memoria usando ArrayList.
 */
public class LivroController {

    private ArrayList<Livro> livros;
    private int proximoId;

    /**
     * Construtor padrao.
     */
    public LivroController() {
        this.livros = new ArrayList<>();
        this.proximoId = 1;
    }

    /**
     * Cadastra um novo livro.
     *
     * @param titulo Titulo do livro
     * @param isbn Codigo ISBN
     * @param anoPublicacao Ano de publicacao
     * @param autor Autor do livro
     * @return o livro cadastrado
     */
    public Livro cadastrar(String titulo, String isbn, int anoPublicacao, Autor autor) {
        Livro l = new Livro(this.proximoId, titulo, isbn, anoPublicacao, autor);
        this.livros.add(l);
        this.proximoId++;
        return l;
    }

    /**
     * Lista todos os livros cadastrados.
     */
    public void listar() {
        if (this.livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro l : this.livros) {
            l.exibirInfo();
        }
    }

    /**
     * Busca um livro pelo id.
     *
     * @param id Id do livro procurado
     * @return o livro encontrado ou null se nao existir
     */
    public Livro buscarPorId(int id) {
        for (Livro l : this.livros) {
            if (l.getId() == id) {
                return l;
            }
        }
        return null;
    }

    /**
     * Atualiza os dados de um livro existente.
     *
     * @param id Id do livro a ser atualizado
     * @param titulo Novo titulo
     * @param isbn Novo ISBN
     * @param anoPublicacao Novo ano de publicacao
     * @param autor Novo autor
     * @return true se atualizou, false se nao encontrou o livro
     */
    public boolean atualizar(int id, String titulo, String isbn, int anoPublicacao, Autor autor) {
        Livro l = buscarPorId(id);
        if (l == null) {
            return false;
        }
        l.setTitulo(titulo);
        l.setIsbn(isbn);
        l.setAnoPublicacao(anoPublicacao);
        l.setAutor(autor);
        return true;
    }

    /**
     * Exclui um livro pelo id.
     *
     * @param id Id do livro a ser excluido
     * @return true se foi excluido, false se nao foi encontrado
     */
    public boolean excluir(int id) {
        Livro l = buscarPorId(id);
        if (l == null) {
            return false;
        }
        this.livros.remove(l);
        return true;
    }

    /**
     * @return a lista de livros cadastrados
     */
    public ArrayList<Livro> getLivros() {
        return this.livros;
    }
}
