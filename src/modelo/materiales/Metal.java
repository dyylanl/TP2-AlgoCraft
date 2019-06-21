package modelo.materiales;

import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;
import modelo.herramientas.Pico;

public class Metal extends Material {

	public Metal() {
		this.durabilidad = 50;
		this.identidad = "3";
	}
	

	public void recibeGolpeDe(Herramienta unaHerramienta) {
		unaHerramienta.golpear(this);
	}
}
