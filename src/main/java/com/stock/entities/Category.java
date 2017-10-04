package com.stock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idCategory;
	private String code;
	private String designation;
	@OneToMany(mappedBy="category")
	private List<Article> articles;
	
	public Category() {
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

}

