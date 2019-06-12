package modelo.jugador;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;

public class Jugador {
	
	protected HachaDeMadera herramientaEquipada;
	
	Posicion posicionActual;

	public Jugador() {
		
		herramientaEquipada = new HachaDeMadera();

	}
	
	public HachaDeMadera getHerramientaEquipada() {
		return herramientaEquipada;
	}


	public void moverAUnaPosicion(Mapa mapa, Posicion nuevaPosicion){
		 //atrapar la excepcion
		//mapa.ocuparEspacio(this, nuevaPosicion)
		JugadorEnMapa objeto = new JugadorEnMapa(this);
		if(mapa.ocuparEspacio(objeto, nuevaPosicion)){
			this.posicionActual = nuevaPosicion;
			
		}
		
	}


	public Posicion miPosicion(){
		return posicionActual;
	}
	
}
