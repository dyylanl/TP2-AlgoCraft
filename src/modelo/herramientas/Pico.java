package modelo.herramientas;

import modelo.materiales.*;

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

	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Piedra) ;
	}
	
	public abstract void usar(Material unMaterial);
	
}
