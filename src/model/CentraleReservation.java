package model;

public class CentraleReservation <T extends EntiteReservable<Formulaire>, U extends Formulaire> {
	
	private T[] entites;
	private int nombreEntite = 0;
	
	public CentraleReservation(T[] entites) {
		this.entites = entites;
	}
	
	public int ajouterEntite(T entite) {
		entites[nombreEntite] = entite;
		nombreEntite ++;
		entite.setNumIdentification(nombreEntite);
		return entite.getNumIdentification();
	}
	
	public int[] donnerPossibilites(U formulaire) {
		int[] tab = new int[nombreEntite];
		for (int i = 0; i<nombreEntite; i++) {
			tab[i] = 0;
			if (entites[i].compatible(formulaire)) {
				tab[i] = entites[i].getNumIdentification();
			}
		}
		return tab;
	}
	
	public Reservation reserver(int numeroEntite,U formulaire) {
		EntiteReservable<Formulaire> entite = entites[numeroEntite-1];
		formulaire.setIdentificationEntite(numeroEntite);
		return entite.reserver(formulaire);
	}
	
	public String toString() {
		StringBuilder retour = new StringBuilder();
		for (int i = 0;i<entites.length && entites[i] != null;i++) {
			retour.append(entites[i].toString());
			retour.append("\n");
		}
		return retour.toString();
	}

}
