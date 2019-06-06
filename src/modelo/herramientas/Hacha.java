package modelo.herramientas;

import modelo.materiales.*;

public abstract class Hacha extends Herramienta{

	public void usar(Material unMaterial) {
		// TODO Auto-generated method stub
		durabilidad -= fuerza*factorDeDesgaste;
	}
	
	public Boolean validar(Material unMaterial){
		return (unMaterial instanceof Madera) ;
	}

}
