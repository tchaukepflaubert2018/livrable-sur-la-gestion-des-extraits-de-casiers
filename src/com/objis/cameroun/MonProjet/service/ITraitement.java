package com.objis.cameroun.MonProjet.service;

import java.util.List;

import com.objis.cameroun.MonProjet.domaine.Personne;

/**
 * Elle contient la signature de toutes les methodes
 * contenu dans la classe traitement
 *  
 * @author FLAUBERT
 * 
 *@version 1.0 Mon Projet
 */
public interface ITraitement {
	public void messageBienvenue();
	public void enregistrePersonne();
	public void afficher();
	public List<Personne> getAllPersonneTraitement();
}
