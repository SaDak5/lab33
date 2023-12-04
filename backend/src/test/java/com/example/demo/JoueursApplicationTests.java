package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Equipe;
import com.example.demo.entities.Joueur;
import com.example.demo.repos.JoueurRepository;

@SpringBootTest
class JoueursApplicationTests {

	@Autowired
	private JoueurRepository joueurRepository;
	@Test
	public void testCreateJoueur() {
	Joueur jou = new Joueur("dzeko","AT",new Date());
	joueurRepository.save(jou);
	}
	
	@Test
	public void testFindJoueur() {
		Joueur j = joueurRepository.findById(2L).get();
		j.setPostJoueur("sa");
		System.out.println(j);
	}
	
	@Test
	public void testUpdateJoueur() {
		Joueur j = joueurRepository.findById(2L).get();
		j.setNomJoueur("ibrahimovic");
		joueurRepository.save(j);
	}
	
	
	@Test
	public void testDeleteJoueur() {
		joueurRepository.deleteById(2L);
	}

	
	@Test
	public void testFindAllJoueurs() {
		List<Joueur> js = joueurRepository.findAll();
		for (Joueur j : js)
			System.out.println(j);
	}
	
	
	
	
	
	@Test
	public void testFindByNomJoueur() {
		List<Joueur> jrs = joueurRepository.findByNomJoueur("ramos");
		for (Joueur j : jrs) {
			System.out.println(j);
		}
	}

	@Test
	public void testFindByNomProduitContains() {
		List<Joueur> jrs = joueurRepository.findByNomJoueurContains("i");
		for (Joueur j : jrs) {
			System.out.println(j);
		}
	}

	@Test
	public void testfindByPostJoueur() {
		List<Joueur> jrs = joueurRepository.findByPostJoueur("cb");
		for (Joueur j : jrs) {
			System.out.println(j);
		}
	}

	@Test
	public void testfindByEquipe() {
		Equipe Eqp = new Equipe();
		Eqp.setIdEq(2L);
		List<Joueur> jrs = joueurRepository.findByEquipe(Eqp);
		for (Joueur j : jrs) {
			System.out.println(j);
		}
	}

	
	
	@Test
	public void findByEquipeIdEq() {
		List<Joueur> jrs = joueurRepository.findByEquipeIdEq(1L);
		for (Joueur j : jrs) {
			System.out.println(j);
		}
	}

	@Test
	public void testfindByOrderByNomJoueurAsc() {
		List<Joueur> jrs = joueurRepository.findByOrderByNomJoueurAsc();
		for (Joueur j : jrs) {
			System.out.println(j);
		}
	}


}
