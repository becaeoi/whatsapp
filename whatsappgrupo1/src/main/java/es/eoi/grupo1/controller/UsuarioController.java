package es.eoi.grupo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.grupo1.dto.UsuarioDto;
import es.eoi.grupo1.entity.Usuario;
import es.eoi.grupo1.service.UsuarioService;

@RestController
@RequestMapping(value = "/Usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public Usuario findUsuario(@RequestParam(value = "id")int id) {
		return service.findUsarioById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return service.createUsuario(usuario);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteUsuario(@RequestBody Usuario usuario) {
		service.deleteUsuario(usuario);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Usuario UpdateUsuario(@RequestBody Usuario usuario) {
		return service.updateUsuario(usuario);
	}
	
	public List<Usuario> findAllUsuarios() {
		return service.findAllUsuario();
	}
	

}
