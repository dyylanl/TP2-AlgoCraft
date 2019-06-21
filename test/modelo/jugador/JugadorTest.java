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

}
