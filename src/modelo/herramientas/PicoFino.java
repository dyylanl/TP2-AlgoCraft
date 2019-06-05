package modelo.herramientas;

import modelo.materiales.Material;

public class PicoFino extends Pico{
	
	protected float factorDesgaste;
	
	public PicoFino(){
	
		durabilidad = 1000;
		fuerza = 20;
		factorDesgaste = 0.1f;
		
	}
	
	public void usar(Material unMaterial) {
		
		durabilidad -= durabilidad * factorDesgaste;
	}

	
}
