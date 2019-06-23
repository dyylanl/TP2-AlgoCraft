package modelo.jugador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.*;
import modelo.mapas.*;
import modelo.posicion.*;

public class JugadorTest {
	
	@Test
	public void jugadorIniciaConHachaDeMadera() {
		Jugador jugador = new Jugador();
		 
		Assert.assertTrue(jugador.getHerramientaEquipada() instanceof HachaDeMadera);
	}

	@Test
	public void jugadorSeMueveAunaPosicionVaciaEsTrue() {
		Jugador jugador = new Jugador();
		Mapa mapa = new Mapa();
		Posicion posicion = new Posicion(1,1);

		Assert.assertTrue(mapa.posicionarJugador(jugador, posicion));
	}

	@Test
	public void jugadorSeMueveALaDerecha() {
		Jugador jugador = new Jugador();
		Jugador jugador2 = new Jugador();
		Mapa mapa = new Mapa();
		Posicion posicion = new Posicion(1,1);
		Posicion posicion2 = new Posicion(0,1);
		mapa.posicionarJugador(jugador, posicion);
		mapa.posicionarJugador(jugador2, posicion2);
		
		MovimientosJugador movs = new MovimientosJugador(jugador2);
		
		
		Assert.assertTrue(movs.moverJugadorAbajo(mapa));
	}

	
}
