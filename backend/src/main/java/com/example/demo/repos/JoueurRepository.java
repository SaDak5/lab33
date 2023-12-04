package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Joueur;
import com.example.demo.entities.Equipe;

@RepositoryRestResource(path = "rest")
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
	List<Joueur> findByNomJoueur(String nom);
	 List<Joueur> findByNomJoueurContains(String nom);
	 @Query("select j from Joueur j where j.nomJoueur like %:nom ")
	 List<Joueur> findByPostJoueur (String nom);
	 @Query("select j from Joueur j where j.equipe = ?1")
	 List<Joueur> findByEquipe(Equipe equipe);
	 List<Joueur> findByEquipeIdEq(Long id);
	 List<Joueur> findByOrderByNomJoueurAsc();
	 
}
