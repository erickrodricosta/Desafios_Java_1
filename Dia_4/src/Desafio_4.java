/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class Desafio_4 {

    public static void main(String[] args) {
        String menu = "Opções: \n"
                + "1. Impar ou Par\n"
                + "2. Primo\n";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu + "Digite a opção desejada: "));
        switch (opcao) {
            case 1:
                String numeroStr = JOptionPane.showInputDialog(null, "Digite um número inteiro:");
                int numero = Integer.parseInt(numeroStr);

                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "O número é par!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número é ímpar!");
                }
                break;
            case 2:
                numeroStr = JOptionPane.showInputDialog(null, "Digite um número inteiro:");
                int n = Integer.parseInt(numeroStr);
                while (n <= 0) {
                    numeroStr = JOptionPane.showInputDialog(null, "Digite um número inteiro:");
                    n = Integer.parseInt(numeroStr);
                }
                if (n == 1) {
                    JOptionPane.showMessageDialog(null, "O número não é primo!");
                } else {
                    int resultado = 0;
                    for (int i = 2; i < n; i++) {
                        if ((n % i) == 0) {
                            resultado++;
                            break;
                        }
                    }
                    if (resultado == 0) {
                        JOptionPane.showMessageDialog(null, "O número é primo!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O número não é primo!");
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }
}
