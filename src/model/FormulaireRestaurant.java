package model;

public class FormulaireRestaurant extends Formulaire{
	
	private int nombrePersonnes;
	private int numerosService;

	public FormulaireRestaurant(int jourReservation, int moisReservation, int nombreConvives, int numerosService, int numerosTable) {
		super(jourReservation, moisReservation, numerosTable);
		this.nombrePersonnes = nombreConvives;
		this.numerosService = numerosService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numerosService;
	}
}
