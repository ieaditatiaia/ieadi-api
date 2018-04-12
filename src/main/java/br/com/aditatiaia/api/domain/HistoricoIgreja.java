package br.com.aditatiaia.api.domain;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="historico_igreja")
public class HistoricoIgreja {

	private String id;
	private Evento evento;
	private String descricao;
	private int ata;
	private LocalDate data;
	
	@Id
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public Evento getEvento() {return evento;}
	public void setEvento(Evento evento) {this.evento = evento;}
		
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	
	public int getAta() {return ata;}
	public void setAta(int ata) {this.ata = ata;}
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	public LocalDate getData() {return data;}
	public void setData(LocalDate data) {this.data = data;}
	
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
		HistoricoIgreja other = (HistoricoIgreja) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
