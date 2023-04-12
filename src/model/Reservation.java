package model;

public abstract class Reservation {
	
	protected int jourReservation;
	protected int moisReservation;
	
	protected Reservation(int jourReservation, int moisReservation) {
		this.jourReservation = jourReservation;
		this.moisReservation = moisReservation;
	}
	
}
