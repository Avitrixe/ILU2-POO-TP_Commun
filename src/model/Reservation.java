package model;

public abstract class Reservation {
	
	protected int jourReservation;
	protected int moisReservation;
	protected int numerosObjet;
	
	public Reservation(int jourReservation, int moisReservation, int numerosObjet) {
		this.jourReservation = jourReservation;
		this.moisReservation = moisReservation;
		this.numerosObjet = numerosObjet;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jourReservation + "/" + moisReservation + " : ");
		return chaine.toString();
		
	}
}
