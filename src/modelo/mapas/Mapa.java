package modelo.mapas;	

import java.util.*;

import modelo.jugador.*;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.interfaz.*;


public class Mapa{


	public ArrayList<Posicion> posicionesVacias;
	protected HashMap<Posicion, ObjetoMinecraft> terreno;
	private int indicePosicionVacia;
	//Maximo en x y en y igual a 12.


	public Mapa(){

		this.indicePosicionVacia = 0;
		this.posicionesVacias = new ArrayList<Posicion>();
		this.terreno = new HashMap<Posicion, ObjetoMinecraft>();
		cargarMapa();

	}



	private void cargarMapa(){

		for(int i = 0; i <= 12; i++){

			for(int j = 0; j <= 12; j++){

				Posicion posicion = new Posicion(i,j);
				this.posicionesVacias.add(posicion);
				SinMaterial vacio = new SinMaterial();
				posicionarMaterial(vacio,posicion);
			}

		}

	}


	public Posicion getPosicionVacia(){

		Posicion posicion = this.posicionesVacias.get(this.indicePosicionVacia);
		this.posicionesVacias.remove(this.indicePosicionVacia);
		this.indicePosicionVacia = (int)(Math.random() * 150) + 1;
		return posicion;

	}

	
	public ObjetoMinecraft obtenerObjeto(Posicion unaPos){
		
		return this.terreno.get(unaPos);		
			
	}


	public boolean posicionInvalida(Posicion unaPosicion){

		boolean filtro1 = this.terreno.containsKey(unaPosicion);
		boolean filtro2 = (!unaPosicion.estaEnLimmites(0, 0, 12,12));
		
		return (filtro1 || filtro2);
	}


	public Posicion posicionarMaterial(Material unMaterial){

		Posicion posicion = getPosicionVacia();
		this.terreno.put(posicion, unMaterial);
		return posicion;
	}


	public void posicionarMaterial(Material unMaterial, Posicion unaPosicion){

		this.terreno.put(unaPosicion, unMaterial);

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
