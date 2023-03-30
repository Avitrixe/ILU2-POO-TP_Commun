package model;

public class ReservationHotel extends Reservation{
	
	private int nombreLitSimple;
	private int nombreLitDouble;
	
	public ReservationHotel(int jourReservation, int moisReservation, int numerosChambre, int nombreLitSimple, int nombreLitDouble) {
		super(jourReservation, moisReservation, numerosChambre);
		this.nombreLitDouble = nombreLitDouble;
		this.nombreLitSimple = nombreLitSimple;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("lit n°" + super.numerosObjet + " avec " + nombreLitSimple + 
				" lits simples et " + nombreLitDouble + " lits doubles.\n");
		return super.toString() + chaine.toString();
	}
}
