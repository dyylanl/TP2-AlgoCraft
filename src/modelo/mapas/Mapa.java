package modelo.mapas;	

import java.util.*;

import modelo.herramientas.*;
import modelo.jugador.*;
import modelo.posicion.*;
import modelo.materiales.*;

public class Mapa{

	protected ObjetoEnMapa terreno[][]; 	


	public Mapa(int filas, int columnas){
		
		this.terreno = new ObjetoEnMapa[filas][columnas];

		for(int i = 0; i<filas ;i++){

			for(int j = 0; j<columnas ;j++){
				this.terreno[i][j] = null; // lugares desocupados
			}

		}
	}


	public Boolean ocuparEspacio(Jugador jugador, Posicion unaPosicion){
		if(this.posicionOcupada(unaPosicion)) return false;// aca tirar excepcion
		
		ObjetoEnMapa objeto = new JugadorEnMapa(jugador);
		
		this.terreno[unaPosicion.x()][unaPosicion.y()] = objeto; //ocupado
		return true;
	}

	public Boolean ocuparEspacio(Material material, Posicion unaPosicion){
		if(this.posicionOcupada(unaPosicion)) return false;// aca tirar excepcion
		
		ObjetoEnMapa objeto = new MaterialEnMapa(material);
		
		this.terreno[unaPosicion.x()][unaPosicion.y()] = objeto; //ocupado
		return true;
	}
	
	public Boolean posicionOcupada(Posicion unaPosicion){
		return (this.terreno[unaPosicion.x()][unaPosicion.y()] != null );
	}


}
