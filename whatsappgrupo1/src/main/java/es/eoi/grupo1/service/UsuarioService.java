package es.eoi.grupo1.service;

import java.util.List;

import es.eoi.grupo1.entity.Usuario;

public interface UsuarioService {

	Usuario findUsario(String id);

	Usuario createUsuario(Usuario usuario);

	void deleteUsuario(Usuario usuario);

	Usuario updateUsuario(Usuario usuario);

	List<Usuario> findAllUsuario();

}