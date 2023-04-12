package model;

public class Restaurant {
	
	private CentraleReservation<Table, FormulaireRestaurant> centrale;
	
	public Restaurant() {
		centrale = new CentraleReservation<>(new Table[100]);
	}
	
	public void ajouterTable(int nbChaise) {
		Table table = new Table(nbChaise);
		centrale.ajouterEntite(table);
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numEntite, formulaire);
	}
	
	 public String toString() {
		 return centrale.toString();
	 }
	
	public static class Table extends EntiteReservable<Formulaire>{
		
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();
		
		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}
		
		public boolean compatible(Formulaire formulaire) {
			FormulaireRestaurant f = (FormulaireRestaurant) formulaire;
			if (!(nbChaises == f.getNombrePersonnes() || f.getNombrePersonnes() == nbChaises - 1)) return false;
			if (f.getIdentificationEntite() == 1)
				return carnetReservation.estLibre(formulaire.getJour(),formulaire.getMois());
			return calendrierDeuxiemeService.estLibre(formulaire.getJour(),formulaire.getMois());
		}
		
		public Reservation reserver(Formulaire formulaire) {
			FormulaireRestaurant f = (FormulaireRestaurant) formulaire;
			boolean reservation = false;
			ReservationRestaurant res = null;
			if (f.getNumService() == 1) {
				reservation = carnetReservation.reserver(f.getJour(), f.getMois());
			}
			else {
				reservation = calendrierDeuxiemeService.reserver(f.getJour(), f.getMois());

			}
			if (reservation) {
				res = new ReservationRestaurant(f.getJour(), f.getMois(), f.getNumService(), f.getNombrePersonnes());
			}
			return res;
		}

	}

}
