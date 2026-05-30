/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.controle;

import java.util.ArrayList;
import ucb.poo.biblioteca.modelo.Emprestimo;
import ucb.poo.biblioteca.modelo.Livro;
import ucb.poo.biblioteca.modelo.Usuario;

/**
 * Controller responsavel pelas operacoes de CRUD da entidade Emprestimo.
 * Tambem cuida da regra de marcar o livro como emprestado/disponivel.
 */
public class EmprestimoController {

    private ArrayList<Emprestimo> emprestimos;
    private int proximoId;

    /**
     * Construtor padrao.
     */
    public EmprestimoController() {
        this.emprestimos = new ArrayList<>();
        this.proximoId = 1;
    }

    /**
     * Cadastra um novo emprestimo e marca o livro como indisponivel.
     *
     * @param livro Livro a ser emprestado
     * @param usuario Usuario que esta pegando o livro
     * @param dataEmprestimo Data do emprestimo
     * @return o emprestimo cadastrado, ou null se o livro nao estava disponivel
     */
    public Emprestimo cadastrar(Livro livro, Usuario usuario, String dataEmprestimo) {
        if (!livro.isDisponivel()) {
            return null;
        }
        Emprestimo e = new Emprestimo(this.proximoId, livro, usuario, dataEmprestimo);
        this.emprestimos.add(e);
        livro.setDisponivel(false);
        this.proximoId++;
        return e;
    }

    /**
     * Lista todos os emprestimos cadastrados.
     */
    public void listar() {
        if (this.emprestimos.isEmpty()) {
            System.out.println("Nenhum emprestimo cadastrado.");
            return;
        }
        for (Emprestimo e : this.emprestimos) {
            e.exibirInfo();
        }
    }

    /**
     * Busca um emprestimo pelo id.
     *
     * @param id Id do emprestimo procurado
     * @return o emprestimo encontrado ou null se nao existir
     */
    public Emprestimo buscarPorId(int id) {
        for (Emprestimo e : this.emprestimos) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    /**
     * Atualiza a data de emprestimo de um registro existente.
     *
     * @param id Id do emprestimo
     * @param dataEmprestimo Nova data de emprestimo
     * @return true se atualizou, false se nao encontrou
     */
    public boolean atualizar(int id, String dataEmprestimo) {
        Emprestimo e = buscarPorId(id);
        if (e == null) {
            return false;
        }
        e.setDataEmprestimo(dataEmprestimo);
        return true;
    }

    /**
     * Registra a devolucao de um livro emprestado.
     *
     * @param id Id do emprestimo
     * @param dataDevolucao Data em que o livro foi devolvido
     * @return true se a devolucao foi registrada, false se nao encontrou
     */
    public boolean devolver(int id, String dataDevolucao) {
        Emprestimo e = buscarPorId(id);
        if (e == null) {
            return false;
        }
        e.setDataDevolucao(dataDevolucao);
        if (e.getLivro() != null) {
            e.getLivro().setDisponivel(true);
        }
        return true;
    }

    /**
     * Exclui um emprestimo pelo id. Se o livro ainda estiver marcado como
     * emprestado, volta a ficar disponivel.
     *
     * @param id Id do emprestimo a ser excluido
     * @return true se foi excluido, false se nao foi encontrado
     */
    public boolean excluir(int id) {
        Emprestimo e = buscarPorId(id);
        if (e == null) {
            return false;
        }
        if (e.getLivro() != null && !e.getLivro().isDisponivel()) {
            e.getLivro().setDisponivel(true);
        }
        this.emprestimos.remove(e);
        return true;
    }

    /**
     * @return a lista de emprestimos cadastrados
     */
    public ArrayList<Emprestimo> getEmprestimos() {
        return this.emprestimos;
    }
}
