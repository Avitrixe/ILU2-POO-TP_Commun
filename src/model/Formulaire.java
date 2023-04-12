package model;

public abstract class Formulaire {
	
	protected int jour;
	protected int mois;
	protected int identificationEntite;
	
	public Formulaire(int jourReservation, int moisReservation) {
		this.jour = jourReservation;
		this.mois = moisReservation;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getIdentificationEntite() {
		return identificationEntite;
	}
	
	public void setIdentificationEntite(int newIdEntite) {
		identificationEntite = newIdEntite;
	}

}
