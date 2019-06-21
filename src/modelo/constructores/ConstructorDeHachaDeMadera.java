package modelo.constructores;

import modelo.materiales.*;
import modelo.herramientas.*;

public class ConstructorDeHachaDeMadera extends ConstructorDeHerramientas{
	
	public ConstructorDeHachaDeMadera(){
		int cantidadDeMateriales = 9;
		mesa = new Mesa(cantidadDeMateriales);
		mesa.agregarMaterialEnPosicion(new Madera(), 0);
		mesa.agregarMaterialEnPosicion(new Madera(), 1);
		mesa.agregarMaterialEnPosicion(new Madera(), 3);
		mesa.agregarMaterialEnPosicion(new Madera(), 4);
		mesa.agregarMaterialEnPosicion(new Madera(), 7);
	}

	@Override
	public Herramienta ConstruirHerramienta() {
		return new HachaDeMadera();
	}

}