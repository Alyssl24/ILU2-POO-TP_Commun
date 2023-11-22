package model;

public class FormulaireHotel extends Formulaire{
	private int nbLitsimple;
	private int nbLitDouble;
	
	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble) {
		super(jour, mois);
		this.nbLitDouble = nbLitDouble;
		this.nbLitsimple = nbLitSimple;
	}
	
	public int getNombreLitDouble() {
		return nbLitDouble;
	}
	
	public int getNombreLitSimple() {
		return nbLitsimple;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
}
