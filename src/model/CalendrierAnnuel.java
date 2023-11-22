package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {
		String[] nomMois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
		int[] nbJourMois = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < 12; i++) {
			calendrier[i] = new Mois(nomMois[i],nbJourMois[i]);
		}
	}
	
	public boolean estLibre(int jour,int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		if (!estLibre(jour, mois)) {return false;}
		else {
			calendrier[mois-1].reserver(jour);
			return true;
		}
	}
	
//	############### CLASSE INTERNE ####################
	
	private class Mois {
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom,int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}
		
		private boolean estLibre(int jour) {
			return jours[jour-1] != true;
		}
		
		private void reserver(int jour) throws IllegalStateException{
			if (!estLibre(jour)) {throw new IllegalStateException("Il n'y a plus de place ce jour ci.");}
			else {jours[jour-1] = true;}
		}
	}
}
