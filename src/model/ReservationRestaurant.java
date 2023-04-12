package model;

public class ReservationRestaurant extends Reservation{
	
	private int numerosService;
	private int numerosTable;
	
	public ReservationRestaurant(int jourReservation, int moisReservation, int numerosService, int numerosTable) {
		super(jourReservation, moisReservation);
		this.numerosService = numerosService;
		this.numerosTable = numerosTable;
	}
	
	@Override
	public String toString() {
		if (numerosService == 1)
			return "Le "+ jourReservation + "/" + moisReservation + " : table n°" + numerosTable + " pour le premier service.\n";
		return "Le "+ jourReservation + "/" + moisReservation + " : table n°" + numerosTable + " pour le deuxième service.\n";
	}
}
