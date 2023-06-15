/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_12;

/**
 *
 * @author ficdev
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AlunoTesteDT {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EscolaPU");
        EntityManager em = factory.createEntityManager();

        AlunoDT aluno = new AlunoDT();
        aluno.setNome("João");
        aluno.setIdade(20);
        aluno.setMatricula("20210001");

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(aluno);
        tx.commit();

        em.close();
        factory.close();
    }
}
