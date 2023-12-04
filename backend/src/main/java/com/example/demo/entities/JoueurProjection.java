package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomJoueur", types = { Joueur.class })
public interface JoueurProjection {
	public String getPostJoueur();
}
