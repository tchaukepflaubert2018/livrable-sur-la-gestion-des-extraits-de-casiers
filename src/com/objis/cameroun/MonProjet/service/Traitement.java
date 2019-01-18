package com.objis.cameroun.MonProjet.service;
import com.objis.cameroun.MonProjet.presentation.Lanceur;
import com.objis.cameroun.MonProjet.dao.Dao;
import com.objis.cameroun.MonProjet.dao.IDao;
import com.objis.cameroun.MonProjet.domaine.Personne;

import java.util.List;
import java.util.Scanner;

/**
 * Classe a partir de laquelle on fait appel des 
 * differentes methodes via l'objet traitement 
 * 
 * @author FLAUBERT
 * 
 *@version 1.0 Mon Projet
 */
public class Traitement implements ITraitement{
	private IDao dao;
	public Traitement() {
		this.dao= new Dao();
	}
	// methode qui affiche le message de bienvenue
	public void messageBienvenue(){
	
		System.out.println("Bienvenue dans mon application de gestion des extraits de casier judiciare \n");
	/*System.out.println("E = enregistre une personne ");
	System.out.println("A = afficher la  liste des personnes");
	System.out.println("S = sortir du programme");*/
		System.out.println("				    Merci de choisir une option   " + '\n'
				+ "                                                           " + '\n'
				+ "                  		##################################" + '\n'
				+ "                  		##                              ##" + '\n'
				+ "                  		##       E - ENREGISTRE         ##" + '\n'
				+ "                  		##       A - AFFICHER           ##" + '\n'
				+ "                  		##       S - SORTIR        		##" + '\n' 
				+ "                  		##################################");
		
	
	//System.out.println("Voulez vous enregistre un patient O/N");

}
//methode qui permet d'entree les coordonnees d'une personne
/* (non-Javadoc)
 * @see com.objis.cameroun.MonProjet.service.ITraitement#enregistrePersonne()
 */
public void enregistrePersonne(){
	char reponse;
	Personne pn= new Personne();// instanciation
	Scanner scc = new Scanner(System.in);// scanner scc pous les variables de type string
	Scanner sci = new Scanner(System.in);// scanner sci pour les varibles de type int
	System.out.println("Voulez vous continuer O/N?");// instruction d'affichage
	reponse = scc.nextLine().charAt(0);
	
    if(reponse== 'O') {
    	
	while(reponse == 'O'){
	
		System.out.println("Donnez un nom");// instruction d'affichage
		pn.setNom(scc.nextLine());// on recupere le nom saisi
		System.out.println("Donnez un prenom");//instruction d'affichage
		pn.setPrenom(scc.nextLine());// on recupere le prenom saisi
		System.out.println("Donnez age");// instruction d'affichage
		pn.setAge(sci.nextInt());// on recupere la date saisi
		System.out.println("Donnez le lieu de naissance");// instruction d'affichage
		pn.setLieuDeNaissance(scc.nextLine());// on recupere le lieu de naissance saisi
		System.out.println("Donnez la profession");// instruction d'affichage
		pn.setProfession(scc.nextLine());// Ã n recupere la profession saisi
		System.out.println("Donnez le sexe M/F");// instruction d'affichage
		pn.setSexe(scc.nextLine());// on recupere le sexe saisi
		System.out.println("Status matrimoniale");// instruction d'affichage
		pn.setStatusMatrimoniale(scc.nextLine());// on recupere le status matrimoniale saisi
	
	System.out.println("Voulez-vous verifier les informations? O/N ");
	reponse =scc.nextLine().charAt(0);
	}


	//ENREGISTRE EN BASE DE DONNEE
	
	dao.savePersonneDao(pn);
	
    System.out.println("la personne a été enregistre avec success dans la base de donnee");
	
	/*System.out.println("Nom : "+" "+pn.getNom());
	System.out.println("Prenom : "+" "+pn.getPrenom());
	System.out.println("Age : "+" "+pn.getAge()); // INSTRUCTIONS D'AFFICHAGES
	System.out.println("Lieu de Naissance : "+" "+pn.getLieuDeNaissance());
	System.out.println("Profession : "+" "+pn.getProfession());
	System.out.println("Sexe : "+" "+pn.getSexe());
	System.out.println("Status Matrimoniale : "+" "+pn.getStatusMatrimoniale());*/
    
    }
	 else {
   
	   System.out.println("A bientot pour le prochain enregistrement");// instruction d'affichage
	 }
}
/**
 * @param personne
 * @return dao.savePersonneDao
 */
public int savePersonneTraitement(Personne personne) {
	
	return dao.savePersonneDao(personne);
}
// methode qui permet de consulter les donnees du patient
/* (non-Javadoc)
 * @see com.objis.cameroun.MonProjet.service.ITraitement#afficher()
 */
public void afficher() {
	
	
	//recuperation de la list des personnes en bd
	List<Personne> listPersonne= dao.getAllPersonneDao();
	//affiche la liste des personnes
	for (Personne personne : listPersonne) {
		
		System.out.println("Nom : "+" "+personne.getNom());
		System.out.println("Prenom : "+" "+personne.getPrenom());
		System.out.println("Age : "+" "+personne.getAge()); // INSTRUCTIONS D'AFFICHAGES
		System.out.println("Lieu de Naissance : "+" "+personne.getLieuDeNaissance());
		System.out.println("Profession : "+" "+personne.getProfession());
		System.out.println("Sexe : "+" "+personne.getSexe());
		System.out.println("Status Matrimoniale : "+" "+personne.getStatusMatrimoniale());
		
		System.out.println("************************************************************");
	}

}
@Override
public List<Personne> getAllPersonneTraitement() {
	// TODO Auto-generated method stub
	return dao.getAllPersonneDao();
}


}