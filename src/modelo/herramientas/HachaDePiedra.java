package modelo.herramientas;

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
}
