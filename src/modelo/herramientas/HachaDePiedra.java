package modelo.herramientas;

import modelo.materiales.Material;

public class HachaDePiedra extends Hacha {
	
	public HachaDePiedra() {
		this.durabilidad = 200.0f;
		this.fuerza = 5;
		this.factorDeDesgaste = 1;
	}

	@Override
	public String getIdentificador() {
		return "Hacha de piedra";
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
