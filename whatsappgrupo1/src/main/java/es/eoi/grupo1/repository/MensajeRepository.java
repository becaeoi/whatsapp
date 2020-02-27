package es.eoi.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.eoi.grupo1.entity.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

}
