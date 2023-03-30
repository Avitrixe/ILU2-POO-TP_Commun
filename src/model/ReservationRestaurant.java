package model;

public class ReservationRestaurant extends Reservation{
	
	private int numerosService;
	
	public ReservationRestaurant(int jourReservation, int moisReservation, int numerosService, int numerosTable) {
		super(jourReservation, moisReservation, numerosTable);
		this.numerosService = numerosService;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		String numService;
		if (numerosService == 1) numService = "premier";
		else numService = "deuxième";
		chaine.append("table n°" + super.numerosObjet + " pour le " + numService +
				" service.\n");
		return super.toString() + chaine.toString();
	}

}
