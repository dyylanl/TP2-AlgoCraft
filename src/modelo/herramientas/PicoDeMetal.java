package modelo.herramientas;

import modelo.materiales.Diamante;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;

public class PicoDeMetal extends Pico{
	
	public PicoDeMetal(){
		
		durabilidad = 400f;
		fuerza = 12;
		factorDeDesgaste = 10f; // ESTO EN REALIDAD ES LA CANTIDAD DE USOS

	}
	
	@Override
	public void desgastarse() {
		factorDeDesgaste -= 1;
		if(factorDeDesgaste == 1) durabilidad = 0; // ENTONCES SE ROMPE LA HERRAMIENTA
											// FALTA IMPLEMENTAR ESO
	}

	public void gopear(Piedra unaPiedra) {
		unaPiedra.reducirDurabilidad(this.getFuerza());
		this.desgastarse();
	}
	
	public void gopear(Metal unMetal) {
		this.desgastarse();
	}
	
	public void gopear(Diamante unaDiamante) {
		this.desgastarse();
	}
}
