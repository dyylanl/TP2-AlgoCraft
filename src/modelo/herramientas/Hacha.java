package modelo.herramientas;

import modelo.materiales.Material;

public abstract class Hacha extends Herramienta{


	protected double factorDeDesgaste;
	protected String materialQueDania;

	public Hacha(String materialQueDania){ this.materialQueDania = materialQueDania; }
	
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
