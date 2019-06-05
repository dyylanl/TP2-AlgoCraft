package modelo.herramientas;

import modelo.materiales.Material;

public class PicoDeMetal extends Pico{
	
	protected float factorDesgaste;
	
	public PicoDeMetal(){
	
		durabilidad = 400;
		fuerza = 12;
		factorDesgaste = 10;
		
	}
	
	public void usar(Material unMaterial) {
		
		if (factorDesgaste >= 1) factorDesgaste -= 1;
		
	}

	
}
