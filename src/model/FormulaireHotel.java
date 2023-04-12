package model;

public class FormulaireHotel extends Formulaire{
	
	private int nombreLitSimple;
	private int nombreLitDouble;
	private int numerosChambre;
	
	public FormulaireHotel(int jourReservation, int moisReservation, int numerosChambre, int nombreLitSimple, int nombreLitDouble) {
		super(jourReservation, moisReservation);
		this.nombreLitDouble = nombreLitDouble;
		this.nombreLitSimple = nombreLitSimple;
		this.numerosChambre = numerosChambre;
	}

	public int getNombreLitSimple() {
		return nombreLitSimple;
	}

	public int getNombreLitDouble() {
		return nombreLitDouble;
	}
	
	public int getNumerosChambre() {
		return numerosChambre;
	}

}
