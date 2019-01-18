package com.objis.cameroun.MonProjet.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.MonProjet.domaine.PersonneModel;
import com.objis.cameroun.MonProjet.service.ITraitement;
import com.objis.cameroun.MonProjet.service.Traitement;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ListPersonne extends JFrame {

	private JPanel contentPane;
	private JTable tablePersonne;
	private  PersonneModel  personneModel;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField ageTextField;
	private JTextField naissanceTextField;
	private JTextField statutTextField;
	private JTextField professionTextField;
	private JTextField sexeTextField;

	/**
	 * Launch the application.
	

	/**
	 * Create the frame.
	 */
	public ListPersonne() {
		setTitle("Liste des personnes");
		setBounds(100, 100, 1232, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		

        ITraitement traitement = new Traitement();
		
	    personneModel = new PersonneModel(traitement.getAllPersonneTraitement());
		contentPane.setLayout(null);
		
		tablePersonne = new JTable(personneModel);
		
		
		JScrollPane scrollPane = new JScrollPane(tablePersonne);
		scrollPane.setBounds(330, 10, 452, 427);
		contentPane.add(scrollPane);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(814, 17, 46, 14);
		contentPane.add(lblNom);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(917, 14, 162, 20);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(814, 42, 46, 14);
		contentPane.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(917, 39, 145, 20);
		contentPane.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setBounds(814, 67, 46, 14);
		contentPane.add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(917, 70, 86, 20);
		contentPane.add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel lblLieudenaissance = new JLabel("LieuDeNaissance :");
		lblLieudenaissance.setBounds(802, 103, 103, 14);
		contentPane.add(lblLieudenaissance);
		
		naissanceTextField = new JTextField();
		naissanceTextField.setBounds(917, 100, 135, 20);
		contentPane.add(naissanceTextField);
		naissanceTextField.setColumns(10);
		
		JLabel lblStatutmatrimoniale = new JLabel("StatutMatrimoniale :");
		lblStatutmatrimoniale.setBounds(814, 136, 112, 14);
		contentPane.add(lblStatutmatrimoniale);
		
		statutTextField = new JTextField();
		statutTextField.setBounds(917, 138, 125, 20);
		contentPane.add(statutTextField);
		statutTextField.setColumns(10);
		
		JLabel lblProfession = new JLabel("Profession :");
		lblProfession.setBounds(814, 161, 74, 14);
		contentPane.add(lblProfession);
		
		professionTextField = new JTextField();
		professionTextField.setBounds(921, 169, 131, 20);
		contentPane.add(professionTextField);
		professionTextField.setColumns(10);
		
		JLabel lblSexe = new JLabel("Sexe :");
		lblSexe.setBounds(814, 188, 46, 14);
		contentPane.add(lblSexe);
		
		sexeTextField = new JTextField();
		sexeTextField.setBounds(917, 200, 86, 20);
		contentPane.add(sexeTextField);
		sexeTextField.setColumns(10);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(1117, 213, 89, 23);
		contentPane.add(btnModifier);;
	}
}
