package es.eoi.grupo1.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Mensajes", schema = "Whatssap")
public class mensaje {
	
	@Id
	int id;
	
	@Column(name = "enviar")
	String enviar;
	
	@Column(name = "recibido")
	boolean recibido;
	
	@Column(name = "texto")
	String texto;
	
	@Column(name = "estado")
	boolean Estado;
	
	
	
}
