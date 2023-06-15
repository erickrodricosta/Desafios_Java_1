/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_12;

/**
 *
 * @author ficdev
 */
public class AlunoControle {

    private Aluno aluno;
    private AlunoVisao alunoVisao;

    public AlunoControle(Aluno aluno, AlunoVisao alunoVisao) {
        this.aluno = aluno;
        this.alunoVisao = alunoVisao;
    }

    public void atualizaDadosAluno(String nome, int idade, String matricula) {
        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setMatricula(matricula);
        exibirDetalhesAluno();

    }

    public void exibirDetalhesAluno() {
        String nome = aluno.getNome();
        int idade = aluno.getIdade();
        String matricula = aluno.getMatricula();
        alunoVisao.exibirDadosAluno(nome, idade,
                matricula);
    }
}
