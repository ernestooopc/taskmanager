package com.example.usuarioservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.usuarioservice.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario,String>{

}
