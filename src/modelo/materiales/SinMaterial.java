package modelo.materiales;

import javafx.scene.image.Image;
import modelo.herramientas.Herramienta;

public class SinMaterial extends Material{
	
	public SinMaterial() {
		this.durabilidad = 0;
		this.identidad = "0";
		this.imagen = "negro.png";
	}

	@Override
	public void recibeGolpeDe(Herramienta unaHerramienta) {
	}

	@Override
	public Character getIdentificador() {
		return 'v';
	}
}