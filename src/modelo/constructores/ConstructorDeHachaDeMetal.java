package modelo.constructores;

import modelo.materiales.*;
import modelo.herramientas.*;

public class ConstructorDeHachaDeMetal extends ConstructorDeHerramientas{

	public ConstructorDeHachaDeMetal(){
		int cantidadDeMateriales = 9;
		mesa = new Mesa(cantidadDeMateriales);
		mesa.agregarMaterialEnPosicion(new Metal(), 0);
		mesa.agregarMaterialEnPosicion(new Metal(), 1);
		mesa.agregarMaterialEnPosicion(new Metal(), 3);
		mesa.agregarMaterialEnPosicion(new Madera(), 4);
		mesa.agregarMaterialEnPosicion(new Madera(), 7);
	}
	
	@Override
	public Herramienta ConstruirHerramienta() {
		return new HachaDeMetal();
	}

}