/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_14;

/**
 *
 * @author ficdev
 */
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            // Criação de uma escola
            Escola escola = new Escola();
            escola.setNome("Escola XYZ");

            // Criação de uma turma
            Turma turma = new Turma();
            turma.setNome("Turma A");
            turma.setEscola(escola);

            // Criação de uma disciplina
            Disciplina disciplina = new Disciplina();
            disciplina.setNome("Matemática");
            disciplina.setTurma(turma);

            // Criação de uma avaliação
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.setNome("Prova 1");
            avaliacao.setNota(8.5);
            avaliacao.setDisciplina(disciplina);

            // Persistência das entidades
            session.persist(escola);
            session.persist(turma);
            session.persist(disciplina);
            session.persist(avaliacao);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

