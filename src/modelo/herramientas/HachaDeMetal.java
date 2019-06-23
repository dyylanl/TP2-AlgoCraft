package modelo.herramientas;


public class HachaDeMetal extends Hacha  {
	
	public HachaDeMetal() {
		this.durabilidad = 400f;
		this.fuerza = 10;
		this.factorDeDesgaste = 0.5f;
	}


	@Override
	public String getIdentificador() {
		return "Hacha de metal";
	}
}