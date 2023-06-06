/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7;

/**
 *
 * @author ficdev
 */
public class Main_2 {

    public static void main(String[] args) {
        Animal meusAnimais[] = new Animal[10];
        meusAnimais[0] = new Animal(4, 30);
        // adiciona um Cachorro no vetor de animais, pois Cachorro É_UM Animal
        meusAnimais[1] = new Cachorro(4, 15, 2);
    }
}
