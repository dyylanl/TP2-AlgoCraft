package modelo.constructores;

import modelo.materiales.*;
import modelo.herramientas.*;
import modelo.posicion.Posicion;

public class ConstructorDePicoDeMadera extends CrafteoHerramientas{
	
	public ConstructorDePicoDeMadera(){

		crafteo.put(new Posicion(0,0), new Madera());
		crafteo.put(new Posicion(0,1), new Madera());
		crafteo.put(new Posicion(1,0), new Madera());
		crafteo.put(new Posicion(1,1), new Madera());
		crafteo.put(new Posicion(1,2), new Madera());
	}

	@Override
	public Herramienta crearHerramienta() {
		return new PicoDeMadera();
	}

}