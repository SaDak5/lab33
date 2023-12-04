package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Equipe;
import com.example.demo.entities.Joueur;
import com.example.demo.repos.ImageRepository;
import com.example.demo.repos.JoueurRepository;

@Service
public class JoueurServiceImpl implements JoueurService{

	
	@Autowired
	JoueurRepository joueurRepository;
	
	@Autowired
	ImageRepository imageRepository;
	
	@Override
	public Joueur saveJoueur(Joueur j) {
		return joueurRepository.save(j);
	}

/*	@Override
	public Joueur updateJoueur(Joueur j) {
		return joueurRepository.save(j);
	}
*/
	/*
	@Override
	public Joueur updateJoueur(Joueur j) {
	Long oldJouImageId =
	(Long) ((Joueur) this.getJoueur(j.getNomJoueur()).getImage()).getIdImage();
	Long newJouImageId = (Long) ((Joueur) j.getImage()).getIdImage();
	Joueur JouUpdated = joueurRepository.save(j);
	if (oldJouImageId != newJouImageId) //si l'image a été modifiée
	imageRepository.deleteById(oldJouImageId);
	return JouUpdated;
	}
	private Joueur getJoueur(String nomJoueur) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public Joueur updateJoueur(Joueur j) {
		//Long oldProdImageId = this.getProduit(p.getIdProduit()).getImage().getIdImage();
	//	Long newProdImageId = p.getImage().getIdImage();
		Joueur prodUpdated = joueurRepository.save(j);
		
	//	if (oldProdImageId != newProdImageId) // si l'image a été modifiée
		//	imageRepository.deleteById(oldProdImageId);
		return prodUpdated;
	}

	
	@Override
	public void deleteJoueur(Joueur j) {
		joueurRepository.delete(j);
		
	}

	@Override
	public void deleteJoueurById(Long id) {
		joueurRepository.deleteById(id);
		
	}

	@Override
	public Joueur getJoueur(Long id) {
		return joueurRepository.findById(id).get();
	}

	@Override
	public List<Joueur> getAllJoueurs() {
		return joueurRepository.findAll();
	}

	@Override
	public List<Joueur> findByNomJoueur(String nom) {
		return joueurRepository.findByNomJoueur(nom);
	}

	@Override
	public List<Joueur> findByNomJoueurContains(String nom) {
		return joueurRepository.findByNomJoueurContains(nom);
	}

	@Override
	public List<Joueur> findByPostJoueur(String nom) {
		return joueurRepository.findByPostJoueur(nom);
	}

	@Override
	public List<Joueur> findByEquipe(Equipe equipe) {
		return joueurRepository.findByEquipe(equipe);
	}

	@Override
	public List<Joueur> findByEquipeIdEq(Long id) {
		return joueurRepository.findByEquipeIdEq(id);
	}

	@Override
	public List<Joueur> findByOrderByNomJoueurAsc() {
		return joueurRepository.findByOrderByNomJoueurAsc();
	}

}
