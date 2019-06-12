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
		Posicion posicion = new Posicion();
		Jugador jugador = new Jugador();
		
		int filasMapa = 20, columnasMapa = 40;
		posicion.setX(2);
		posicion.setY(5);

		Mapa mapa = new Mapa(filasMapa, columnasMapa);

		Assert.assertTrue(mapa.ocuparEspacio(jugador, posicion));
	}

	@Test
	public void JugadorIntentaOcuparElEspacioOcupadoDeMaterialEsFalse(){
		Posicion posicion = new Posicion();
		Material material = new Metal();
		Jugador jugador = new Jugador();
		
		int filasMapa = 20, columnasMapa = 40;
		posicion.setX(2);
		posicion.setY(5);

		Mapa mapa = new Mapa(filasMapa, columnasMapa);
		mapa.ocuparEspacio(material, posicion);
		Assert.assertFalse(mapa.ocuparEspacio(jugador, posicion));
	}



	@Test
	public void MapainicializadoCorrectamente(){

		int filasMapa = 20, columnasMapa = 40;
		Mapa  mapa = new Mapa(filasMapa, columnasMapa);
		Boolean ocupado = true; 
		Posicion pos = new Posicion();
		
		for(int i = 0; i<filasMapa ;i++){
			pos.setX(i);
			for(int j = 0; j<columnasMapa ;j++){
				pos.setY(i);
				ocupado = mapa.posicionOcupada(pos); // lugares desocupados
					if(ocupado) break;
			}
		}

		Assert.assertFalse(ocupado);

	}

}
