package model;

public abstract class EntiteReservable <T extends Formulaire>{
	
	protected CalendrierAnnuel carnetReservation = new CalendrierAnnuel();
	protected int numIdentification;

	public int getNumIdentification() {
		return numIdentification;
	}

	public void setNumIdentification(int numIdentification) {
		this.numIdentification = numIdentification;
	}
	
	public boolean estLibre(T formulaire) {
		return carnetReservation.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(T formulaire);
	
	public abstract Reservation reserver(T formulaire);
		
		
	

}
