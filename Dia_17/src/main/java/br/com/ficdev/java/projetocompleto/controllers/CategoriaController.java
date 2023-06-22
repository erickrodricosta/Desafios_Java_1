package br.com.ficdev.java.projetocompleto.controllers;


import br.com.ficdev.java.projetocompleto.models.Categoria;
import br.com.ficdev.java.projetocompleto.models.Produto;
import br.com.ficdev.java.projetocompleto.repositories.CategoriaRepository;
import br.com.ficdev.java.projetocompleto.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {


    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    public List<Categoria> listarTodasCategorias() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> listarCategoriaById(@PathVariable Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if (categoria != null) {
            return ResponseEntity.ok(categoria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Categoria> cadastrarCategoria(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoria);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Categoria> alterarCategoria(@PathVariable Long id, @RequestBody Categoria novaCategoria) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if (categoria != null) {
            categoria.setNome(novaCategoria.getNome());
            categoria.setCodigo(novaCategoria.getCodigo());

            categoriaRepository.save(categoria);
            return ResponseEntity.ok(categoria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if (categoria != null) {
            categoriaRepository.delete(categoria);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
