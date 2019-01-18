package com.objis.cameroun.MonProjet.presentation;
	import java.util.Scanner;

import com.objis.cameroun.MonProjet.service.Traitement;
import com.objis.cameroun.MonProjet.dao.Dao;
import com.objis.cameroun.MonProjet.dao.IDao;
import com.objis.cameroun.MonProjet.domaine.Personne;
	/**
	 * @author FLAUBERT
	 * @version 1.0 Mon Projet
	 */
	public class Lanceur{
	/**
	 * cette classe est la classe principale
	 * @param arg
	 */
	

	/**
	 * la methode main // point d'entree du programme 
	 * qui affiche le mot de Bienvenue.
	 * reponse: variable.
	 * pn: nouveau objet cree a partir de l'objet personne 
	 * par instanciation.
	 * Scanner : classe Scanner.
	 * * @param arg  personne 
	 */
		public Lanceur() {
			
		}
	public static void main (String arg[]){
		
		//System.out.println("Bienvenu dans mon application de gestion des extraits de casier judiciare");// instruction d'affichage
		char reponse;// declaration d'une variable de type char
	
		Scanner scc = new Scanner(System.in);// scanner scc pous les variables de type string
		Scanner sci = new Scanner(System.in);// scanner sci pour les varibles de type int
		
		
		//appel de la couche traitement
		Traitement traitement = new Traitement();
		
		traitement.messageBienvenue();
		
		System.out.println("Entree votre choix");
		reponse = scc.nextLine().charAt(0);
		switch(reponse){
		case 'E':
			System.out.println("Vous avez choisi d'enregistre une personne");
			traitement.enregistrePersonne();
			break;
		case 'A' :
			System.out.println("Vous avez choisi d'afficher la liste des personnes");
			traitement.afficher();
			break;
		case'S':
			System.out.println("Vous sortez du programme");
			break;
			default:
				System.out.println("Au revoir");
		}
		
		
		
	}
	
	
}

	

	

