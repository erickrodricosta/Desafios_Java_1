/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class CadastroAlunos {
    public static void main(String[] args) {
        // Definir o tamanho máximo do array de alunos
        int tamanhoMaximo = 100;

        // Criar arrays para armazenar os dados dos alunos
        String[] nomes = new String[tamanhoMaximo];
        int[] idades = new int[tamanhoMaximo];
        double[] notas = new double[tamanhoMaximo];

        // Variável para controlar o índice do próximo aluno a ser cadastrado
        int indice = 0;

        // Loop para cadastrar alunos
        while (true) {
            // Obter os dados do aluno
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno:"));
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do aluno:"));

            // Armazenar os dados do aluno no array
            nomes[indice] = nome;
            idades[indice] = idade;
            notas[indice] = nota;

            // Verificar se o usuário deseja continuar cadastrando alunos
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                break;
            }

            // Incrementar o índice para o próximo aluno
            indice++;
        }

        // Exibir a listagem dos alunos cadastrados
        StringBuilder listaAlunos = new StringBuilder("Listagem de Alunos:\n");
        double somaNotas = 0.0;
        for (int i = 0; i <= indice; i++) {
            listaAlunos.append("Nome: ").append(nomes[i]).append("\n");
            listaAlunos.append("Idade: ").append(idades[i]).append("\n");
            listaAlunos.append("Nota: ").append(notas[i]).append("\n\n");
            somaNotas += notas[i];
        }

        // Calcular a média das notas
        double mediaNotas = somaNotas / (indice + 1);

        // Exibir a listagem e a média das notas
        JOptionPane.showMessageDialog(null, listaAlunos.toString() + "Média das Notas: " + mediaNotas);
    }
}

