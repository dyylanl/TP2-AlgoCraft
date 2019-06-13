package modelo.mapas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.jugador.*;
import modelo.mapas.*;
import modelo.interfaz.*;

public class MapasTest{

	@Test
	public void JugadorPuedeOcuparUnCasilleroDesocupado(){
		Posicion posicion = new Posicion(2 , 5);
		Jugador jugador = new Jugador();
		
		int filasMapa = 20, columnasMapa = 40;


		Mapa mapa = new Mapa(filasMapa, columnasMapa);

		Assert.assertTrue(mapa.posicionarJugador(jugador));
	}


	@Test
	public void JugadorNoPuedeOcuparUnCasilleroOcupado(){
		Posicion posicion = new Posicion(2 , 5);
		Posicion mismaPosicion = new Posicion(2 , 5);
		Material material = new Metal();
		Jugador jugador = new Jugador();
		
		
		int filasMapa = 20, columnasMapa = 40;

		Mapa mapa = new Mapa(filasMapa, columnasMapa);
		
		mapa.posicionarJugador(jugador, posicion);
		Assert.assertFalse(mapa.posicionarJugador(jugador, mismaPosicion));
	}
	
	@Test
	public void MaterialPuedeOcuparUnCasilleroDesocupado(){
		Posicion posicion = new Posicion(2 , 5);
		Material material= new Madera();
		
		int filasMapa = 20, columnasMapa = 40;


		Mapa mapa = new Mapa(filasMapa, columnasMapa);

		Assert.assertTrue(mapa.posicionarMaterial(material));
	}



	/*@Test
	public void seObtieneElObjetoEsperado(){
		Posicion posicion = new Posicion(2, 5);
		Posicion otraPos = new Posicion(2, 5);
		Jugador jugador = new Jugador();
		
		int filasMapa = 20, columnasMapa = 40;


		Mapa mapa = new Mapa(filasMapa, columnasMapa);
		mapa.posicionarJugador(jugador, posicion);
		ObjetoMinecraft objeto = mapa.obtenerObjeto(posicion);
		
		
		Assert.assertTrue();
	}
*/	
	
}
