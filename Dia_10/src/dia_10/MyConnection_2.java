/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_10;

/**
 *
 * @author ficdev
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection_2 {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // registra o driver
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ficdatabase", "postgres", "123456"); // abre conexão
            Statement stmt = conn.createStatement();

            boolean continuar = true;

            while (continuar) {
                // Exibe uma caixa de diálogo para escolher a opção desejada
                String[] options = {"Adicionar dados", "Exibir dados"};
                int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                if (choice == 0) {
                    // Opção para adicionar dados

                    // Exibe uma caixa de diálogo para obter os dados a serem inseridos
                    String nome = JOptionPane.showInputDialog("Digite o nome da escola:");
                    String cep = JOptionPane.showInputDialog("Digite o CEP da escola:");

                    // Monta o comando SQL para inserir os dados
                    String sql = "INSERT INTO escola (nomeescola, cepescola) VALUES ('" + nome + "', '" + cep + "')";

                    // Executa o comando SQL de inserção
                    stmt.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "Dados adicionados com sucesso!");
                } else if (choice == 1) {
                    // Opção para exibir dados

                    // Executa a consulta para obter todos os dados
                    ResultSet rs = stmt.executeQuery("SELECT * FROM escola");

                    StringBuilder dados = new StringBuilder();
                    while (rs.next()) { // manipula resultado
                        int id = rs.getInt("idescola");
                        String nomeEscola = rs.getString("nomeescola");
                        String cepEscola = rs.getString("cepescola");
                        dados.append(id).append(", ").append(nomeEscola).append(", ").append(cepEscola).append("\n");
                    }

                    JOptionPane.showMessageDialog(null, dados.toString());
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
