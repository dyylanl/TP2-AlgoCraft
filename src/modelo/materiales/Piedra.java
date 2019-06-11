package modelo.materiales;

import modelo.herramientas.*;

public class Piedra extends Material {
	
	public Piedra() {
		this.durabilidad = 30;
		this.identidad = "2";
	}
	
	public void recibeGolpeDe(Herramienta unaHerramienta) {
		unaHerramienta.golpear(this);
	}
}

