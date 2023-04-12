package model;

public class FormulaireSpectacle extends Formulaire{
	
	private int numerosZone;
	private int numerosPlace;

	public FormulaireSpectacle(int jourReservation, int moisReservation, int numerosPlace, int numerosZone){
		super(jourReservation, moisReservation);
		this.numerosZone = numerosZone;
		this.numerosPlace = numerosPlace;
	}

	public int getNumerosZone() {
		return numerosZone;
	}
	
	public int getNumerosPlace() {
		return numerosPlace;
	}

}
