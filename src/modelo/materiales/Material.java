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
	
	public Posicion miPosicion(){
		return this.posicion;
	}

	public boolean posicionar(Mapa mapa, Posicion nuevaPosicion){
		
		MaterialEnMapa objeto = new MaterialEnMapa(this);
		
		if(mapa.ocuparEspacio(objeto, nuevaPosicion)){ //atrapar la excepcion
			this.posicion = nuevaPosicion;
			return true;
		}
		return false;
	}

}
