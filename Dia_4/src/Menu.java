/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        int opcao;
        double preco = 0.0; 
        String menu = "Menu de bebidas: \n"
                + "1. Refrigerante\n"
                + "2. Suco\n"
                + "3. Água\n"
                + "4. Chá\n";
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu + "Digite a opção desejada: "));
        switch (opcao) {
            case 1:
                preco = 4.50;
                break;
            case 2:
                preco = 5.00;
                break;
            case 3:
                preco = 2.00;
                break;
            case 4:
                preco = 3.00;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
        if (preco != 0.0) {
            JOptionPane.showMessageDialog(null, String.format("O preço preço da bebida escolhida é R$%.2f", preco));
        }
    }
}
