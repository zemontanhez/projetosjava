package br.montanhez.spring02.repo;

import br.montanhez.spring02.model.Usuario;
import org.springframework.data.repository.CrudRepository;

// CRUD = Create, Read, Update, Delete
public interface UsuarioRepo extends CrudRepository <Usuario, Integer> {
    public Usuario findByEmailAndSenha(String email,String senha);
}



