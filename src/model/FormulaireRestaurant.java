package model;

public class FormulaireRestaurant extends Formulaire{
	
	private int nombrePersonnes;
	private int numerosService;

	public FormulaireRestaurant(int jourReservation, int moisReservation, int numerosTable, int numerosService) {
		super(jourReservation, moisReservation);
		this.nombrePersonnes = numerosTable;
		this.numerosService = numerosService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numerosService;
	}
}
