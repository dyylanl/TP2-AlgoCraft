package modelo.constructores;

import modelo.materiales.*;

import java.util.*;

import modelo.herramientas.*;

public class MesaDeCrafteo{
	
	protected Mesa mesa;
	protected java.util.List<ConstructorDeHerramientas> constructores; 
	protected int cantidad = 9;
	
	public MesaDeCrafteo(){
		mesa = new Mesa(cantidad);
		//constructor = new ConstructorDeHerramientas[cantidad];
		constructores = Arrays.asList(new ConstructorDeHachaDeMadera(), 
										new ConstructorDeHachaDePiedra(),
										new ConstructorDeHachaDeMetal(),
										new ConstructorDePicoDeMetal(),
										new ConstructorDePicoDeMadera(),
										new ConstructorDePicoDePiedra(),
										new ConstructorDePicoFino()
										);
	}
	
	public void agregarMaterialEnPosicion(Material unMaterial,int unaPosicion) {
		mesa.agregarMaterialEnPosicion(unMaterial, unaPosicion);
	}
	
	public Herramienta crearHerramienta(){
		for(ConstructorDeHerramientas constructor: constructores) {
			if(constructor.puedeConstruir(mesa)) {
				return constructor.ConstruirHerramienta();
			}
		}
		return null;
	}
}