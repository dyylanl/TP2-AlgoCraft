package modelo.jugador;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;
import modelo.interfaz.*;

public class Jugador implements ObjetoMinecraft{
	
	protected HachaDeMadera herramientaEquipada;
	
	Posicion posicionActual;

	public Jugador() {
		
		herramientaEquipada = new HachaDeMadera();

	}
	
	public HachaDeMadera getHerramientaEquipada() {
		return herramientaEquipada;
	}


	public void moverAUnaPosicion(Posicion nuevaPosicion){	 
		this.posicionActual = nuevaPosicion;
		
	}
	
	public Posicion miPosicion(){
		return posicionActual;
	}
	
}
