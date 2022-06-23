package br.edu.univas.si5.bd2.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DetalhesFabricante {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regS3")
	@SequenceGenerator(name = "regS3", sequenceName = "s_det", allocationSize = 1)
	private Integer id;
	
	@Column(name="cep", length=10)
	private String cep;
	
	@Column(name="numFunc")
	private Integer numFunc;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFund;
	
	@OneToOne(mappedBy = "detalhes")
	private Fabricante fabricante;
	
	public DetalhesFabricante() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	public Date getDataFund() {
		return dataFund;
	}

	public void setDataFund(Date dataFund) {
		this.dataFund = dataFund;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "DetalhesFabricante [id=" + id + ", cep=" + cep + ", numFunc=" + numFunc + ", dataFund=" + dataFund
				+ "]";
	}
	
	
}
