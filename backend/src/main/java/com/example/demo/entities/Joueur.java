package com.example.demo.entities;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Joueur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long numJoueur;
private String nomJoueur;
private String postJoueur;
private Date dateNaissance;

@ManyToOne
private Equipe equipe;

/*@OneToOne
private Image image;
*/
@OneToMany (mappedBy = "joueur")
private List<Image> images;

public Joueur() {
super();
}

public Joueur(String nomJoueur, String postJoueur, Date dateNaissance) {
super();
this.nomJoueur = nomJoueur;
this.postJoueur=postJoueur;
this.dateNaissance = dateNaissance;
}

public Long getNumJoueur() {
	return numJoueur;
}

public void setNumJoueur(Long numJoueur) {
	this.numJoueur = numJoueur;
}

public String getNomJoueur() {
	return nomJoueur;
}

public void setNomJoueur(String nomJoueur) {
	this.nomJoueur = nomJoueur;
}

public String getPostJoueur() {
	return postJoueur;
}

public void setPostJoueur(String postJoueur) {
	this.postJoueur = postJoueur;
}

public Date getDateNaissance() {
	return dateNaissance;
}

public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}

@Override
public String toString() {
	return "Joueur [numJoueur=" + numJoueur + ", nomJoueur=" + nomJoueur + ", postJoueur=" + postJoueur
			+ ", dateNaissance=" + dateNaissance + "]";
}

public Equipe getEquipe() {
	return equipe;
}

public void setEquipe(Equipe equipe) {
	this.equipe = equipe;
}

public List<Image> getImages() {
	return images;
}

public void setImages(List<Image> images) {
	this.images = images;
}


}

