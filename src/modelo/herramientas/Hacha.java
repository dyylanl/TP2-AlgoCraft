package modelo.herramientas;

import modelo.materiales.Material;

public abstract class Hacha {
	
	protected int durabilidad;
	protected int fuerza;
	protected double factorDeDesgaste;
	
	public int getDurabilidad() {
		return durabilidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void usar(Material unMaterial) {
		// TODO Auto-generated method stub
		durabilidad -= fuerza*factorDeDesgaste;
	}

}
