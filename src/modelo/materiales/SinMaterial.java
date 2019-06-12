package modelo.materiales;

import modelo.herramientas.Herramienta;

public class SinMaterial extends Material{
	
	public SinMaterial() {
		this.durabilidad = 0;
		this.identidad = "0";
	}

	@Override
	public void recibeGolpeDe(Herramienta unaHerramienta) {
	}
}