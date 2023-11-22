package model;

public class FormulaireRestaurant extends Formulaire{
	private int nbPersonne;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonne, int numService) {
		super(jour, mois);
		this.numService = numService;
		this.nbPersonne = nbPersonne;
	}
	
	public int getNombrePersonnes() {
		return nbPersonne;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
}
