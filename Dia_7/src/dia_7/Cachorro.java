/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7;

/**
 *
 * @author ficdev
 */
public class Cachorro extends Animal{
    int corPelo;
    public Cachorro(int p, int a){
        super(p,a);
    }
    public Cachorro (int p, int a, int corPelo){
        super(p,a);
        this.corPelo = corPelo;
    }
}
