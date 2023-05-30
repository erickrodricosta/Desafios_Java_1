/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_2;

/**
 *
 * @author ficdev
 */
import java.util.Scanner;

public class EntradaDeDados {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Digite seu nome :");
        String nome = input.next();
        
        System.out.print ( "Digite sua idade:");
        int idade = input.nextInt();
        System.out.println ("Seu nome é " + nome + " e sua idade é " + idade);
    }
}
