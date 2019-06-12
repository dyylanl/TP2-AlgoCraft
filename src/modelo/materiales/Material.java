package modelo.materiales;

import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.mapas.*;

public abstract class Material {

	//Atributos:
	protected String identidad;
	protected int durabilidad;
	protected Posicion posicion;

	//Metodos:
	public abstract void recibeGolpeDe(Herramienta unaHerramienta);
	
	public boolean esEquivalante(Material otroMaterial) {
		return this.getIdentidad() == otroMaterial.getIdentidad();
	}

	public int getDurabilidad(){
		return durabilidad;
	}

	public void reducirDurabilidad(int fuerza){ 
		this.durabilidad -=fuerza; 
	}

	public String getIdentidad() {
		return identidad;
	}
	

	public Boolean posicionar(Mapa mapa, Posicion nuevaPosicion){
		this.posicion.nuevaPosicion(nuevaPosicion);
		return mapa.ocuparEspacio(this, nuevaPosicion); //atrapar la excepcion

	}

}
