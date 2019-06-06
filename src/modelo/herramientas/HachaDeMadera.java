package modelo.herramientas;

import modelo.materiales.Material;

public class HachaDeMadera extends Hacha  {

	protected String materialQueDania;

	public HachaDeMadera(String materialQueDania) {
		durabilidad = 100;
		fuerza = 2;
		factorDeDesgaste = 1.0;
		this.materialQueDania = materialQueDania;
	}
	
	
}
