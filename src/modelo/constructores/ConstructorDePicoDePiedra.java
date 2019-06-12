package modelo.constructores;

import modelo.materiales.*;
import modelo.herramientas.*;

public class ConstructorDePicoDePiedra extends ConstructorDeHerramientas{

	public ConstructorDePicoDePiedra() {
		int cantidadDeMateriales = 9;
		mesa = new Mesa(cantidadDeMateriales);
		mesa.agregarMaterialEnPosicion(new Piedra(), 0);
		mesa.agregarMaterialEnPosicion(new Piedra(), 1);
		mesa.agregarMaterialEnPosicion(new Piedra(), 2);
		mesa.agregarMaterialEnPosicion(new Madera(), 4);
		mesa.agregarMaterialEnPosicion(new Madera(), 7);
	}
	
	@Override
	public Herramienta ConstruirHerramienta() {
		return new PicoDePiedra();
	}

}