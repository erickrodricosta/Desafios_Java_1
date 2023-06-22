/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ficdev.java.projetocompleto.repositories;

import br.com.ficdev.java.projetocompleto.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


/**
 *
 * @author admin
 */
@Repository
@EnableJpaRepositories
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
