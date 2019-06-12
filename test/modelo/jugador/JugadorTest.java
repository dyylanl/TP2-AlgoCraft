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
		Mapa mapa = new Mapa(20, 30);

		Posicion posicion = new Posicion();
		posicion.setX(1);
		posicion.setY(1);

		Assert.assertTrue(jugador.moverAUnaPosicion(mapa, posicion));
	}

	@Test
	public void jugadorSeMueveALaMismaPosicionEsFalse() {
		Jugador jugador = new Jugador();
		Mapa mapa = new Mapa(20, 30);

		Posicion posicion = new Posicion();
		posicion.setX(1);
		posicion.setY(1);
		jugador.moverAUnaPosicion(mapa, posicion);
		Assert.assertFalse(jugador.moverAUnaPosicion(mapa, posicion));
	}


}
