/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
import java.util.Scanner;

public class VerificaPrimo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número :");
        int n = s.nextInt();
        while (n <= 0) {
            System.out.print("Digite um número :");
            n = s.nextInt();
        }
        if (n == 1) {
            System.out.println("O número não é primo!");
        } else {
            int resultado = 0;
            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    resultado++;
                    break;
                }
            }
            if (resultado == 0) {
                System.out.println("O número é primo!");
            } else {
                System.out.println("O número não é primo!");
            }
        }
        s.close();
    }
}
