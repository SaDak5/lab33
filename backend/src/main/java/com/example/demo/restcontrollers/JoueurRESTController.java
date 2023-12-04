package com.example.demo.restcontrollers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Joueur;
import com.example.demo.service.JoueurService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class JoueurRESTController {
	@Autowired
	JoueurService joueurService;
	@RequestMapping(path="all" ,method = RequestMethod.GET)
	public List<Joueur> getAllJoueurs() {
	return joueurService.getAllJoueurs();
	}

	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Joueur getJoueurById(@PathVariable("id") Long id) {
	return joueurService.getJoueur(id);
	 }

	@RequestMapping(path="/addjou" ,method = RequestMethod.POST)
	public Joueur createJoueur(@RequestBody Joueur joueur) {
	return joueurService.saveJoueur(joueur);
	}
	
	@RequestMapping(path="/updatejou",method = RequestMethod.PUT)
	public Joueur updateProduit(@RequestBody Joueur joueur) {
	return joueurService.updateJoueur(joueur);
	}
	
	 @RequestMapping(value="/deljou/{id}",method = RequestMethod.DELETE)
	 public void deleteJoueur(@PathVariable("id") Long id)
	 {
	 joueurService.deleteJoueurById(id);
	 }
	 
	 
	 
	 @RequestMapping(value="/jrseq/{idEq}",method = RequestMethod.GET)
	 public List<Joueur> getJoueurByEqId(@PathVariable("idEq") Long id) {
	 return joueurService.findByEquipeIdEq(id);
	 }
	 
	 @RequestMapping(value="/jrsByName/{nom}",method = RequestMethod.GET)
	 public List<Joueur> findByNomProduitContains(@PathVariable("nom") String nom) {
	 return joueurService.findByNomJoueurContains(nom);
	 }

	 
	}
