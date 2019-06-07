package modelo.herramientas;

import modelo.golpeador.Golpeador;
import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;

public class PicoDeMadera extends Pico{
	
	public PicoDeMadera(){
	
		durabilidad = 100f;
		fuerza = 2;
		factorDeDesgaste = 1f;

	}
	
	public void gopear(Piedra unaPiedra) {
		unaPiedra.reducirDurabilidad(this.getFuerza());
		this.desgastarse();
	}
	
	public void gopear(Metal unaMaetal) {
		this.desgastarse();
	}
	
	public void gopear(Diamante unaDiamante) {
		this.desgastarse();
	}
}
