package com.stock.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vente implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idVente;
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	@OneToMany(mappedBy="vente")
	private List<LigneVente> ligneVentes;
	public Long getIdVente() {
		return idVente;
	}
	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}
	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}

	
	
}

