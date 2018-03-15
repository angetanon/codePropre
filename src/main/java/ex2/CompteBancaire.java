package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/**
	 * decouvert : un découvert est autorisé seulement pour les comptes
	 * courants
	 */
	private double decouvert;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	


	/**
	 * Ce constructeur est utilisé pour créer un compte de type Compte courant
	 * 
	
	 * @param solde
	 *            représente le solde du compte
	 * @param decouvert
	 *            représente le découvert autorisé
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		
		this.solde = solde;
		this.decouvert = decouvert;
	}



	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Debiter un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
	
			if (this.solde - montant > decouvert) {
				this.solde = solde - montant;
			
			
			}
		 
	}



	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter for solde
	 * 
	 * @param solde
	 * 
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter for decouvert to set
	 * 
	 * @param decouvert
	 * 
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}




}
