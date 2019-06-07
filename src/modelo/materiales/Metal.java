package modelo.materiales;

import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;
import modelo.herramientas.Pico;

public class Metal extends Material {

	public Metal() {
		durabilidad = 50;
	}
	

	public void recibeGolpeDe(Herramienta unaHerramienta) {
		unaHerramienta.gopear(this);
	}
}
