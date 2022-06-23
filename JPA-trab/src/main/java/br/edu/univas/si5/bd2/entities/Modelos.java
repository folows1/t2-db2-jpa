package br.edu.univas.si5.bd2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Modelos {
	
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regS1")
	@SequenceGenerator(name = "regS1", sequenceName = "s_mod", allocationSize = 1)
	private Integer codigo;
	
	@Column(name="nome", length=30)
	private String nome;
	
	@Column(name="tipo", length=30)
	private String tipo;
	
	@Column(name="peso")
	private Float peso;
	
	@ManyToOne
	@JoinColumn(name="fab_fk")
	private Fabricante fabricante;
	
	public Modelos() {
		
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Modelos [codigo=" + codigo + ", nome=" + nome + ", tipo=" + tipo + ", peso=" + peso + "]";
	}
	
	
}
