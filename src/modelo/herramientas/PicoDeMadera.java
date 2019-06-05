package modelo.herramientas;

import modelo.materiales.Material;

public class PicoDeMadera extends Pico{
	
	public PicoDeMadera(){
	
		durabilidad = 100;
		fuerza = 2;
		
	}
	
	public void usar(Material unMaterial) {
		// TODO Auto-generated method stub
		durabilidad -= fuerza;
	}

	
}
