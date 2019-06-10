package modelo.materiales;

import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;
import modelo.herramientas.Pico;

public class Diamante extends Material{
	
	public Diamante(){
		durabilidad = 100;
		identidad = "4";
	}
	

	public void recibeGolpeDe(Herramienta unaHerramienta) {
		unaHerramienta.gopear(this);
	}

}
