/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_13;

/**
 *
 * @author ficdev
 */
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AlunoDao {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Aluno aluno = new Aluno();
        aluno.setNome(" Fernanda ");
        Transaction transaction = session.beginTransaction();
        session.persist(aluno);
        transaction.commit();
        TypedQuery< Aluno> query = session.createQuery(" FROM Aluno ", Aluno.class);
        List< Aluno> alunos = query.getResultList();
        for (Aluno alunoI : alunos) {
            System.out.println(alunoI.getNome());
        }
        session.close();
    }
}
