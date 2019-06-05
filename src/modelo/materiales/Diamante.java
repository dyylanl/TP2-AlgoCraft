package modelo.materiales;

import modelo.herramientas.Hacha;

public class Diamante extends Material{
	
	public Diamante(){
		durabilidad = 100;
	}
	
	public void recibeGolpeDe(Hacha unaHerramienta) {
		durabilidad -= unaHerramienta.getFuerza(); 
	}

}
