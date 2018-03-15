package ex2;

/**levret A d'un Compte courant 
 * @author diginamic
 *
 */
public class LivretA extends CompteBancaire {
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	

	public void appliquerRemuAnnuelle() {
		
			this.solde = solde + solde * tauxRemuneration / 100;
		
	}
	
	
	


}
