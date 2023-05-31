/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_3.esfera;

/**
 *
 * @author ficdev
 */
public class Esfera {
    //cria os atributos
    private double raio;
    private double valor = 4.0/3.0;
    private double pi = 3.1415;
    private double cubo ;

    public Esfera(double raio) {
        //declara oque será passado por parametro
        this.raio = raio; 
        this.cubo = raio*raio*raio;
        
    }

    public double calcularVolume() {
        double conta =  valor * pi * cubo; //calcula o volume da esfera
        return conta; //retorna o valor de conta
    }
}
