/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_11;

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] options = { "Inserir Aluno", "Atualizar Coeficiente" };
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Gerenciamento de Alunos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        AlunoDAO alunoDAO = new AlunoDAO();

        if (choice == 0) {
            // Opção: Inserir Aluno
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            double coeficiente = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente do aluno:"));

            Aluno aluno = new Aluno(nome, coeficiente);
            alunoDAO.inserirAluno(aluno);

            JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso!");
        } else if (choice == 1) {
            // Opção: Atualizar Coeficiente
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno:"));
            double novoCoeficiente = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo coeficiente:"));

            alunoDAO.atualizarCoeficiente(id, novoCoeficiente);

            JOptionPane.showMessageDialog(null, "Coeficiente atualizado com sucesso para o aluno de ID " + id);
        } else {
            // Opção inválida
            JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
