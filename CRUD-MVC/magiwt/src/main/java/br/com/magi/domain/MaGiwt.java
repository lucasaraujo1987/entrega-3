package br.com.magi.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MaGiwt implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer cpf;
	private Integer cep;
	private String embarque;
	private String destino;
	private String endereco;
	
	public MaGiwt() {
		
	}

	public MaGiwt(Integer id, String nome, Integer cpf, Integer cep, String embarque, String destino,
			String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cep = cep;
		this.embarque = embarque;
		this.destino = destino;
		this.endereco = endereco;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getEmbarque() {
		return embarque;
	}

	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(cep, cpf, destino, embarque, endereco, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaGiwt other = (MaGiwt) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(destino, other.destino) && Objects.equals(embarque, other.embarque)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cep=" + cep + ", embarque=" + embarque
				+ ", destino=" + destino + ", endereco=" + endereco + "]";
	}
	
	
}
