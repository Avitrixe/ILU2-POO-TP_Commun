package model;

public class ReservationHotel extends Reservation{
	
	private int nombreLitSimple;
	private int nombreLitDouble;
	private int numerosChambre;
	
	public ReservationHotel(int jourReservation, int moisReservation, int numerosChambre, int nombreLitSimple, int nombreLitDouble) {
		super(jourReservation, moisReservation);
		this.nombreLitDouble = nombreLitDouble;
		this.nombreLitSimple = nombreLitSimple;
		this.numerosChambre = numerosChambre;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("lit n�" + numerosChambre + " avec " + nombreLitSimple + 
				" lits simples et " + nombreLitDouble + " lits doubles.\n");
		return super.toString() + chaine.toString();
	}
}
