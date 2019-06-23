package modelo.herramientas;

import modelo.materiales.Diamante;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;

public class PicoDeMetal extends Pico{
	
	public PicoDeMetal(){
		
		this.durabilidad = 400f;
		this.fuerza = 12;
		this.factorDeDesgaste = 10f; // ESTO EN REALIDAD ES LA CANTIDAD DE USOS

	}
	
	@Override
	public void desgastarse() {
		factorDeDesgaste -= 1;
		if(factorDeDesgaste == 1) durabilidad = 0; // ENTONCES SE ROMPE LA HERRAMIENTA
											// FALTA IMPLEMENTAR ESO
	}

	public void golpear(Piedra unaPiedra) {
		unaPiedra.reducirDurabilidad(this.getFuerza());
		this.desgastarse();
	}
	
	public void golpear(Metal unMetal) {
		this.desgastarse();
	}
	
	public void golpear(Diamante unaDiamante) {
		this.desgastarse();
	}

	@Override
	public String getIdentificador() {
		return "Pico de metal";
	}
}
