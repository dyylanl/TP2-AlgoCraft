package modelo.materiales;

import modelo.herramientas.Hacha;

public abstract class Material {

	//Atributos:
	protected String miClase;
	protected int durabilidad;


	//Metodos:
	/*
	public Herramienta Herramienta(String miClase){ 
		this.miClase = miClase;
	}
	*/
	
	public int getDurabilidad(){
		return durabilidad;
	}

	public void reducirDurabilidad(int fuerza){ 
		this.durabilidad -=fuerza; 
	}

	public String getClase() {
		return miClase;
	}

}
