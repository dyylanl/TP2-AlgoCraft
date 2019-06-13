package modelo.jugador;
import modelo.mapas.*;
import modelo.posicion.Posicion;

public class MovimientosJugador {

	public boolean moverJugadorArriba(Jugador unJugador, Mapa mapa){
		
		Posicion posNueva = unJugador.miPosicion().getPosicionArriba();
		return mapa.posicionarJugador(unJugador, posNueva);
			
	}
	
	public boolean moverJugadorAbajo(Jugador unJugador, Mapa mapa){
		
		Posicion posNueva = unJugador.miPosicion().getPosicionAbajo();
		
		return mapa.posicionarJugador(unJugador, posNueva);

	}

	public boolean moverJugadorDerecha(Jugador unJugador, Mapa mapa){
		Posicion posNueva = unJugador.miPosicion().getPosicionDerecha();
		
		return mapa.posicionarJugador(unJugador, posNueva);
	}

	public boolean moverJugadorIzquierda(Jugador unJugador, Mapa mapa){
		Posicion posNueva = unJugador.miPosicion().getPosicionIzquierda();
		
		return mapa.posicionarJugador(unJugador, posNueva);
	}

	
}
