package modelo.materiales;

import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;
import modelo.herramientas.Pico;

public class Madera extends Material{
		
	public Madera(){
		durabilidad = 10;
		identidad = "1";
	}

	
	public void recibeGolpeDe(Herramienta unaHerramienta) {
		unaHerramienta.gopear(this);
	}

	
}
