package modelo.materiales;

import javafx.scene.image.Image;
import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;
import modelo.herramientas.Pico;

public class Diamante extends Material{
	
	public Diamante(){
		durabilidad = 100;
		identidad = "4";
		this.imagen = "diamante.png";
	}
	

	public void recibeGolpeDe(Herramienta unaHerramienta) {

		unaHerramienta.golpear(this);

	}

	@Override
	public Character getIdentificador() {
		return 'd';
	}

}
