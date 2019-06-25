package modelo.constructores;

import modelo.materiales.*;

import java.util.*;

import modelo.herramientas.*;
import modelo.posicion.Posicion;

public class MesaDeCrafteo{


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
}