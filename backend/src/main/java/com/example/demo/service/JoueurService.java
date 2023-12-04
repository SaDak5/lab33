package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Equipe;
import com.example.demo.entities.Joueur;

public interface JoueurService {
	Joueur saveJoueur(Joueur j);
	Joueur updateJoueur(Joueur j);
	void deleteJoueur(Joueur j);
	 void deleteJoueurById(Long id);
	Joueur getJoueur(Long id);
	List<Joueur> getAllJoueurs();
	List<Joueur> findByNomJoueur(String nom);
	 List<Joueur> findByNomJoueurContains(String nom);
	 List<Joueur> findByPostJoueur (String nom);
	List<Joueur> findByEquipe(Equipe equipe);
	 List<Joueur> findByEquipeIdEq(Long id);
	 List<Joueur> findByOrderByNomJoueurAsc();
}
