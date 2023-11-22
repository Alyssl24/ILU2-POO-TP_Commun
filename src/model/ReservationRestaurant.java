package model;

import javax.naming.ldap.StartTlsRequest;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour,mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + super.jour + "/" + super.mois + "\nTable " + numTable + " pour le ");
		if (numService == 1) {chaine.append("premier service.");}
		if (numService == 2) {chaine.append("deuxième service.");}
		return chaine.toString();
	}
}
