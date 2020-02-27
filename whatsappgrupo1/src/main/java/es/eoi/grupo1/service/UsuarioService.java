package es.eoi.grupo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.grupo1.entity.Usuario;
import es.eoi.grupo1.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	public Usuario findUsario (String id) {
		return repository.findById(id).get();
	}
	
	public Usuario createUsuario (Usuario usuario) {
		return repository.save(usuario);
	}
	
	public void deleteUsuario (Usuario usuario) {
		repository.delete(usuario);
	}
}
