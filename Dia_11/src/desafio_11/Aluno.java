/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_11;

/**
 *
 * @author ficdev
 */
import javax.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private double coeficiente;

    // Construtores, getters e setters aqui

    public Aluno() {
    }

    public Aluno(int id, String nome, double coeficiente) {
        this.id = id;
        this.nome = nome;
        this.coeficiente = coeficiente;
    }

    // getters e setters para os atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }
    public void inserirAluno(Aluno aluno) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(aluno);

        em.getTransaction().commit();
        em.close();
    }
}
