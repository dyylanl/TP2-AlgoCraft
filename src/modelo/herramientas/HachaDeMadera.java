package modelo.herramientas;

import modelo.golpeador.Golpeador;
import modelo.materiales.Material;

public class HachaDeMadera extends Hacha  {


	public HachaDeMadera() {
		durabilidad = 100;
		fuerza = 2;
		factorDeDesgaste = 1.0f;
		golpeador = new Golpeador("madera");
	}

	@Override
	public void desgastarse() {
		
	}
	
}
