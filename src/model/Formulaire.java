package model;

import javax.swing.plaf.basic.BasicMenuUI;

public abstract class Formulaire {
	protected int jour;
	protected int mois;
	protected int numEntite;
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getIdentificationEntite() {
		return numEntite;
	}
	
	public int setIdentificationEntite(int numEntite) {
		return this.numEntite = numEntite;
	}
}