/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_2;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class Desafio_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Digite um número :");
        float n1 = Float.parseFloat(input.next());


        System.out.print("Digite um número:");
        float n2 = Float.parseFloat(input.next());

        System.out.println("A média é:" + (n1 + n2) / 2);
    }

}
