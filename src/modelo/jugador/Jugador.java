package modelo.jugador;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;

public class Jugador {
	
	protected HachaDeMadera herramientaEquipada;
	
	Posicion posicionActual;

	public Jugador() {
		
		herramientaEquipada = new HachaDeMadera();
		posicionActual = new Posicion();
	

	}
	
	public HachaDeMadera getHerramientaEquipada() {
		return herramientaEquipada;
	}


	public Boolean moverAUnaPosicion(Mapa mapa, Posicion nuevaPosicion){
		this.posicionActual.nuevaPosicion(nuevaPosicion);
		return mapa.ocuparEspacio(this, nuevaPosicion); //atrapar la excepcion

	}



}
