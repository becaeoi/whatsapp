package es.eoi.grupo1.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class MensajeDto {
	
	int id;
	
	boolean enviar;
	
	boolean recibe;
	
	String texto;
	
	boolean estado;

}
