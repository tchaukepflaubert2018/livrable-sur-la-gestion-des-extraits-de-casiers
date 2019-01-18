package com.objis.cameroun.MonProjet.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.objis.cameroun.MonProjet.domaine.Personne;
import com.objis.cameroun.MonProjet.service.Traitement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Enregistré extends JFrame {

	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField ageTextField;
	private JTextField naissanceTextField;
	private JTextField statutTextField;
	private JTextField professionTextField;
	private JTextField sexeTextField;
	private JLabel lblMessage;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Enregistré() {
		setTitle("Enregistr\u00E9");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("nom :");
		lblNom.setBounds(10, 11, 46, 14);
		contentPane.add(lblNom);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(42, 8, 191, 20);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("prenom :");
		lblPrenom.setBounds(10, 36, 46, 14);
		contentPane.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(52, 36, 181, 20);
		contentPane.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblAge = new JLabel("age :");
		lblAge.setBounds(10, 61, 46, 14);
		contentPane.add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(51, 61, 86, 20);
		contentPane.add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel lblLieuDeNaissance = new JLabel("lieu de naissance");
		lblLieuDeNaissance.setBounds(10, 91, 91, 14);
		contentPane.add(lblLieuDeNaissance);
		
		naissanceTextField = new JTextField();
		naissanceTextField.setBounds(119, 92, 159, 20);
		contentPane.add(naissanceTextField);
		naissanceTextField.setColumns(10);
		
		JLabel lblStatutMatrimoniale = new JLabel("statut matrimoniale");
		lblStatutMatrimoniale.setBounds(10, 125, 127, 14);
		contentPane.add(lblStatutMatrimoniale);
		
		statutTextField = new JTextField();
		statutTextField.setBounds(119, 123, 159, 20);
		contentPane.add(statutTextField);
		statutTextField.setColumns(10);
		
		JLabel lblProfession = new JLabel("profession");
		lblProfession.setBounds(10, 160, 71, 14);
		contentPane.add(lblProfession);
		
		professionTextField = new JTextField();
		professionTextField.setBounds(118, 157, 160, 20);
		contentPane.add(professionTextField);
		professionTextField.setColumns(10);
		
		JLabel lblSexe = new JLabel("sexe");
		lblSexe.setBounds(10, 189, 46, 14);
		contentPane.add(lblSexe);
		
		sexeTextField = new JTextField();
		sexeTextField.setBounds(116, 188, 162, 20);
		contentPane.add(sexeTextField);
		sexeTextField.setColumns(10);
		
		JButton btnEnregistr = new JButton("Enregistr\u00E9");
		btnEnregistr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// recuperation des valeurs saisies dans le formulaire
				
				String nom, prenom, lieudenaissance, statutmatrimoniale, profession, sexe;
				int age;
				//affectation des valeurs saisies dans le formulaire
				//mat = matriculeTextField.getText();
				nom = nomTextField.getText();
				prenom = prenomTextField.getText();
				lieudenaissance = naissanceTextField.getText();
				statutmatrimoniale = statutTextField.getText();
				profession = professionTextField.getText();
				sexe = sexeTextField.getText();
				//classe = classeTextField.getText();
				age = Integer.parseInt(ageTextField.getText()); //parseInt permet de convertir un String en int
				
				// creation d'un objet eleve
				
				Personne personne = new Personne();
				//eleve.setMatricule(matricule);
				personne.setNom(nom);
				personne.setPrenom(prenom);
				personne.setAge(age);
				personne.setLieuDeNaissance(lieudenaissance);
				personne.setStatusMatrimoniale(statutmatrimoniale);
				personne.setProfession(profession);
				personne.setSexe(sexe);
				// appel de la methode saveEleveService de la couche service
				Traitement traitement = new Traitement();
				//service.saveEleveService(eleve);
				
				int etat;
				etat = traitement.savePersonneTraitement(personne);
				if(etat == 1) {
					// vidages des zones textes
					//matriculeTextField.setText("");
					nomTextField.setText("");
					prenomTextField.setText("");
					ageTextField.setText("");
					naissanceTextField.setText("");
					statutTextField.setText("");
					professionTextField.setText("");
					sexeTextField.setText("");
					//classeTextField.setText("");
					
					// affiche du dialoguebox succes
					JOptionPane.showMessageDialog(null, "la personne de"+" "+ personne.getNom()+ "a été enregistré avec SUCCES dans la base de donnée");
				}
					
					else {
						JOptionPane.showMessageDialog(null, "une ERREUR c'est produit " + "pendant l'enregistrement" );
					}
				
			}
		});
		btnEnregistr.setBounds(335, 208, 89, 23);
		contentPane.add(btnEnregistr);
	}
}
