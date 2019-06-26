package modelo.mapas;	

import java.util.*;

import modelo.jugador.*;
import modelo.posicion.*;
import modelo.materiales.*;


public class Mapa{


	public ArrayList<Posicion> posicionesVacias;
	protected HashMap<Posicion, Material> terreno;
	private int indicePosicionVacia;
	protected Material sinMaterial;
	private int maximo = 12;
	//Maximo en x y en y igual a 12.


	public Mapa(){
		this.sinMaterial = new SinMaterial();
		this.indicePosicionVacia = 0;
		this.posicionesVacias = new ArrayList<Posicion>();
		this.terreno = new HashMap<Posicion, Material>();
		cargarMapa();

	}


	private void cargarMapa(){

		for(int i = 0; i < maximo; i++){

			for(int j = 0; j < maximo; j++){

				Posicion posicion = new Posicion(i,j);
				this.posicionesVacias.add(posicion);

			}

		}

	}


	public Posicion getPosicionVacia(){

		Posicion posicion = this.posicionesVacias.get(this.indicePosicionVacia);
		this.posicionesVacias.remove(this.indicePosicionVacia);
		this.indicePosicionVacia = (int)(Math.random() * this.posicionesVacias.size()-1) + 1;
		return posicion;

	}

	
	public Material obtenerObjeto(Posicion unaPos){
		if(terreno.containsKey(unaPos)) {
			return this.terreno.get(unaPos);	
		}
		return this.sinMaterial;
			
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
		if (this.posicionInvalida(unaPosicion)) return ;
		this.terreno.put(unaPosicion, unMaterial);

	}


	public Posicion posicionarJugador(Jugador unJugador){

		Posicion posicion = getPosicionVacia();
		unJugador.moverAUnaPosicion(posicion);
		this.terreno.put(posicion, new MaterialJugador());
		return posicion;

	}


	public boolean posicionarJugador(Jugador unJugador, Posicion unaPosicion) {

		if (this.posicionInvalida(unaPosicion)) return false;
		this.terreno.remove(unJugador.miPosicion());
		unJugador.moverAUnaPosicion(unaPosicion);
		System.out.println("jugador se movio");
		this.terreno.put(unaPosicion, new MaterialJugador());
		return true;

	}


}
