package test_fonctionnel;

import java.awt.EventQueue;

import control.*;
import dialog.*;
import frontiere.*;
import model.*;
import presentation.*;

public class TestReserverTable_IHM {
	
	public static void main(String[] args) {
		System.out.println("---------- CREER CLIENT ----------");
		// ENTITE : Creation du carnet de clientele
		CarnetClientele carnetClientele = new CarnetClientele();
		//
		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientele);
		BoundaryCreerClient boundaryCreerClient = new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();
		
		System.out.println("\n---------- CONNECTER CLIENT ----------");
		
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientele);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		int numClient = boundaryConnecterClient.connecterClient();
		
		System.out.println("\n---------- RESERVER TABLE ----------");
		
		// ENTITE : Creation et configuration du restaurant
		Restaurant restaurant = new Restaurant();
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(8);
		//
		ControlReserverTable controlReserverTable = new ControlReserverTable(restaurant, carnetClientele);
		ControlVisualiserCarnetClientele controlVisualiserCarnetClientele = new ControlVisualiserCarnetClientele(carnetClientele);
		DialogReservation dialogReservation = new DialogReservation(controlReserverTable, controlVisualiserCarnetClientele);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dialogReservation.initDialog();
					dialogReservation.handleUserConnected(numClient);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
