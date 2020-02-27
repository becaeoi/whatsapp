package es.eoi.grupo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.grupo1.entity.Mensaje;
import es.eoi.grupo1.repository.MensajeRepository;

@Service
public class MensajeServiceImpl implements MensajeService {
	
	@Autowired
	MensajeRepository repository;
	
	@Override
	public Mensaje createMensaje (Mensaje mensaje){
		return repository.save(mensaje);
	}
	
	@Override
	public void deleteMensaje (Mensaje mensaje) {
		repository.delete(mensaje);
	}
	
	@Override
	public Mensaje updateMensaje (Mensaje mensaje) {
		return repository.save(mensaje);
	}
	
	@Override
	public List<Mensaje> findAllMensajes() {
		return repository.findAll();
	}
}
