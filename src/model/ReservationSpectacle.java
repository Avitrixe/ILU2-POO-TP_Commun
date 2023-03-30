package model;

public class ReservationSpectacle extends Reservation{
	
	private String numerosZone;
	
	public ReservationSpectacle(int jourReservation, int moisReservation, int numerosChaise, String numerosZone) {
		super(jourReservation, moisReservation, numerosChaise);
		this.numerosZone = numerosZone;
	}
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("chaise n°" + super.numerosObjet + " pour le " + numerosZone +
				".\n");
		return super.toString() + chaine.toString();
	}

}
