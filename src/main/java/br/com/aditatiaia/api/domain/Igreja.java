package br.com.aditatiaia.api.domain;

import java.time.LocalDate;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="igreja")
public class Igreja {

	private String id;
	private String hierarquia;
	private String razaoSocial;
	private String cnpj;
	private String nomeEclesiastico;	
	private String foto;	
	private LocalDate dataFundacao;
	private LocalDate dataInauguracao;
	private boolean status;
	private LocalDate logradouro;
	private LocalDate numero;
	private LocalDate complemento;
	private LocalDate bairro;
	private LocalDate cidade;
	private LocalDate cep;
	
	@Id
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	@Size(max=20)
	public String getHierarquia() {return hierarquia;}
	public void setHierarquia(String hierarquia) {this.hierarquia = hierarquia;}
	
	@Size(max=50)
	@Field("razao_social")
	public String getRazaoSocial() {return razaoSocial;}
	public void setRazaoSocial(String razaoSocial) {this.razaoSocial = razaoSocial;}
	
	@Size(max=20)
	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	
	@Size(max=30)
	@Field("nome_eclesiastico")
	public String getNomeEclesiastico() {return nomeEclesiastico;}
	public void setNomeEclesiastico(String nomeEclesiastico) {this.nomeEclesiastico = nomeEclesiastico;}
	
	@Size(max=100)
	public String getFoto() {return foto;}
	public void setFoto(String foto) {this.foto = foto;}
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	@Field("data_fundacao")
	public LocalDate getDataFundacao() {return dataFundacao;}
	public void setDataFundacao(LocalDate dataFundacao) {this.dataFundacao = dataFundacao;}
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	@Field("data_inauguracao")
	public LocalDate getDataInauguracao() {return dataInauguracao;}
	public void setDataInauguracao(LocalDate dataInauguracao) {this.dataInauguracao = dataInauguracao;}
	
	public boolean isStatus() {return status;}
	public void setStatus(boolean status) {this.status = status;}
	
	@Size(max=50)
	public LocalDate getLogradouro() {return logradouro;}
	public void setLogradouro(LocalDate logradouro) {this.logradouro = logradouro;}
	
	@Size(max=10)
	public LocalDate getNumero() {return numero;}
	public void setNumero(LocalDate numero) {this.numero = numero;}
	
	@Size(max=30)
	public LocalDate getComplemento() {return complemento;}
	public void setComplemento(LocalDate complemento) {this.complemento = complemento;}
	
	@Size(max=30)
	public LocalDate getBairro() {return bairro;}
	public void setBairro(LocalDate bairro) {this.bairro = bairro;}
	
	@Size(max=30)
	public LocalDate getCidade() {return cidade;}
	public void setCidade(LocalDate cidade) {this.cidade = cidade;}
	
	@Size(max=10)
	public LocalDate getCep() {return cep;}
	public void setCep(LocalDate cep) {this.cep = cep;}
	
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
		Igreja other = (Igreja) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
