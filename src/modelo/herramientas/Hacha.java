package modelo.herramientas;

import modelo.materiales.*;

public abstract class Hacha extends Herramienta{

	/*
	public void usar(Material unMaterial) {
		
		if(this.validar(unMaterial)){ 
			unMaterial.reducirDurabilidad(this.getFuerza());
		}
		this.desgastarse();
		
	}
	*/
	/*
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Madera) ;
	}
	*/
	
	
	
	@Override
	public void desgastarse() {
		durabilidad -= fuerza*factorDeDesgaste;
		/*
		if(durabilidad <0) durabilidad = 0; // ENTONCES SE ROMPE LA HERRAMIENTA
											// FALTA IMPLEMENTAR ESO
											 * */									
	}
	
	public void golpear(Madera unaMadera) {
		unaMadera.reducirDurabilidad(this.getFuerza());
		this.desgastarse();
	}
	
	public void golpear(Piedra unaPiedra) {

		this.desgastarse();

	}
	
	public void golpear(Metal unaMaetal) {

		this.desgastarse();

	}
	
	public void golpear(Diamante unaDiamante){

		this.desgastarse();

	}
	
}
