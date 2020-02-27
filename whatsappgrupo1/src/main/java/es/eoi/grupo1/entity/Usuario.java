package es.eoi.grupo1.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
public class Usuario {
	int id;
	String telefono;
	String nombre;
	List<Mensaje> leido;
	List<Mensaje> enviado;
}
