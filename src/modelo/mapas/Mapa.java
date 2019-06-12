package modelo.mapas;	

import java.util.*;

import modelo.herramientas.*;
import modelo.jugador.*;
import modelo.posicion.*;
import modelo.materiales.*;

public class Mapa{

//	protected ObjetoEnMapa terreno[][]; 	
	protected HashMap<Posicion, ObjetoEnMapa> terreno; 	
	

	public Mapa(int filas, int columnas){
		
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
	
	/*
	public Boolean ocuparEspacio(JugadorEnMapa jugador, Posicion unaPosicion){
		if(this.posicionOcupada(unaPosicion)) return false;// aca tirar excepcion
		
		//ObjetoEnMapa objeto = new JugadorEnMapa(jugador);
		
		this.terreno[unaPosicion.x()][unaPosicion.y()] = jugador; //ocupado
		return true;
	}

	public Boolean ocuparEspacio(Material material, Posicion unaPosicion){
		if(this.posicionOcupada(unaPosicion)) return false;// aca tirar excepcion
		
		ObjetoEnMapa objeto = new MaterialEnMapa(material);
		
		this.terreno[unaPosicion.x()][unaPosicion.y()] = objeto; //ocupado
		return true;
	}
	*/
	
	public Boolean posicionOcupada(Posicion unaPosicion){
		return this.terreno.containsKey(unaPosicion);
	}


}
