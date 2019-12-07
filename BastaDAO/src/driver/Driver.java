package driver;

import model.BastaDAO;
import model.BastaTO;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println(".:: Basta Model ::.");
		
		System.out.println("Creando Juego de Basta...");
		
		BastaTO myBastaTO = new BastaTO();
		
		myBastaTO.setLetra('A');
		myBastaTO.setNombre ("Alejandro");
		myBastaTO.setApellido ("Alvarez");
		myBastaTO.setFlorFruto ("Ardillas");
		myBastaTO.setAnimal ("Aguamala");
		
		BastaDAO myBastaDAO = new BastaDAO();
		
		myBastaDAO.guardarJuego(myBastaTO);		
	
	}	
	
}