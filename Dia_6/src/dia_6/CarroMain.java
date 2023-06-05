/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_6;

/**
 *
 * @author ficdev
 */
import java.util.LinkedList;
import java.util.Queue;

public class CarroMain {

    public static void main(String[] args) {
        Queue<Carro> minhaFila = new LinkedList<>();
        minhaFila.add(new Carro("Ford", "Mustang", 2020));
        minhaFila.add(new Carro("Chevrolet", "Camaro", 2021));
        minhaFila.add(new Carro("Dodge", "Charger", 2019));

        Carro carroRemovido = minhaFila.remove();
        System.out.println("Carro removido: " + carroRemovido);
    }
}
