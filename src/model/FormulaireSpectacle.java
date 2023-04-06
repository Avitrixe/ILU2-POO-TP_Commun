package model;

public class FormulaireSpectacle extends Formulaire{
	
	private int numerosZone;

	public FormulaireSpectacle(int jourReservation, int moisReservation, int numerosPlace, int numerosZone){
		super(jourReservation, moisReservation, numerosPlace);
		this.numerosZone = numerosZone;
	}

	public int getNumerosZone() {
		return numerosZone;
	}

}
