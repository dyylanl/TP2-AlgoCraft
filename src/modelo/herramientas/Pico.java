package modelo.herramientas;

import modelo.materiales.Material;

public abstract class Pico{
	
	protected int durabilidad;
	protected int fuerza;
	protected double factorDeDesgaste;
	
	public int getDurabilidad() {
		return durabilidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public abstract void usar(Material unMaterial);
	
}
