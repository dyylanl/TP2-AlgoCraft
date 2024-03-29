package modelo.herramientas;

import modelo.materiales.*;

public class PicoDeMadera extends Pico{
	
	public PicoDeMadera(){
	
		this.durabilidad = 100f;
		this.fuerza = 2;
		this.factorDeDesgaste = 1f;

	}
	
	public void golpear(Piedra unaPiedra) {

		unaPiedra.reducirDurabilidad(this.getFuerza());
		this.desgastarse();

	}
	
	
	public void golpear(Diamante unaDiamante) {

		this.desgastarse();

	}

	@Override
	public String getIdentificador() {
		return "Pico de madera";
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
