/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_11_maven;

/**
 *
 * @author ficdev
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteService {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Ana Paula");

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ClientePU");
        EntityManager entityManager =
                entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

