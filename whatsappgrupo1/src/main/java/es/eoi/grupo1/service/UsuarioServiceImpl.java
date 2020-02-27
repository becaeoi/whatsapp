package es.eoi.grupo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import es.eoi.grupo1.entity.Usuario;
import es.eoi.grupo1.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	@Override
	public Usuario findUsario (String id) {
		return repository.findById(id).get();
	}
	
	@Override
	public Usuario createUsuario (Usuario usuario) {
		return repository.save(usuario);
	}
	
	@Override
	public void deleteUsuario (Usuario usuario) {
		repository.delete(usuario);
	}
	
	@Override
	public Usuario updateUsuario (Usuario usuario) {
		return repository.save(usuario);
	}
	
	@Override
	public List<Usuario> findAllUsuario() {
		return repository.findAll();
	}
	 
}
