package model;

public abstract class Formulaire {
	
	protected int jour;
	protected int mois;
	protected int identificationEntite;
	
	public Formulaire(int jourReservation, int moisReservation, int numerosObjet) {
		this.jour = jourReservation;
		this.mois = moisReservation;
		this.identificationEntite = numerosObjet;
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
