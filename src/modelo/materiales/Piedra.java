package modelo.materiales;

import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;

public class Piedra extends Material {
	
	public Piedra() {
		durabilidad = 30;
	}
	/*
	public void recibeGolpeDe(Hacha unaHerramienta) {
		durabilidad -= unaHerramienta.getFuerza(); 
	}
	*/
	
	public void recibeGolpeDe(Herramienta unaHerramienta) {
		unaHerramienta.gopear(this);
	}
}

