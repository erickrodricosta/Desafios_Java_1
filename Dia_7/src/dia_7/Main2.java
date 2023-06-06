/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7;

/**
 *
 * @author ficdev
 */
public class Main2 {

    public static void main(String[] args) {
        Animal2 meusAnimais[] = new Animal2[10];
        meusAnimais[0] = new Animal2(4, 30);
        meusAnimais[1] = new Cachorro2(4, 15);
        meusAnimais[2] = new Gato(4, 10);
        meusAnimais[0].falar();
        meusAnimais[1].falar();
        meusAnimais[2].falar();
    }
}
