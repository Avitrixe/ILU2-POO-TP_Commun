package model;

public abstract class Formulaire {
	
	protected int jourReservation;
	protected int moisReservation;
	protected int numerosObjet;
	
	public Formulaire(int jourReservation, int moisReservation, int numerosObjet) {
		this.jourReservation = jourReservation;
		this.moisReservation = moisReservation;
		this.numerosObjet = numerosObjet;
	}

	public int getJourReservation() {
		return jourReservation;
	}

	public int getMoisReservation() {
		return moisReservation;
	}

	public int getNumerosObjet() {
		return numerosObjet;
	}

}
