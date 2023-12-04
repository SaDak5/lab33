package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Equipe {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idEq;
	private String nomEqp;
	private String nomStade;
	private Long anneeCreation;
	
	@OneToMany(mappedBy ="equipe")
	@JsonIgnore
	private List<Joueur> joueurs;
	
}