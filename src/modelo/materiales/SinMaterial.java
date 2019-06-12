package modelo.materiales;

import modelo.herramientas.Herramienta;

public class SinMaterial extends Material{
	
	public SinMaterial() {
		durabilidad = 0;
		identidad = "SinMaterial"; 
	}

	@Override
	public void recibeGolpeDe(Herramienta unaHerramienta) {
	}
}