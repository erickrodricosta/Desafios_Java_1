/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_10;

/**
 *
 * @author ficdev
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Postgres {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // registra o driver
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ficdatabase", "postgres", "123456"); // abre conexão
            Statement stmt = conn.createStatement();

            boolean continuar = true;

            while (continuar) {
                // Exibe uma caixa de diálogo para escolher a tabela
                String[] tableOptions = {"escola", "professores"};
                int tableChoice = JOptionPane.showOptionDialog(null, "Escolha a tabela", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tableOptions, tableOptions[0]);

                String table;
                String idColumn;
                String nomeColumn;
                String cepColumn;

                if (tableChoice == 0) {
                    table = "escola";
                    idColumn = "idescola";
                    nomeColumn = "nomeescola";
                    cepColumn = "cepescola";
                } else {
                    table = "professores";
                    idColumn = "idprofessor";
                    nomeColumn = "nomeprofessor";
                    cepColumn = ""; // A tabela "professores" não possui a coluna "cepescola"
                }

                // Exibe uma caixa de diálogo para escolher a ação desejada
                String[] options = {"Adicionar dados", "Exibir dados", "Atualizar dados", "Excluir dados"};
                int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                if (choice == 0) {
                    // Opção para adicionar dados

                    // Exibe uma caixa de diálogo para obter os dados a serem inseridos
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    String cep = "";
                    if (tableChoice == 0) {
                        cep = JOptionPane.showInputDialog("Digite o CEP:");
                    }

                    // Monta o comando SQL para inserir os dados
                    String sql;
                    if (tableChoice == 0) {
                        sql = "INSERT INTO " + table + " (nomeescola, cepescola) VALUES ('" + nome + "', '" + cep + "')";
                    } else {
                        sql = "INSERT INTO " + table + " (nomeprofessor) VALUES ('" + nome + "')";
                    }

                    // Executa o comando SQL de inserção
                    stmt.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "Dados adicionados com sucesso!");
                } else if (choice == 1 || choice == 2 || choice == 3) {
                    // Opções para exibir, atualizar ou excluir dados

                    // Executa a consulta para obter todos os dados da tabela selecionada
                    ResultSet rs = stmt.executeQuery("SELECT * FROM " + table);

                    StringBuilder dados = new StringBuilder();
                    while (rs.next()) { // manipula resultado
                        int id = rs.getInt(idColumn);
                        String nome = rs.getString(nomeColumn);
                        String cep = "";
                        if (tableChoice == 0) {
                            cep = rs.getString(cepColumn);
                        }
                        dados.append(id).append(", ").append(nome).append(", ").append(cep).append("\n");
                    }

                    JOptionPane.showMessageDialog(null, dados.toString());

                    if (choice == 2) {
                        // Opção para atualizar dados

                        // Exibe uma caixa de diálogo para obter o ID do registro a ser atualizado
                        int idToUpdate = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do registro a ser atualizado:"));

                        // Exibe uma caixa de diálogo para obter os novos dados
                        String nome = JOptionPane.showInputDialog("Digite o novo nome:");
                        String cep = "";
                        if (tableChoice == 0) {
                            cep = JOptionPane.showInputDialog("Digite o novo CEP:");
                        }

                        // Monta o comando SQL para atualizar os dados
                        String sql;
                        if (tableChoice == 0) {
                            sql = "UPDATE " + table + " SET nomeescola = '" + nome + "', cepescola = '" + cep + "' WHERE " + idColumn + " = " + idToUpdate;
                        } else {
                            sql = "UPDATE " + table + " SET nomeprofessor = '" + nome + "' WHERE " + idColumn + " = " + idToUpdate;
                        }

                        // Executa o comando SQL de atualização
                        int rowsAffected = stmt.executeUpdate(sql);

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado para atualização.");
                        }
                    } else if (choice == 3) {
                        // Opção para excluir dados

                        // Exibe uma caixa de diálogo para obter o ID do registro a ser excluído
                        int idToDelete = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do registro a ser excluído:"));

                        // Monta o comando SQL para excluir o registro
                        String sql = "DELETE FROM " + table + " WHERE " + idColumn + " = " + idToDelete;

                        // Executa o comando SQL de exclusão
                        int rowsAffected = stmt.executeUpdate(sql);

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado para exclusão.");
                        }
                    }
                }

                // Exibe uma caixa de diálogo para perguntar se o usuário deseja sair ou continuar
                String[] continueOptions = {"Continuar", "Sair"};
                int continueChoice = JOptionPane.showOptionDialog(null, "Deseja continuar?", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, continueOptions, continueOptions[0]);

                if (continueChoice == 1) {
                    continuar = false; // Sai do loop
                }
            }

            conn.close(); // fecha conexão
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
