package modelo.materiales;

import modelo.herramientas.Herramienta;

public class SinMaterial extends Material{
	
	public SinMaterial() {
		durabilidad = 0;
		identidad = "0"; 
	}

	@Override
	public void recibeGolpeDe(Herramienta unaHerramienta) {
	}
}