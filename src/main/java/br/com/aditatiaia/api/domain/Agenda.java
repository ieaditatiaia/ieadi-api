package br.com.aditatiaia.api.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="agenda")
public class Agenda {

	private String id;
	private String evento;
	private LocalDate data;
	private LocalTime hora;
	private String local;
	
	@Id
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	@Size(max=50)
	public String getEvento() {return evento;}
	public void setEvento(String evento) {this.evento = evento;}
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public LocalDate getData() {return data;}
	public void setData(LocalDate data) {this.data = data;}
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm", timezone = "America/Sao_Paulo")
	public LocalTime getHora() {return hora;}
	public void setHora(LocalTime hora) {this.hora = hora;}
	
	@Size(max=30)
	public String getLocal() {return local;}
	public void setLocal(String local) {this.local = local;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
