package modelo.materiales;

import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;
import modelo.herramientas.Pico;

public abstract class Material {

	//Atributos:
	protected String identidad;
	protected int durabilidad;

	//Metodos:
	public abstract void recibeGolpeDe(Herramienta unaHerramienta);

	public int getDurabilidad(){
		return durabilidad;
	}

	public void reducirDurabilidad(int fuerza){ 
		this.durabilidad -=fuerza; 
	}

	public String getIdentidad() {
		return identidad;
	}

}
