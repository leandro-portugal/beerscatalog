package com.leandroportugal.beerscatalog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "beer")
public class Beers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String factory;
	
	@ManyToOne
	@JoinColumn(name ="beertype_id")
	private TypeBeer typebeer;
	
	public Beers(){
		
	}

	public TypeBeer getTypebeer() {
		return typebeer;
	}

	public void setTypebeer(TypeBeer typebeer) {
		this.typebeer = typebeer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}
	
	
	
}
