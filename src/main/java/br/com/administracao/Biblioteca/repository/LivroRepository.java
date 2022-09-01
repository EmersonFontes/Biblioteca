package br.com.administracao.Biblioteca.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.administracao.Biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
