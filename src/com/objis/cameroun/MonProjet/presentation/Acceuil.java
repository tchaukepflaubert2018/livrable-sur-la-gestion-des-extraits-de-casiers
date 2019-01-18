package com.objis.cameroun.MonProjet.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author FLAUBERT
 *@ version 1.0 // premiere version de mon programme
 */
public class Acceuil {

	private JFrame frmAcceuil;

	/**
	 * @param args Acceuil
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil window = new Acceuil();
					window.frmAcceuil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Acceuil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcceuil = new JFrame();
		frmAcceuil.setTitle("Acceuil");
		frmAcceuil.setBounds(100, 100, 450, 300);
		frmAcceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAcceuil.setJMenuBar(menuBar);
		
		JMenu mnPersonne = new JMenu("personne");
		menuBar.add(mnPersonne);
		
		JMenuItem mntmEnregistr = new JMenuItem("Enregistr\u00E9");
		mntmEnregistr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enregistré frame = new Enregistré();
				frame.setVisible(true);
			}
		});
		mnPersonne.add(mntmEnregistr);
		
		JMenuItem mntmListpersonne = new JMenuItem("ListPersonne");
		mntmListpersonne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListPersonne frame = new ListPersonne();
				frame.setVisible(true);
			}
		});
		mnPersonne.add(mntmListpersonne);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnPersonne.add(mntmModifier);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mnPersonne.add(mntmQuitter);
		
		JMenu mnObservation = new JMenu("observation");
		menuBar.add(mnObservation);
		frmAcceuil.getContentPane().setLayout(null);
		
		JLabel lblMessage = new JLabel("Bienvenue dans mon application de gestion des extraits de casier judiciare");
		lblMessage.setForeground(Color.MAGENTA);
		lblMessage.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblMessage.setBounds(10, 118, 414, 31);
		frmAcceuil.getContentPane().add(lblMessage);
	}
}
