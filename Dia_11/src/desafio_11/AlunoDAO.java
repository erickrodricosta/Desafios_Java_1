/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_11;

/**
 *
 * @author ficdev
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoDAO {
    private EntityManagerFactory emf;

    public AlunoDAO() {
        emf = Persistence.createEntityManagerFactory("GaleriaPU2");
    }

    public void atualizarCoeficiente(int id, double novoCoeficiente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Aluno aluno = em.find(Aluno.class, id);
        if (aluno != null) {
            aluno.setCoeficiente(novoCoeficiente);
        }

        em.getTransaction().commit();
        em.close();
    }
}
