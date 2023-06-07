/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_8;

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class TryExemplo_2 {

    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

            int resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato inválido. Certifique-se de digitar números inteiros.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
    }
}


