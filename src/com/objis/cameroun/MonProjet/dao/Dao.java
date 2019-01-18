package com.objis.cameroun.MonProjet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.objis.cameroun.MonProjet.domaine.Personne;

/**
 * Classe qui implemente l'interface IDao
 * 
 * @author FLAUBERT
 * 
 *@version 1.0 Mon Projet
 */
public class Dao implements IDao {

	public Dao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int savePersonneDao(Personne personne) {
		try {

			// Etape 1 : recuperation de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Creation d'un objet  statement et preparation de la requete
			

			String sql = "insert into `personne`(`nom`,`prenom`,`age`,`lieudenaissance`,`profession`,`sexe`,`statutmatrimoniale`)" 
					+"values (?,?,?,?,?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			ps.setString(1, personne.getNom());
			ps.setString(2, personne.getPrenom());
			ps.setInt(3, personne.getAge());
			ps.setString(4, personne.getLieuDeNaissance());
			ps.setString(5, personne.getProfession());
			ps.setString(6, personne.getSexe());
			ps.setString(7, personne.getStatusMatrimoniale());
		
			// Etape 3 : execution requete
			ps.executeUpdate();
			
			
			
			// Etape 4 : gestion des exceptions et liberation 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
			return 0;
		} 
		
	
		return 1;
	
	}

	@Override
	public List<Personne> getAllPersonneDao() {
	

        //creation d'une collection des eleves
		List<Personne> maListPersonne= new ArrayList<Personne>();
	
		
		try {

			// Etape 1 : recuperation de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : preparation requete
			String sql = "SELECT * FROM personne ";
			
			Statement st = cn.createStatement();


			// Etape 3 : execution requete
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				//recuperation des valeurs d'une ligne de la table personne pour initialiser dans un objet personne
				Personne personne =  new Personne();
				personne.setIdPersonne(rs.getInt("id"));
				personne.setNom(rs.getString("nom"));
				personne.setPrenom(rs.getString("prenom"));
				personne.setAge(rs.getInt("age"));
				personne.setLieuDeNaissance(rs.getString("lieudenaissance"));
				personne.setProfession(rs.getString("profession"));
				personne.setSexe(rs.getString("sexe"));
				personne.setStatusMatrimoniale(rs.getString("statutmatrimoniale"));
				//ajout de personne dans la list maListPersonne
				maListPersonne.add(personne); /* cette instruction permet d'inserrer l'objet document dans ma liste 
				personne*/
			}
			
			// Etape 5 : gestion des exceptions et liberation 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
	

		
		return maListPersonne;	
	
	}

}
