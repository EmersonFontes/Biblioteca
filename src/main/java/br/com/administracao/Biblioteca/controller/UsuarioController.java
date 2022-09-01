package br.com.administracao.Biblioteca.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.administracao.Biblioteca.model.Usuario;
import br.com.administracao.Biblioteca.repository.UsuarioRepository;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/Listar")
    public List<Usuario> listar() {return usuarioRepository.findAll(); }


    @PostMapping("/Cadastrar")
    public void incluir(@RequestBody Usuario usuario){
    	usuarioRepository.save(usuario);
    }

    @PutMapping("/Atualizar")
    public void alterar(@RequestBody Usuario usuario){
    	usuarioRepository.save(usuario);
    }

    @DeleteMapping("/Deletar/{id}")
    public void deletar(@PathVariable Integer id){
    	usuarioRepository.deleteById(id);
    }

    @GetMapping("/Pesquisar/{id}")
    public Optional<Usuario> ler(@PathVariable Integer id){
        return usuarioRepository.findById(id);
    }
}
