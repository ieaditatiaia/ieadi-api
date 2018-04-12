package br.com.aditatiaia.api.domain;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	@DBRef
	private List<HistoricoIgreja> historicos;
	
	@Id
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	@Size(max=20)
	public String getHierarquia() {return hierarquia;}
	public void setHierarquia(String hierarquia) {this.hierarquia = hierarquia;}
	
	@JsonInclude(Include.NON_NULL)
	@Size(max=50)
	@Field("razao_social")
	public String getRazaoSocial() {return razaoSocial;}
	public void setRazaoSocial(String razaoSocial) {this.razaoSocial = razaoSocial;}
	
	@JsonInclude(Include.NON_NULL) 
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
	
	@JsonInclude(Include.NON_NULL) 	
	@Field("data_fundacao") @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	public LocalDate getDataFundacao() {return dataFundacao;}
	public void setDataFundacao(LocalDate dataFundacao) {this.dataFundacao = dataFundacao;}
	
	@JsonInclude(Include.NON_NULL) 	
	@Field("data_inauguracao") @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	public LocalDate getDataInauguracao() {return dataInauguracao;}
	public void setDataInauguracao(LocalDate dataInauguracao) {this.dataInauguracao = dataInauguracao;}
	
	public boolean isStatus() {return status;}
	public void setStatus(boolean status) {this.status = status;}
	
	@Size(max=50)
	public String getLogradouro() {return logradouro;}
	public void setLogradouro(String logradouro) {this.logradouro = logradouro;}
	
	@Size(max=10)
	public String getNumero() {return numero;}
	public void setNumero(String numero) {this.numero = numero;}
	
	@JsonInclude(Include.NON_NULL)
	@Size(max=30)
	public String getComplemento() {return complemento;}
	public void setComplemento(String complemento) {this.complemento = complemento;}
	
	@Size(max=30)
	public String getBairro() {return bairro;}
	public void setBairro(String bairro) {this.bairro = bairro;}
	
	@Size(max=30)
	public String getCidade() {return cidade;}
	public void setCidade(String cidade) {this.cidade = cidade;}
	
	@Size(max=10)
	public String getCep() {return cep;}
	public void setCep(String cep) {this.cep = cep;}
	
	@JsonInclude(Include.NON_NULL)	
	public List<HistoricoIgreja> getHistoricos() {return historicos;}
	public void setHistoricos(List<HistoricoIgreja> historicos) {this.historicos = historicos;}
	
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
