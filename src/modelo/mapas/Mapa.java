package modelo.mapas;	

import java.util.*;

import modelo.juego.ModeloObservable;
import modelo.jugador.*;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.interfaz.*;


public class Mapa{


	public ArrayList<Posicion> posicionesVacias;
	protected HashMap<Posicion, ObjetoMinecraft> terreno;
	private int indicePosicionVacia;
	//Maximo en x y en y igual a 13.


	public Mapa(){

		this.indicePosicionVacia = 0;
		this.posicionesVacias = new ArrayList<Posicion>();
		this.terreno = new HashMap<Posicion, ObjetoMinecraft>();

	}


	public Mapa(ModeloObservable modelo){

		this.indicePosicionVacia = 0;
		this.posicionesVacias = new ArrayList<Posicion>();
		this.terreno = new HashMap<Posicion, ObjetoMinecraft>();
		cargarMapa(modelo);
		
	}


	public void cargarMapa(ModeloObservable modelo){

		for(int i = 0; i <= 13; i++){

			for(int j = 0; j <= 13; j++){

				Posicion posicion = new Posicion(i,j);
				this.posicionesVacias.add(posicion);

			}

		}

	}


	public Posicion getPosicionVacia(){

		Posicion posicion;
		posicion = this.posicionesVacias.get(this.indicePosicionVacia);
		this.posicionesVacias.remove(this.indicePosicionVacia);
		this.indicePosicionVacia = (int)(Math.random() * 13 + 1);
		System.out.println("[DEBUG] Posicion: (" +posicion.x + ","+posicion.y+")");
		System.out.println("[DEBUG] Indice variable:"+this.indicePosicionVacia);
		return posicion;

	}

	
	public ObjetoMinecraft obtenerObjeto(Posicion unaPos){
		
		return this.terreno.get(unaPos);		
			
	}


	public boolean posicionInvalida(Posicion unaPosicion){

		boolean filtro1 = this.terreno.containsKey(unaPosicion);
		boolean filtro2 = (!unaPosicion.estaEnLimmites(0, 0, 13,13));
		
		return (filtro1 || filtro2);
	}


	public Posicion posicionarMaterial(Material unMaterial){

		Posicion posicion = getPosicionVacia();
		this.terreno.put(posicion, unMaterial);
		return posicion;
	}


	public Posicion posicionarJugador(ObjetoMinecraft unJugador){

		Posicion posicion = getPosicionVacia();
		this.terreno.put(posicion, unJugador);
		return posicion;

	}


	public boolean posicionarJugador(Jugador unJugador, Posicion unaPosicion){

		if(this.posicionInvalida(unaPosicion)) return false;
		this.terreno.put(unaPosicion, unJugador);
		unJugador.moverAUnaPosicion(unaPosicion);
		return true;

	}


}
