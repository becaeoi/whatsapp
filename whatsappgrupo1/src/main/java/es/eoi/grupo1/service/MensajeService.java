package es.eoi.grupo1.service;

import java.util.List;

import es.eoi.grupo1.entity.Mensaje;

public interface MensajeService {

	Mensaje createMensaje(Mensaje mensaje);

	void deleteMensaje(Mensaje mensaje);

	Mensaje updateMensaje(Mensaje mensaje);

	List<Mensaje> findAllMensajes();

}