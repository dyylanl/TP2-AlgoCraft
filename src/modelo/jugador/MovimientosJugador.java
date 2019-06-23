package modelo.jugador;
import modelo.mapas.*;
import modelo.posicion.Posicion;

public class MovimientosJugador {
	
	public Jugador jugador;
	public Posicion posActual;
	
	public MovimientosJugador(Jugador unJugador){
		this.jugador = unJugador;
		this.posActual = unJugador.miPosicion();
	}
	
	public boolean moverJugadorArriba(Mapa mapa){
		
		
		Posicion posNueva = this.jugador.miPosicion().getPosicionArriba();
		return mapa.posicionarJugador(this.jugador, posNueva);
			
	}
	
	public boolean moverJugadorAbajo(Mapa mapa){
		
		Posicion posNueva = this.jugador.miPosicion().getPosicionAbajo();
		return mapa.posicionarJugador(this.jugador, posNueva);

	}

	public boolean moverJugadorDerecha(Mapa mapa){
		System.out.println("entre en movjugador derecha");
		
		Posicion posNueva = this.jugador.miPosicion().getPosicionDerecha();
		return mapa.posicionarJugador(this.jugador, posNueva);
	}

	public boolean moverJugadorIzquierda(Mapa mapa){
		
		Posicion posNueva = this.jugador.miPosicion().getPosicionIzquierda();
		return mapa.posicionarJugador(this.jugador, posNueva);
	}

	
}
