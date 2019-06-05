package modelo.herramientas;

import modelo.materiales.Material;

public class PicoDePiedra extends Pico{
	
	protected float factorDesgaste;
	
	public PicoDePiedra(){
	
		durabilidad = 200;
		fuerza = 4;
		factorDesgaste = 1.5f;
		
	}
	
	public void usar(Material unMaterial) {
		// TODO Auto-generated method stub
		durabilidad -= fuerza/factorDesgaste;
	}

	
}
