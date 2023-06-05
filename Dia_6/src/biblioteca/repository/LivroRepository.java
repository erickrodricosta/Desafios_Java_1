/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.repository;

/**
 *
 * @author ficdev
 */
import java.util.ArrayList;
import java.util.List;
import biblioteca.model.Livro;

public class LivroRepository {

    private List<Livro> livros = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrar(Livro livro) {
        livro.setId(proximoId++);
        livros.add(livro);
    }

    public List<Livro> buscarTodos() {
        return livros;
    }

    public Livro buscarPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
}

