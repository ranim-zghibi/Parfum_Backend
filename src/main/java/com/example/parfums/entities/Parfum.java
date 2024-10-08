 package com.example.parfums.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Parfum {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idParfum;
	private String nomParfum;
	private Double prixParfum;
	private int taille;
	
	@ManyToOne
	private Marque marque;
	
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public Parfum(String nomParfum, Double prixParfum, int taille) {
		super();
		this.nomParfum = nomParfum;
		this.prixParfum = prixParfum;
		this.taille = taille;
	}
	public Parfum() {
		super();
	}
	public Long getIdParfum() {
		return idParfum;
	}
	public void setIdParfum(Long idParfum) {
		this.idParfum = idParfum;
	}
	public String getNomParfum() {
		return nomParfum;
	}
	public void setNomParfum(String nomParfum) {
		this.nomParfum = nomParfum;
	}
	public Double getPrixParfum() {
		return prixParfum;
	}
	public void setPrixParfum(Double prixParfum) {
		this.prixParfum = prixParfum;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	@Override
	public String toString() {
		return "Parfum [idParfum=" + idParfum + ", nomParfum=" + nomParfum + ", prixParfum=" + prixParfum + ", taille="
				+ taille + "]";
	}
	
	

}
