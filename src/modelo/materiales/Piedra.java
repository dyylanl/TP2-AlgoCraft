package modelo.materiales;

import modelo.herramientas.*;

public class Piedra extends Material {
	
	public Piedra() {
		durabilidad = 30;
		identidad = "2";
	}
	
	public void recibeGolpeDe(Herramienta unaHerramienta) {
		unaHerramienta.gopear(this);
	}

}

