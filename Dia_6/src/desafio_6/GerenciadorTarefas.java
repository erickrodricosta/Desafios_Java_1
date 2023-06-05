/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_6;

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa() {
        String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
        String prioridadeStr = JOptionPane.showInputDialog("Digite a prioridade da tarefa (1 - Alta, 2 - Média, 3 - Baixa):");
        int prioridade = Integer.parseInt(prioridadeStr);

        Tarefa tarefa = new Tarefa(descricao, prioridade);
        tarefas.add(tarefa);

        JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Lista de Tarefas:\n");

            for (Tarefa tarefa : tarefas) {
                sb.append("- ").append(tarefa.getDescricao()).append(" (Prioridade: ").append(tarefa.getPrioridade()).append(")\n");
            }

            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    public void marcarTarefaConcluida() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas.");
        } else {
            String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa a ser marcada como concluída:");

            boolean encontrada = false;
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setConcluida(true);
                    JOptionPane.showMessageDialog(null, "Tarefa marcada como concluída.");
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                JOptionPane.showMessageDialog(null, "Tarefa não encontrada.");
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        while (true) {
            String escolhaStr = JOptionPane.showInputDialog(
                    "Selecione uma opção:\n" +
                            "1 - Adicionar tarefa\n" +
                            "2 - Exibir tarefas\n" +
                            "3 - Marcar tarefa como concluída\n" +
                            "4 - Sair"
            );
            int escolha = Integer.parseInt(escolhaStr);

            switch (escolha) {
                case 1:
                    gerenciador.adicionarTarefa();
                    break;
                case 2:
                    gerenciador.exibirTarefas();
                    break;
                case 3:
                    gerenciador.marcarTarefaConcluida();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}
