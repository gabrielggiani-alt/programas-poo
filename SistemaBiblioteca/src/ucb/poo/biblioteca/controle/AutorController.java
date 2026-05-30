/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.controle;

import java.util.ArrayList;
import ucb.poo.biblioteca.modelo.Autor;

/**
 * Controller responsavel pelas operacoes de CRUD da entidade Autor.
 * Os dados sao armazenados em memoria usando ArrayList.
 */
public class AutorController {

    private ArrayList<Autor> autores;
    private int proximoId;

    /**
     * Construtor padrao.
     */
    public AutorController() {
        this.autores = new ArrayList<>();
        this.proximoId = 1;
    }

    /**
     * Cadastra um novo autor.
     *
     * @param nome Nome do autor
     * @param nacionalidade Nacionalidade do autor
     * @param dataNascimento Data de nascimento
     * @return o autor cadastrado
     */
    public Autor cadastrar(String nome, String nacionalidade, String dataNascimento) {
        Autor a = new Autor(this.proximoId, nome, nacionalidade, dataNascimento);
        this.autores.add(a);
        this.proximoId++;
        return a;
    }

    /**
     * Lista todos os autores cadastrados.
     */
    public void listar() {
        if (this.autores.isEmpty()) {
            System.out.println("Nenhum autor cadastrado.");
            return;
        }
        for (Autor a : this.autores) {
            a.exibirInfo();
        }
    }

    /**
     * Busca um autor pelo id.
     *
     * @param id Id do autor procurado
     * @return o autor encontrado ou null se nao existir
     */
    public Autor buscarPorId(int id) {
        for (Autor a : this.autores) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    /**
     * Atualiza os dados de um autor existente.
     *
     * @param id Id do autor a ser atualizado
     * @param nome Novo nome
     * @param nacionalidade Nova nacionalidade
     * @param dataNascimento Nova data de nascimento
     * @return true se a atualizacao foi feita, false se o autor nao existe
     */
    public boolean atualizar(int id, String nome, String nacionalidade, String dataNascimento) {
        Autor a = buscarPorId(id);
        if (a == null) {
            return false;
        }
        a.setNome(nome);
        a.setNacionalidade(nacionalidade);
        a.setDataNascimento(dataNascimento);
        return true;
    }

    /**
     * Exclui um autor pelo id.
     *
     * @param id Id do autor a ser excluido
     * @return true se foi excluido, false se nao foi encontrado
     */
    public boolean excluir(int id) {
        Autor a = buscarPorId(id);
        if (a == null) {
            return false;
        }
        this.autores.remove(a);
        return true;
    }

    /**
     * @return a lista de autores cadastrados
     */
    public ArrayList<Autor> getAutores() {
        return this.autores;
    }
}
