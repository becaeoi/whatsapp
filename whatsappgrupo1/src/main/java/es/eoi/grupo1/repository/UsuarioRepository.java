package es.eoi.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.grupo1.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
