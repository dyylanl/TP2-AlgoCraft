package modelo.constructores;

import modelo.materiales.*;

import java.awt.List;
import java.util.*;

import modelo.herramientas.*;

public class MesaDeCrafteo{
	
	protected Mesa mesa;
	protected java.util.List<ConstructorDeHachaDeMadera> constructores; 
	protected int cantidad = 9;
	
	public MesaDeCrafteo(){
		mesa = new Mesa(cantidad);
		//constructor = new ConstructorDeHerramientas[cantidad];
		constructores = Arrays.asList(new ConstructorDeHachaDeMadera());
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