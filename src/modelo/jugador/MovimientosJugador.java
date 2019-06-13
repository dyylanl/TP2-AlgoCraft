package modelo.jugador;
import modelo.mapas.*;
import modelo.posicion.Posicion;

public class MovimientosJugador {

	public boolean moverJugadorArriba(Jugador unJugador, Mapa mapa){
		
		Posicion posAnterior = unJugador.miPosicion();
		Posicion posNueva = new Posicion(posAnterior.x(), posAnterior.y()+1); 
		
		return mapa.posicionarJugador(unJugador, posNueva);
			
	}
	
	public boolean moverJugadorAbajo(Jugador unJugador, Mapa mapa){
		
		Posicion posAnterior = unJugador.miPosicion();
		Posicion posNueva = new Posicion(posAnterior.x(), posAnterior.y()-1); 
		
		return mapa.posicionarJugador(unJugador, posNueva);

	}

	public boolean moverJugadorDerecha(Jugador unJugador, Mapa mapa){
		Posicion posAnterior = unJugador.miPosicion();
		Posicion posNueva = new Posicion(posAnterior.x()+1, posAnterior.y()); 
		
		return mapa.posicionarJugador(unJugador, posNueva);
	}

	public boolean moverJugadorIzquierda(Jugador unJugador, Mapa mapa){
		Posicion posAnterior = unJugador.miPosicion();
		Posicion posNueva = new Posicion(posAnterior.x()-1, posAnterior.y()); 
		
		return mapa.posicionarJugador(unJugador, posNueva);
	}

	
}
