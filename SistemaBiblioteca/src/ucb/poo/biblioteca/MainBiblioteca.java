/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.biblioteca;

import java.util.Scanner;
import ucb.poo.biblioteca.controle.AutorController;
import ucb.poo.biblioteca.controle.EmprestimoController;
import ucb.poo.biblioteca.controle.LivroController;
import ucb.poo.biblioteca.controle.UsuarioController;
import ucb.poo.biblioteca.modelo.Autor;
import ucb.poo.biblioteca.modelo.Emprestimo;
import ucb.poo.biblioteca.modelo.Livro;
import ucb.poo.biblioteca.modelo.Usuario;

/**
 * Classe principal do Sistema de Gerenciamento de Biblioteca.
 * Possui o menu de navegacao via linha de comando (CLI).
 */
public class MainBiblioteca {

    private static AutorController autorController = new AutorController();
    private static LivroController livroController = new LivroController();
    private static UsuarioController usuarioController = new UsuarioController();
    private static EmprestimoController emprestimoController = new EmprestimoController();
    private static Scanner sc = new Scanner(System.in);

    /**
     * Metodo principal. Mostra o menu inicial em loop ate o usuario sair.
     *
     * @param args argumentos da linha de comando (nao utilizado)
     */
    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("");
            System.out.println("=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1 - Autores");
            System.out.println("2 - Livros");
            System.out.println("3 - Usuarios");
            System.out.println("4 - Emprestimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    menuAutor();
                    break;
                case 2:
                    menuLivro();
                    break;
                case 3:
                    menuUsuario();
                    break;
                case 4:
                    menuEmprestimo();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    /**
     * Le um numero inteiro do teclado de forma segura.
     *
     * @return o inteiro lido, ou -1 se o usuario digitar algo invalido
     */
    private static int lerInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * Menu CRUD da entidade Autor.
     */
    private static void menuAutor() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("");
            System.out.println("=== AUTORES ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Excluir");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Nacionalidade: ");
                    String nac = sc.nextLine();
                    System.out.print("Data de nascimento (dd/mm/aaaa): ");
                    String data = sc.nextLine();
                    Autor a = autorController.cadastrar(nome, nac, data);
                    System.out.println("Autor cadastrado com ID " + a.getId() + ".");
                    break;
                case 2:
                    autorController.listar();
                    break;
                case 3:
                    System.out.print("ID do autor: ");
                    int idBusca = lerInt();
                    Autor encontrado = autorController.buscarPorId(idBusca);
                    if (encontrado == null) {
                        System.out.println("Autor nao encontrado.");
                    } else {
                        encontrado.exibirInfo();
                    }
                    break;
                case 4:
                    System.out.print("ID do autor a atualizar: ");
                    int idAtualizar = lerInt();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Nova nacionalidade: ");
                    String novaNac = sc.nextLine();
                    System.out.print("Nova data de nascimento: ");
                    String novaData = sc.nextLine();
                    boolean ok = autorController.atualizar(idAtualizar, novoNome, novaNac, novaData);
                    if (ok) {
                        System.out.println("Autor atualizado.");
                    } else {
                        System.out.println("Autor nao encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("ID do autor a excluir: ");
                    int idExcluir = lerInt();
                    boolean excluiu = autorController.excluir(idExcluir);
                    if (excluiu) {
                        System.out.println("Autor excluido.");
                    } else {
                        System.out.println("Autor nao encontrado.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    /**
     * Menu CRUD da entidade Livro.
     */
    private static void menuLivro() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("");
            System.out.println("=== LIVROS ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Excluir");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Ano de publicacao: ");
                    int ano = lerInt();
                    System.out.print("ID do autor: ");
                    int idAutor = lerInt();
                    Autor autor = autorController.buscarPorId(idAutor);
                    if (autor == null) {
                        System.out.println("Autor nao encontrado. Cadastre o autor primeiro.");
                        break;
                    }
                    Livro l = livroController.cadastrar(titulo, isbn, ano, autor);
                    System.out.println("Livro cadastrado com ID " + l.getId() + ".");
                    break;
                case 2:
                    livroController.listar();
                    break;
                case 3:
                    System.out.print("ID do livro: ");
                    int idBusca = lerInt();
                    Livro encontrado = livroController.buscarPorId(idBusca);
                    if (encontrado == null) {
                        System.out.println("Livro nao encontrado.");
                    } else {
                        encontrado.exibirInfo();
                    }
                    break;
                case 4:
                    System.out.print("ID do livro a atualizar: ");
                    int idAtualizar = lerInt();
                    System.out.print("Novo titulo: ");
                    String novoTitulo = sc.nextLine();
                    System.out.print("Novo ISBN: ");
                    String novoIsbn = sc.nextLine();
                    System.out.print("Novo ano de publicacao: ");
                    int novoAno = lerInt();
                    System.out.print("Novo ID do autor: ");
                    int novoIdAutor = lerInt();
                    Autor novoAutor = autorController.buscarPorId(novoIdAutor);
                    if (novoAutor == null) {
                        System.out.println("Autor nao encontrado.");
                        break;
                    }
                    boolean ok = livroController.atualizar(idAtualizar, novoTitulo, novoIsbn, novoAno, novoAutor);
                    if (ok) {
                        System.out.println("Livro atualizado.");
                    } else {
                        System.out.println("Livro nao encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("ID do livro a excluir: ");
                    int idExcluir = lerInt();
                    boolean excluiu = livroController.excluir(idExcluir);
                    if (excluiu) {
                        System.out.println("Livro excluido.");
                    } else {
                        System.out.println("Livro nao encontrado.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    /**
     * Menu CRUD da entidade Usuario.
     */
    private static void menuUsuario() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("");
            System.out.println("=== USUARIOS ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Excluir");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Endereco: ");
                    String end = sc.nextLine();
                    System.out.print("Telefone: ");
                    String tel = sc.nextLine();
                    Usuario u = usuarioController.cadastrar(nome, end, tel);
                    System.out.println("Usuario cadastrado com ID " + u.getId() + ".");
                    break;
                case 2:
                    usuarioController.listar();
                    break;
                case 3:
                    System.out.print("ID do usuario: ");
                    int idBusca = lerInt();
                    Usuario encontrado = usuarioController.buscarPorId(idBusca);
                    if (encontrado == null) {
                        System.out.println("Usuario nao encontrado.");
                    } else {
                        encontrado.exibirInfo();
                    }
                    break;
                case 4:
                    System.out.print("ID do usuario a atualizar: ");
                    int idAtualizar = lerInt();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo endereco: ");
                    String novoEnd = sc.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTel = sc.nextLine();
                    boolean ok = usuarioController.atualizar(idAtualizar, novoNome, novoEnd, novoTel);
                    if (ok) {
                        System.out.println("Usuario atualizado.");
                    } else {
                        System.out.println("Usuario nao encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("ID do usuario a excluir: ");
                    int idExcluir = lerInt();
                    boolean excluiu = usuarioController.excluir(idExcluir);
                    if (excluiu) {
                        System.out.println("Usuario excluido.");
                    } else {
                        System.out.println("Usuario nao encontrado.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    /**
     * Menu CRUD da entidade Emprestimo.
     */
    private static void menuEmprestimo() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("");
            System.out.println("=== EMPRESTIMOS ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar data de emprestimo");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Excluir");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID do livro: ");
                    int idLivro = lerInt();
                    Livro livro = livroController.buscarPorId(idLivro);
                    if (livro == null) {
                        System.out.println("Livro nao encontrado.");
                        break;
                    }
                    System.out.print("ID do usuario: ");
                    int idUsuario = lerInt();
                    Usuario usuario = usuarioController.buscarPorId(idUsuario);
                    if (usuario == null) {
                        System.out.println("Usuario nao encontrado.");
                        break;
                    }
                    System.out.print("Data do emprestimo (dd/mm/aaaa): ");
                    String dataEmp = sc.nextLine();
                    Emprestimo emp = emprestimoController.cadastrar(livro, usuario, dataEmp);
                    if (emp == null) {
                        System.out.println("Esse livro ja esta emprestado.");
                    } else {
                        System.out.println("Emprestimo cadastrado com ID " + emp.getId() + ".");
                    }
                    break;
                case 2:
                    emprestimoController.listar();
                    break;
                case 3:
                    System.out.print("ID do emprestimo: ");
                    int idBusca = lerInt();
                    Emprestimo encontrado = emprestimoController.buscarPorId(idBusca);
                    if (encontrado == null) {
                        System.out.println("Emprestimo nao encontrado.");
                    } else {
                        encontrado.exibirInfo();
                    }
                    break;
                case 4:
                    System.out.print("ID do emprestimo: ");
                    int idAtualizar = lerInt();
                    System.out.print("Nova data de emprestimo: ");
                    String novaData = sc.nextLine();
                    boolean ok = emprestimoController.atualizar(idAtualizar, novaData);
                    if (ok) {
                        System.out.println("Emprestimo atualizado.");
                    } else {
                        System.out.println("Emprestimo nao encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("ID do emprestimo: ");
                    int idDevolver = lerInt();
                    System.out.print("Data de devolucao: ");
                    String dataDev = sc.nextLine();
                    boolean devolveu = emprestimoController.devolver(idDevolver, dataDev);
                    if (devolveu) {
                        System.out.println("Devolucao registrada.");
                    } else {
                        System.out.println("Emprestimo nao encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("ID do emprestimo a excluir: ");
                    int idExcluir = lerInt();
                    boolean excluiu = emprestimoController.excluir(idExcluir);
                    if (excluiu) {
                        System.out.println("Emprestimo excluido.");
                    } else {
                        System.out.println("Emprestimo nao encontrado.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }
}
