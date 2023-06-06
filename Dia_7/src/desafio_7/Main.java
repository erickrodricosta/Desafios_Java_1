/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_7;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta");
        carro.transportarPessoas(4);
        
        Caminhao caminhao = new Caminhao("Volvo", "FH");
        caminhao.transportarCarga(5000.0);
        
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite");
        bicicleta.transportarPessoas(1);
        
        Charrete charrete = new Charrete("Mendes", "Rústica");
        charrete.transportarPessoas(2);
    }
}