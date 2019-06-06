package modelo.herramientas;

import modelo.materiales.Material;

public abstract class Hacha extends Herramienta{

	public void usar(Material unMaterial) {
		// TODO Auto-generated method stub
		durabilidad -= fuerza*factorDeDesgaste;
	}

}
