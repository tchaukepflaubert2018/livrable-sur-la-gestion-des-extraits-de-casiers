package com.objis.cameroun.MonProjet.dao;

import java.util.List;

import com.objis.cameroun.MonProjet.domaine.Personne;

/**
 * interface generique qui contient uniquement les signatures des 
 * methodes qui vont etre implementer par la classe Dao
 * 
 * @author FLAUBERT
 * 
 *@version 1.0 Mon Projet
 */
public interface IDao {
public int savePersonneDao(Personne Personne);
public List<Personne> getAllPersonneDao();
}
