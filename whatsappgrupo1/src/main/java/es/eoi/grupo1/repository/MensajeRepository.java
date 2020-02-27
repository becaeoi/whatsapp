package es.eoi.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import es.eoi.grupo1.entity.Mensaje;

@Controller
public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

}
