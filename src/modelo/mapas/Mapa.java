package modelo.mapas;	

import java.util.*;


import modelo.herramientas.*;
import modelo.jugador.*;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.interfaz.*;

public class Mapa{

	protected HashMap<Posicion, ObjetoMinecraft> terreno;
	private int x,y;
	protected int maxX, maxY; 
	

	public Mapa(int filas, int columnas){
		this.x = 0;
		this.y = 0;
		this.maxX = columnas;
		this.maxY = filas;
		this.terreno = new HashMap<Posicion, ObjetoMinecraft>();
		
	}

	
	public ObjetoMinecraft obtenerObjeto(Posicion unaPos){
		
		return this.terreno.get(unaPos);		
			
	}
	
	public boolean posicionInvalida(Posicion unaPosicion){
		boolean filtro1 = this.terreno.containsKey(unaPosicion);
		boolean filtro2 = (!unaPosicion.estaEnLimmites(0, 0, this.maxX, this.maxY));
		
		return (filtro1 || filtro2);
	}


	public boolean posicionarMaterial(Material unMaterial){

		//MaterialEnMapa material = new MaterialEnMapa(unMaterial);
		Posicion unaPosicion = this.obtenerPosicionAleatoria();
		if(this.posicionInvalida(unaPosicion)) return false;
		
		this.terreno.put(unaPosicion, unMaterial);
		return true;
	}


	public boolean posicionarJugador(ObjetoMinecraft unJugador){

		//JugadorEnMapa jugador = new JugadorEnMapa(unJugador);
		Posicion unaPosicion = this.obtenerPosicionAleatoria();
		if(this.posicionInvalida(unaPosicion)) return false;
		this.terreno.put(unaPosicion, unJugador);
		return true;

	}

	public boolean posicionarJugador(Jugador unJugador, Posicion unaPosicion){

		//JugadorEnMapa jugador = new JugadorEnMapa(unJugador);
		if(this.posicionInvalida(unaPosicion)) return false;
		this.terreno.put(unaPosicion, unJugador);
		unJugador.moverAUnaPosicion(unaPosicion);
		return true;

	}


	private Posicion obtenerPosicionAleatoria(){

		Posicion posicion = new Posicion(this.x,this.y);
		this.x++;
		this.y++;
		return posicion;
	}

}
