package modelo.herramientas;

import modelo.materiales.*;

public class PicoFino extends Pico{

	public PicoFino(){
		
		durabilidad = 1000;
		fuerza = 20;
		factorDeDesgaste = 0.1f;
		
	}
	
	@Override
	public void usar(Material unMaterial) {
		
		if(this.validar(unMaterial)){ 
			unMaterial.reducirDurabilidad(this.getFuerza());
			this.desgastarse();
			
		}
		
	}
	
	@Override
	public void desgastarse() {
		durabilidad -= durabilidad*factorDeDesgaste;
		if(durabilidad <0) durabilidad = 0; // ENTONCES SE ROMPE LA HERRAMIENTA
											// FALTA IMPLEMENTAR ESO
	}
	
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Diamante) ;
	}
	
	
}
