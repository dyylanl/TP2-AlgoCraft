package modelo.herramientas;

import modelo.materiales.*;

public abstract class Pico extends Herramienta{
	
	public void usar(Material unMaterial) {
		
		if(this.validar(unMaterial)){ 
			unMaterial.reducirDurabilidad(this.getFuerza());
		}
		this.desgastarse();
		
	}
	
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Piedra) ;
	}
	
	@Override
	public void desgastarse() {
		durabilidad -= fuerza*factorDeDesgaste;
		if(durabilidad <0) durabilidad = 0; // ENTONCES SE ROMPE LA HERRAMIENTA
											// FALTA IMPLEMENTAR ESO
	}
}
