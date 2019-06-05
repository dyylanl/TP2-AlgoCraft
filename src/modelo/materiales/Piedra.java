package modelo.materiales;

import modelo.herramientas.Hacha;

public class Piedra extends Material {
	
	public Piedra() {
		durabilidad = 30;
	}
	
	public void resibeGolpeDe(Hacha unaHerramienta) {
		durabilidad -= unaHerramienta.getFuerza(); 
	}
}

