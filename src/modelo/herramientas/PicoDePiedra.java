package modelo.herramientas;

import modelo.materiales.*;

public class PicoDePiedra extends Pico{
	
	public PicoDePiedra(){
		
		durabilidad = 200f;
		fuerza = 4;
		factorDeDesgaste = 2f/3f;

	}
/*
	@Override
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Piedra || unMaterial instanceof Metal) ;
	}
	*/
	
	public void gopear(Piedra unaPiedra) {
		unaPiedra.reducirDurabilidad(this.getFuerza());
		this.desgastarse();
	}
	
	public void gopear(Metal unMetal) {
		unMetal.reducirDurabilidad(this.getFuerza());
		this.desgastarse();
	}
	
	public void gopear(Diamante unaDiamante) {
		this.desgastarse();
	}
}
