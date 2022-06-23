package br.edu.univas.si5.bd2.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Fabricante {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regS2")
	@SequenceGenerator(name = "regS2", sequenceName = "s_fab", allocationSize = 1)
	private Integer id;
	
	@Column(name="nome", length=30)
	private String nome;
	
	@Column(name="cnpj", length=20)
	private String cnpj;
	
	@Column(name="ativo")
	private Boolean ativo;
	
	@OneToMany(mappedBy="fabricante")
	private Set<Modelos> modelos;
	
	@OneToOne
	@JoinColumn(name="det_fk")
	private DetalhesFabricante detalhes;
	
	public Fabricante() {
		
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Set<Modelos> getModelos() {
		return modelos;
	}

	public void setModelos(Set<Modelos> modelos) {
		this.modelos = modelos;
	}

	public DetalhesFabricante getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(DetalhesFabricante detalhes) {
		this.detalhes = detalhes;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", ativo=" + ativo + "]";
	}
	
	
}
