package biblioteca.main;

import java.util.List;
import javax.swing.JOptionPane;
import biblioteca.model.Livro;
import biblioteca.model.Usuario;
import biblioteca.service.BibliotecaService;

public class App_2 {

    private static BibliotecaService bibliotecaService = new BibliotecaService();

    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {
            String menu = "Biblioteca\n\n"
                    + "1 - Cadastrar livro\n"
                    + "2 - Cadastrar usuário\n"
                    + "3 - Realizar empréstimo\n"
                    + "4 - Realizar devolução\n"
                    + "5 - Listar livros\n"
                    + "6 - Listar usuários\n"
                    + "7 - Buscar livro\n"
                    + "8 - Buscar usuário\n"
                    + "0 - Sair\n\n"
                    + "Digite a opção desejada:";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    realizarEmprestimo();
                    break;
                case 4:
                    realizarDevolucao();
                    break;
                case 5:
                    listarLivros();
                    break;
                case 6:
                    listarUsuarios();
                    break;
                case 7:
                    buscarLivro();
                    break;
                case 8:
                    buscarUsuario();
                    break;
            }
        }
    }

    private static void cadastrarLivro() {
        String titulo = JOptionPane.showInputDialog("Cadastro de livro\n\nTítulo:");
        String autor = JOptionPane.showInputDialog("Cadastro de livro\n\nAutor:");
        Livro livro = new Livro(titulo, autor);
        bibliotecaService.cadastrarLivro(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");
    }

    private static void cadastrarUsuario() {
        String nome = JOptionPane.showInputDialog("Cadastro de usuário\n\nNome:");
        String email = JOptionPane.showInputDialog("Cadastro de usuário\n\nEmail:");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de usuário\n\nTelefone:"));
        Usuario usuario = new Usuario(nome, email, telefone);
        bibliotecaService.cadastrarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
    }

    private static void realizarEmprestimo() {
        int idLivro = Integer.parseInt(JOptionPane.showInputDialog("Empréstimo de livro\n\nID do livro:"));
        int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Empréstimo de livro\n\nID do usuário:"));
        try {
            bibliotecaService.realizarEmprestimo(idLivro, idUsuario);
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void realizarDevolucao() {
        int idLivro = Integer.parseInt(JOptionPane.showInputDialog("Devolução de livro\n\nID do livro:"));
        int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Devolução de livro\n\nID do usuário:"));
        try {
            bibliotecaService.realizarDevolucao(idLivro, idUsuario);
            JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void listarLivros() {
        List<Livro> livros = bibliotecaService.listarLivros();
    StringBuilder mensagem = new StringBuilder();
    mensagem.append("Lista de livros:\n\n");
    for (Livro livro : livros) {
        mensagem.append("ID: ").append(livro.getId()).append("\n");
        mensagem.append("Título: ").append(livro.getTitulo()).append("\n");
        mensagem.append("Autor: ").append(livro.getAutor()).append("\n");
        mensagem.append("Ano de Publicação: ").append(livro.getAnoPublicacao()).append("\n");
        mensagem.append("Disponível: ").append(livro.isDisponivel()).append("\n");
        mensagem.append("\n");
    }
    JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    private static void listarUsuarios() {
        List<Usuario> usuarios = bibliotecaService.listarUsuarios();
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Lista de usuários:\n\n");
        for (Usuario usuario : usuarios) {
            mensagem.append(usuario.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    private static void buscarLivro() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Busca de livro\n\nID do livro:"));
        Livro livro = bibliotecaService.buscarLivro(id);
        if (livro != null) {
            JOptionPane.showMessageDialog(null, livro.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado.");
        }
    }

    private static void buscarUsuario() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Busca de usuário\n\nID do usuário:"));
        Usuario usuario = bibliotecaService.buscarUsuario(id);
        if (usuario != null) {
            JOptionPane.showMessageDialog(null, usuario.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
        }
    }
}
