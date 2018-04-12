package br.com.aditatiaia.api.domain;

import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="evento")
public class Evento {

	private String id;
	private String titulo;
	
	@Id
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	@Size(max=40)
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	
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
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
