package modelo.materiales;

import modelo.herramientas.Hacha;

public class Madera extends Material{
		
	public Madera(){
		durabilidad = 10;
	}
	
	public void recibeGolpeDe(Hacha unaHerramienta) {
		durabilidad -= unaHerramienta.getFuerza(); 
	}
}
