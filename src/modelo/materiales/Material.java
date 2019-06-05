package modelo.materiales;

import modelo.herramientas.Hacha;

public abstract class Material {
	
	protected int durabilidad;
	
	public int getDurabilidad(){
		return durabilidad;
	}

	public abstract void recibeGolpeDe(Hacha hachaDePiedra);
}
