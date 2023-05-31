/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_3.main;

import desafio_3.esfera.Esfera;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args){
        Esfera esfera = new Esfera(5.0); //passa o valor 5 como parametro

        double volume = esfera.calcularVolume(); //chama o metodo clcularVolume e atribui o resultado em volume

        System.out.println("O volume é: " + volume); //imprime o valor de volume
    }
}
