package modelo.mapas;	

import java.util.*;

import modelo.herramientas.*;
import modelo.jugador.*;
import modelo.posicion.*;
import modelo.materiales.*;

public class Mapa{

	protected HashMap<Posicion, ObjetoEnMapa> terreno;
	private int x,y;
	

	public Mapa(int filas, int columnas){
		this.x = 0;
		this.y = 0;
		this.terreno = new HashMap<Posicion, ObjetoEnMapa>();

		
	}

	public boolean ocuparEspacio(ObjetoEnMapa objeto, Posicion unaPosicion){
		
		if(this.posicionOcupada(unaPosicion)) return false;
		
		this.terreno.put(unaPosicion, objeto);
		
		return true;
	}

	public ObjetoEnMapa obtenerObjeto(Posicion unaPos){
		
		return this.terreno.get(unaPos);		
			
	}
	
	public Boolean posicionOcupada(Posicion unaPosicion){
		return this.terreno.containsKey(unaPosicion);
	}


	public void posicionarMaterial(Material unMaterial){

		MaterialEnMapa material = new MaterialEnMapa(unMaterial);

		this.terreno.put(obtenerPosicionAleatoria(),material);

	}


	public void posicionarJugador(Jugador unJugador){

		JugadorEnMapa jugador = new JugadorEnMapa(unJugador);

		this.terreno.put(obtenerPosicionAleatoria(),jugador);

	}


	private Posicion obtenerPosicionAleatoria(){

		Posicion posicion = new Posicion(this.x,this.y);
		this.x++;
		this.y++;
		return posicion;
	}

}
