package model;

public class ReservationSpectacle extends Reservation{
	
	private String numerosZone;
	private int numerosChaise;
	
	public ReservationSpectacle(int jourReservation, int moisReservation, int numerosChaise, String numerosZone) {
		super(jourReservation, moisReservation);
		this.numerosZone = numerosZone;
		this.numerosChaise = numerosChaise;
	}
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("chaise n�" + numerosChaise + " pour le " + numerosZone +
				".\n");
		return super.toString() + chaine.toString();
	}
	
	public int getNumerosChaise() {
		return numerosChaise;
	}

}
