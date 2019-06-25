package modelo.herramientas;

import modelo.materiales.*;

public class HachaDeMadera extends Hacha  {


	public HachaDeMadera() {
		this.durabilidad = 100;
		this.fuerza = 2;
		this.factorDeDesgaste = 1.0f;
	}


	@Override
	public String getIdentificador() {
		return "Hacha de madera";
	}

	@Override
	public void desgastar(int danio) {

	}

	@Override
	public void usarContra(Material materialARecolectar) {

	}

	@Override
	public String getImagen() {
		return null;
	}
}
