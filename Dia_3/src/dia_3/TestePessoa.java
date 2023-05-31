/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_3;

/**
 *
 * @author ficdev
 */
public class TestePessoa {
    public static void main(String[] args){
        //instanciação da classe pessoa
        Pessoa p1 = new Pessoa();
        
        //atribuição de valores
        p1.setNome("João");
        p1.setIdade(30);
        
        //exibição dos vlaores
        System.out.println("Nome:" + p1.getNome());
        System.out.println("Idade:" + p1.getIdade());
    }
}
