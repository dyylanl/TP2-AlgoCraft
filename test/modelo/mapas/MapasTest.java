package modelo.mapas;


import org.junit.Test;
import junit.framework.Assert;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.jugador.*;

import java.util.ArrayList;


public class MapasTest {


	@Test
	public void JugadorNoPuedeOcuparUnCasilleroOcupado() {
		Posicion posicion = new Posicion(2, 5);
		Posicion mismaPosicion = new Posicion(2, 5);
		Material material = new Metal();
		Jugador jugador = new Jugador();
		Mapa mapa = new Mapa();
		mapa.posicionarJugador(jugador, posicion);

		Assert.assertFalse(mapa.posicionarJugador(jugador, mismaPosicion));

	}

	@Test
	public void JugadorExisteEnElMapa() {
		Posicion posicion = new Posicion(2, 5);
		Posicion mismaPosicion = new Posicion(2, 5);
		Material material = new Metal();
		Jugador jugador = new Jugador();
		Mapa mapa = new Mapa();
		mapa.posicionarJugador(jugador, posicion);
		String id = mapa.obtenerObjeto(mismaPosicion).getImagen();
	
		Assert.assertTrue(id == "jugador.png");

		
	}
	/*
	@Test
	public void mapaSeInicializaVacio() {

		Mapa mapa = new Mapa();

		for (int i = 0; i <= 12; i++) {

			for (int j = 0; j <= 12; j++) {

				Posicion posicionActual = new Posicion(i, j);
				Assert.assertTrue(mapa.obtenerObjeto(posicionActual) == null);
			}

		}
	}
*/
}
