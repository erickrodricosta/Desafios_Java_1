/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_7;

/**
 *
 * @author ficdev
 */
class Transporte {
    // Propriedades
    private String marca;
    private String modelo;
    
    // Construtor
    public Transporte(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Comportamento para transportar pessoas
    public void transportarPessoas(int numPessoas) {
        System.out.println("Transportando " + numPessoas + " pessoas");
    }
    
    // Comportamento para transportar cargas
    public void transportarCarga(double pesoCarga) {
        System.out.println("Transportando carga de " + pesoCarga + " kg");
    }
}