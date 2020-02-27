package es.eoi.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import es.eoi.grupo1.entity.Usuario;


@Controller
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
