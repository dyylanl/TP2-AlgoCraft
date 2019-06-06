package modelo.herramientas;

import modelo.materiales.*;

public class PicoDePiedra extends Pico{
	
	protected float factorDesgaste;
	
	public PicoDePiedra(){
	
		durabilidad = 200;
		fuerza = 4;
		factorDesgaste = 1.5f;
		
	}
	
	@Override
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Piedra || unMaterial instanceof Metal ) ;
	}
	
	public void usar(Material unMaterial) {
		// TODO Auto-generated method stub
		durabilidad -= fuerza/factorDesgaste;
	}

	
}
