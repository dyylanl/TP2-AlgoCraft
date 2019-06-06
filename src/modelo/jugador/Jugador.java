package modelo.jugador;
import modelo.herramientas.HachaDeMadera;

public class Jugador {
	
	protected HachaDeMadera herramientaEquipada;
	

	public Jugador() {
		
		herramientaEquipada = new HachaDeMadera();
		
	}
	
	public HachaDeMadera getHerramientaEquipada() {
		return herramientaEquipada;
	}

}
