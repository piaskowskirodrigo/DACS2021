package br.univille.rodrigodacs2021.service.impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.univille.rodrigodacs2021.model.Usuario;
import br.univille.rodrigodacs2021.repository.UsuarioRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    private UsuarioRepository repository;

    public Usuario buscaUsuarioSenha(String nomeUsuario, String senhaUsuario){
        return repository.findByUsuarioAndSenha(nomeUsuario, senhaUsuario);
    }

    @Override
    public UserDetails loadUserByUsername(String nomeUsuario) throws UsernameNotFoundException {
        Usuario usuario = repository.findByUsuario(nomeUsuario);
        return new User(usuario.getUsuario(),usuario.getSenha(), new ArrayList<>());
    }
    
}