package modelo.mapas;

import org.junit.Test;
import junit.framework.Assert;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.jugador.*;


public class MapasTest{


	@Test
	public void JugadorNoPuedeOcuparUnCasilleroOcupado(){
		Posicion posicion = new Posicion(2 , 5);
		Posicion mismaPosicion = new Posicion(2 , 5);
		Material material = new Metal();
		Jugador jugador = new Jugador();
		Mapa mapa = new Mapa();
		mapa.posicionarJugador(jugador, posicion);

		Assert.assertFalse(mapa.posicionarJugador(jugador, mismaPosicion));
	}


	@Test
	public void mapaSeInicializaVacio(){

		Mapa mapa = new Mapa();

		for(int i = 0; i <= 13; i++){

			for(int j = 0; j <= 13; j++){

				Posicion posicionActual = new Posicion(i,j);
				Assert.assertTrue(mapa.obtenerObjeto(posicionActual) == null);

			}

		}

	}


}
