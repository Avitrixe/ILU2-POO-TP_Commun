package model;

public class EntiteReservable <T extends Formulaire>{
	
	private CalendrierAnnuel carnetReservation;
	private int numIdentification;

	public EntiteReservable(CalendrierAnnuel carnetReservation, int numIdentification) {
		this.carnetReservation = carnetReservation;
		this.numIdentification = numIdentification;
	}

	public int getNumIdentification() {
		return numIdentification;
	}

	public void setNumIdentification(int numIdentification) {
		this.numIdentification = numIdentification;
	}
	
	public boolean estLibre(T formulaire) {
		return carnetReservation.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public boolean compatible(T formulaire) {
		return formulaire.getIdentificationEntite() == numIdentification && estLibre(formulaire);
	}
	
	public Reservation reserver(T formulaire) {
		return null;
	}
	
	

}
