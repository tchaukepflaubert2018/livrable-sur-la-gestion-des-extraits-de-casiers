package com.objis.cameroun.MonProjet.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PersonneModel extends AbstractTableModel {

    private final String[] entetes = {"id", "Nom","Prenom","Age","LieuDeNaissance","StatutMatrimoniale","Profession","Sexe"};

    private List<Personne> personnes;

    public PersonneModel(List<Personne> personnes) {  
        this.personnes = personnes; 
    }


    public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}



	@Override
    public int getRowCount() {
        return personnes.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // ID
                return personnes.get(rowIndex).getIdPersonnes();

            case 1:
                // Nom
                return personnes.get(rowIndex).getNom();
            case 2:
                // Prenom
                return personnes.get(rowIndex).getPrenom();
            case 3:
                // Age
                return personnes.get(rowIndex).getAge();
            case 4:
                // Lieudenaissance
                return personnes.get(rowIndex).getLieuDeNaissance();
            case 5:
                // Statutmatrimoniale
                return personnes.get(rowIndex).getStatusMatrimoniale();
            case 6:
            	//Profession
            	return personnes.get(rowIndex).getProfession();
            case 7:
            	//Sexe
            	return personnes.get(rowIndex).getSexe();
            default:
                throw new IllegalArgumentException();

        }
       
        
    }



}
