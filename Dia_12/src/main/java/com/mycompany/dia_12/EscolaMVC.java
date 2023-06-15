/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_12;

/**
 *
 * @author ficdev
 */
public class EscolaMVC {

    public static void main(String[] args) {
        // Modelo
        Aluno aluno = new Aluno(" Fernanda Alves ", 25, " CIA223 ");
        // Visao
        AlunoVisao alunoVisao = new AlunoVisao();
        // Controle
        AlunoControle alunoControle = new AlunoControle(aluno, alunoVisao);
        alunoControle.exibirDetalhesAluno();
        alunoControle.atualizaDadosAluno(" Ana Cruz ", 23, " CIB261 ");
    }
}
