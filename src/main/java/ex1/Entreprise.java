package ex1;

import java.util.Date;

/**Répresente une entreprise avec toutes ses caractéristiques 
 * @author diginamic
 *
 */
public class Entreprise {

	
	private int Siret;
	private String Nom;
	private String adresse;
	private Date date_Creation;
	
	private static final int capitalMax = 3000000;
	

	public Entreprise(int siret, String nom, String adresse, Date date_Creation) {
		super();
		Siret = siret;
		Nom = nom;
		this.adresse = adresse;
		this.date_Creation = date_Creation;
	}
	
	

	public void afficherStatut(){
		
	}
	

	public int getSiret() {
		return Siret;
	}

	public void setSiret(int siret) {
		Siret = siret;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate_Creation() {
		return date_Creation;
	}

	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}

	public static int getCapitalmax() {
		return capitalMax;
	}
	
	
	
}
