package modelo.constructores;

import modelo.materiales.*;

import java.util.*;

import modelo.herramientas.*;
import modelo.posicion.Posicion;


public class MesaDeCrafteo{

    /*    Recetas:
            Hacha de madera   "mm-mm--m-"
            Hacha de piedra   "pp-pm--m-"
            Hacha de metal    "MM-Mm--m-"
            Pico de madera    "mmm-m--m-"
            Pico de piedra    "ppp-m--m-"
            Pico de metal     "MMM-m--m-"
            Pico fino         "MMMpm--m-"
     */

		private Material[] tablero;
		protected Constructor constructor;

		public MesaDeCrafteo(){
			constructor = new Constructor();
			tablero = new Material[9];
			for(int i = 0; i < 9; i++){

				tablero[i] = null;
			}
		}

		public String getRecetaParaConstruir(){

			StringBuilder clave = new StringBuilder();

			for(Material material: tablero){
				if(material != null) {
					clave.append(material.getIdentificador());
				} else {

					clave.append('-');
				}
			}

			return clave.toString();
		}

		public void disponerMaterialesParaPicoDeMadera() {
			tablero[0] = new Madera();
			tablero[1] = new Madera();
			tablero[2] = new Madera();
			tablero[3] = null;
			tablero[4] = new Madera();
			tablero[5] = null;
			tablero[6] = null;
			tablero[7] = new Madera();
			tablero[8] = null;
		}

		public void colocar(Material material, int pos) {

			tablero[pos] = material;
		}



		//   ------------- ARREGLAR -------------
		public Herramienta construir(){
			String receta = this.getRecetaParaConstruir();
			HachaDeMadera hacha = new HachaDeMadera();
			return hacha;
			//return constructor.craftear(receta);
		}
	}




/*
	HashMap<Posicion, Material> mesa = new HashMap<Posicion, Material>();
	CrafteadorHerramientas crafteador;


	public MesaDeCrafteo(CrafteadorHerramientas crafter) {

		this.crafteador = crafter;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Posicion posicion = new Posicion(0, 0);
				mesa.put(posicion, null);
			}
		}
	}


	public void agregarMaterial(Posicion posicion, Material material) {
		mesa.put(posicion, material);
	}


	public void removerMaterial(Posicion posicion) {
		mesa.remove(posicion);
	}


	public Material obtenerMaterial(Posicion posicion) {
		return this.mesa.get(posicion);
	}


	public Herramienta crear() {
		return crafteador.crear(this.mesa);
	}


	public void limpiar() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Posicion posicion = new Posicion(i, j);
				mesa.replace(posicion, null);
			}
		}
	}


	public void colocar(Material unMaterial,int posicion){

		Posicion posicion1 = new Posicion(posicion,0);
		mesa.put(posicion1,unMaterial);

	}
*/

	/*
	public MesaDeCrafteo(){
		mesa = new Mesa(cantidad);
		//constructor = new ConstructorDeHerramientas[cantidad];
	}
	
	public void agregarMaterialEnPosicion(Material unMaterial,int unaPosicion) {
		mesa.agregarMaterialEnPosicion(unMaterial, unaPosicion);
	}
	
	public Herramienta crearHerramienta(){
		for(ConstructorDeHerramientas constructor: ConstructorDeHerramientas.getConstructores()) {
			if(constructor.puedeConstruir(mesa)) {
				return constructor.ConstruirHerramienta();
			}
		}
		return null;
	}

	public void limpiar() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Posicion posicion = new Posicion(i, j);
				mesa.agregarMaterialEnPosicion(null,posicion);
			}
		}
	}*/