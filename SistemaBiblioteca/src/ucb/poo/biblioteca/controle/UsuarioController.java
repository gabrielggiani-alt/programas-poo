/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca.controle;

import java.util.ArrayList;
import ucb.poo.biblioteca.modelo.Usuario;

/**
 * Controller responsavel pelas operacoes de CRUD da entidade Usuario.
 * Os dados sao armazenados em memoria usando ArrayList.
 */
public class UsuarioController {

    private ArrayList<Usuario> usuarios;
    private int proximoId;

    /**
     * Construtor padrao.
     */
    public UsuarioController() {
        this.usuarios = new ArrayList<>();
        this.proximoId = 1;
    }

    /**
     * Cadastra um novo usuario.
     *
     * @param nome Nome do usuario
     * @param endereco Endereco do usuario
     * @param telefone Telefone do usuario
     * @return o usuario cadastrado
     */
    public Usuario cadastrar(String nome, String endereco, String telefone) {
        Usuario u = new Usuario(this.proximoId, nome, endereco, telefone);
        this.usuarios.add(u);
        this.proximoId++;
        return u;
    }

    /**
     * Lista todos os usuarios cadastrados.
     */
    public void listar() {
        if (this.usuarios.isEmpty()) {
            System.out.println("Nenhum usuario cadastrado.");
            return;
        }
        for (Usuario u : this.usuarios) {
            u.exibirInfo();
        }
    }

    /**
     * Busca um usuario pelo id.
     *
     * @param id Id do usuario procurado
     * @return o usuario encontrado ou null se nao existir
     */
    public Usuario buscarPorId(int id) {
        for (Usuario u : this.usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    /**
     * Atualiza os dados de um usuario existente.
     *
     * @param id Id do usuario a ser atualizado
     * @param nome Novo nome
     * @param endereco Novo endereco
     * @param telefone Novo telefone
     * @return true se atualizou, false se nao encontrou o usuario
     */
    public boolean atualizar(int id, String nome, String endereco, String telefone) {
        Usuario u = buscarPorId(id);
        if (u == null) {
            return false;
        }
        u.setNome(nome);
        u.setEndereco(endereco);
        u.setTelefone(telefone);
        return true;
    }

    /**
     * Exclui um usuario pelo id.
     *
     * @param id Id do usuario a ser excluido
     * @return true se foi excluido, false se nao foi encontrado
     */
    public boolean excluir(int id) {
        Usuario u = buscarPorId(id);
        if (u == null) {
            return false;
        }
        this.usuarios.remove(u);
        return true;
    }

    /**
     * @return a lista de usuarios cadastrados
     */
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }
}
