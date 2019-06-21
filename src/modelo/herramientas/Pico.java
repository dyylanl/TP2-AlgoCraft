package modelo.herramientas;

import modelo.materiales.*;

public abstract class Pico extends Herramienta{
	
	/*
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Piedra) ;
	}
	*/
	
	@Override
	public void desgastarse() {
		durabilidad -= fuerza*factorDeDesgaste;
		if(durabilidad <0) durabilidad = 0; // ENTONCES SE ROMPE LA HERRAMIENTA
											// FALTA IMPLEMENTAR ESO
	}
	

	public void golpear(Madera unaMadera) {

		this.desgastarse();

	}


	public void golpear(Piedra unaPiedra) { }
	

	public void golpear(Metal unaMaetal) { }


	public void golpear(Diamante unaDiamante) { }

}
