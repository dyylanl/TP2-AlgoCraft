package modelo.herramientas;

import modelo.materiales.*;

public class PicoDeMadera extends Pico{
	
	public PicoDeMadera(){
	
		this.durabilidad = 100f;
		this.fuerza = 2;
		this.factorDeDesgaste = 1f;

	}
	
	public void golpear(Piedra unaPiedra) {

		unaPiedra.reducirDurabilidad(this.getFuerza());
		this.desgastarse();

	}
	
	public void golpear(Metal unaMaetal) {

		this.desgastarse();

	}
	
	public void golpear(Diamante unaDiamante) {

		this.desgastarse();

	}
}
