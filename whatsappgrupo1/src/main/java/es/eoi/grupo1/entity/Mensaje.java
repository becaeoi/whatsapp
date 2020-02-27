package es.eoi.grupo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "MENSAJES")
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
	Usuario envia;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO_DESTINO", referencedColumnName = "ID")
	Usuario recibe;
	@Column(name = "TEXTO")
	String texto;
	@Column(name = "ESTADO")
	boolean estado;

	public Mensaje(Usuario envia, Usuario recibe, String texto, boolean estado) {
		super();
		this.envia = envia;
		this.recibe = recibe;
		this.texto = texto;
		this.estado = estado;
	}

}
