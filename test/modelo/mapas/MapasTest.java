package modelo.mapas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.jugador.*;
import modelo.mapas.*;

public class MapasTest{

	@Test
	public void JugadorIntentaOcuparUnEspacioVacioEnMapaEsTrue(){
		Posicion posicion = new Posicion(2 , 5);
		Jugador jugador = new Jugador();
		
		ObjetoEnMapa jugadorEnMapa = new JugadorEnMapa(jugador);
		int filasMapa = 20, columnasMapa = 40;


		Mapa mapa = new Mapa(filasMapa, columnasMapa);

		Assert.assertTrue(mapa.ocuparEspacio(jugadorEnMapa, posicion));
	}

	@Test
	public void JugadorIntentaOcuparElEspacioOcupadoDeMaterialEsFalse(){
		Posicion posicion = new Posicion(2 , 5);
		Material material = new Metal();
		Jugador jugador = new Jugador();
		
		ObjetoEnMapa jugadorEnMapa = new JugadorEnMapa(jugador);
		
		
		int filasMapa = 20, columnasMapa = 40;

		Mapa mapa = new Mapa(filasMapa, columnasMapa);
		
		ObjetoEnMapa materialEnMapa = new MaterialEnMapa(material);
		
		mapa.ocuparEspacio(materialEnMapa, posicion);
		Assert.assertFalse(mapa.ocuparEspacio(jugadorEnMapa, posicion));
	}

	@Test
	public void seObtieneElObjetoEsperado(){
		Posicion posicion = new Posicion(2, 5);
		Posicion otraPos = new Posicion(2, 5);
		Jugador jugador = new Jugador();
		
		int filasMapa = 20, columnasMapa = 40;


		Mapa mapa = new Mapa(filasMapa, columnasMapa);
		jugador.moverAUnaPosicion(mapa, posicion);
		
		ObjetoEnMapa objeto = mapa.obtenerObjeto(posicion);
		
		Assert.assertTrue(otraPos.igualPosicionA(objeto.miPosicion()));
	}
	
}
