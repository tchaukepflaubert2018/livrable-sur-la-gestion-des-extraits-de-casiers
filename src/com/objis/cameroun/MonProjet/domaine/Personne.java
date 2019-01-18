package com.objis.cameroun.MonProjet.domaine;

/**
 * classe qui traite les savoirs-faires dont 
 * l'utilisateur fait appel
 * @author FLAUBERT
 *@version 1.0 premiere version de mon programme
 */
public class Personne {
	//attributs
	private String nom;
	private String prenom;
	private int age;
	private String lieudenaissance;
	private String profession;
	private String sexe;
	private String statusmatrimoniale;
	// constructeurs

	/**
	 * 
	 */
	public Personne(){  // initialisation du constructeur 
		super();
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param lieudenaissance
	 * @param profession
	 * @param sexe
	 * @param statusmatrimoniale
	 */
	public Personne(String nom, String prenom, int age, String lieudenaissance, String profession, String sexe,  String statusmatrimoniale){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.lieudenaissance = lieudenaissance;
		this.profession = profession;
		this.sexe = sexe;
		this.statusmatrimoniale = statusmatrimoniale;
	}
	//	getteurs/ setteurs
	/**
	 * @return nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * @param nom
	 */
	public void setNom(String nom){
			this.nom = nom;
	}
	/**
	 * @return prenom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * @param prenom
	 */
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	/**
	 * @return age
	 */
	public int getAge(){
		return age;
	}
	/**
	 * @param age
	 */
	public void setAge(int age){
		this.age = age;
	}
	/**
	 * @return lieudenaissance
	 */
	public String getLieuDeNaissance(){
		return lieudenaissance;
	}
	/**
	 * @param lieudenaissance
	 */
	public void setLieuDeNaissance(String lieudenaissance){
		this.lieudenaissance = lieudenaissance;
	}
	/**
	 * @return profession
	 */
	public String getProfession(){
		return profession;
	}
	/**
	 * @param profession
	 */
	public void setProfession(String profession){
		this.profession = profession;
	}
	/**
	 * @return sexe
	 */
	public String getSexe(){
		return sexe;
	}
	/**
	 * @param sexe
	 */
	public void setSexe(String sexe){
		this.sexe = sexe;
	}
	/**
	 * @return statusmatrimoniale
	 */
	public String getStatusMatrimoniale(){
		return statusmatrimoniale;
	}
	/**
	 * @param statusmatrimoniale
	 */

	public void setStatusMatrimoniale(String statusmatrimoniale){
		this.statusmatrimoniale = statusmatrimoniale;
	}

	public void setIdPersonne(int int1) {
		// TODO Auto-generated method stub
		
	}

	public Object getIdPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", lieudenaissance=" + lieudenaissance
				+ ", profession=" + profession + ", sexe=" + sexe + ", statusmatrimoniale=" + statusmatrimoniale + "]";
	}
}



