package model;

public class FormulaireHotel extends Formulaire{
	
	private int nombreLitSimple;
	private int nombreLitDouble;
	
	public FormulaireHotel(int jourReservation, int moisReservation, int numerosChambre, int nombreLitSimple, int nombreLitDouble) {
		super(jourReservation, moisReservation, numerosChambre);
		this.nombreLitDouble = nombreLitDouble;
		this.nombreLitSimple = nombreLitSimple;
	}

	public int getNombreLitSimple() {
		return nombreLitSimple;
	}

	public int getNombreLitDouble() {
		return nombreLitDouble;
	}

}
