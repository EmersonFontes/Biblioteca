package br.com.administracao.Biblioteca.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.administracao.Biblioteca.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
