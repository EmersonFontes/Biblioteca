package br.com.administracao.Biblioteca.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.administracao.Biblioteca.model.Livro;
import br.com.administracao.Biblioteca.repository.LivroRepository;

@RestController
@RequestMapping("/Livro")
public class LivroController {


    @Autowired
    private LivroRepository livroRepository;


    @GetMapping("/Listar")
    public List<Livro> listar() {return livroRepository.findAll(); }


    
    @PostMapping("/Cadastrar")
    public void incluir(@RequestBody Livro livro){
    	livroRepository.save(livro);
    }

   
    @PutMapping("/Atualizar")
    public void alterar(@RequestBody Livro livro){
    	livroRepository.save(livro);
    }

 
    @DeleteMapping("/Deletar/{id}")
    public void deletar(@PathVariable Integer id){
    	livroRepository.deleteById(id);
    }

    @GetMapping("/Pesquisar/{id}")
    public Optional<Livro> ler(@PathVariable Integer id){
        return livroRepository.findById(id);
    }
}
