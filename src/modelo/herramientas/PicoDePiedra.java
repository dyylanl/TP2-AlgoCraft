package modelo.herramientas;

import modelo.materiales.*;

public class PicoDePiedra extends Pico{
	
	public PicoDePiedra(){
		
		durabilidad = 200f;
		fuerza = 4;
		factorDeDesgaste = 1.5f;

	}

	@Override
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Piedra || unMaterial instanceof Metal) ;
	}
	
	
}
