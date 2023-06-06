/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7;

/**
 *
 * @author ficdev
 */
public class Gato extends Animal2{

    String corPelo;

    public Gato(int p, int a) {
        super(p, a);
    }

    public void falar() {
        miar();
    }

    private void miar() {
        System.out.println("miau!");
    }
}
