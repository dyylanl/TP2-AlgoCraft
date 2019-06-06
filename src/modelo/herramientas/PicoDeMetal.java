package modelo.herramientas;

import modelo.materiales.Material;

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

	
}
