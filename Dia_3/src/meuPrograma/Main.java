/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuPrograma;

import geometria.Retangulo;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(5, 10);
        
        //calcula a área e o perimetro
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        //imprime os resultados 
        System. out.println("Área do retangulo " + area);
        System. out.println("Perimetro do retangulo " + perimetro);
    }
}
