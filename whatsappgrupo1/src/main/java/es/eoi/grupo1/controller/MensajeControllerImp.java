package es.eoi.grupo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import es.eoi.grupo1.entity.Mensaje;
import es.eoi.grupo1.service.MensajeService;

public class MensajeControllerImp {
	@Autowired
	MensajeService service;
	
	
	public Mensaje createMensaje (@PathVariable Mensaje mensaje){
		return service.createMensaje(mensaje);
	}
	
	public void deleteMensaje (@PathVariable Mensaje mensaje) {
		service.deleteMensaje(mensaje);
	}
	
	public Mensaje updateMensaje (@PathVariable Mensaje mensaje) {
		return service.updateMensaje(mensaje);
	}
	
	public List<Mensaje> findAllMensajes() {
		return service.findAllMensajes();
	}
}
