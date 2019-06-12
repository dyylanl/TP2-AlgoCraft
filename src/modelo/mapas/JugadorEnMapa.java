package modelo.mapas;
import modelo.jugador.*;
import modelo.posicion.*;

public class JugadorEnMapa extends ObjetoEnMapa{

	Jugador jugador;
	
	public JugadorEnMapa(Jugador jugador){
		this.jugador = jugador;
	}
	
	public Posicion miPosicion(){
		return jugador.miPosicion();
	}
	
	public void moverseEnX(int Xmetros){
		
	}
	
}
