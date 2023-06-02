/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_5;

/**
 *
 * @author ficdev
 */
public class Usuario {
    private String nome;
    private ContaBancaria conta;

    public Usuario(String nome, String numeroConta, double saldoInicial) {
        this.nome = nome;
        this.conta = new ContaBancaria(numeroConta, saldoInicial);
    }

    public void realizarDeposito(double valor) {
        conta.depositar(valor);
    }

    public void realizarSaque(double valor) {
        conta.sacar(valor);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "123456789", 1000.0);
        usuario.realizarDeposito(500.0);
        usuario.realizarSaque(200.0);
    }
}

