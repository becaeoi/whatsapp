package es.eoi.grupo1.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USUARIOS")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int id;
	@Column(name = "TELEFONO")
	String telefono;
	@Column(name = "NOMBRE")
	String nombre;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	List<Mensaje> mensaje;

	public Usuario(String telefono, String nombre, List<Mensaje> mensaje) {
		super();
		this.telefono = telefono;
		this.nombre = nombre;
		this.mensaje = mensaje;
	}

}
