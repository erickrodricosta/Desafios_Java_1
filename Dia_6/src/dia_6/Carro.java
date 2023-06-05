/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_6;

/**
 *
 * @author ficdev
 */
public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Carro{"
                + "marca='" + marca + '\''
                + ", modelo='" + modelo + '\''
                + ", ano=" + ano
                + '}';
    }
}
