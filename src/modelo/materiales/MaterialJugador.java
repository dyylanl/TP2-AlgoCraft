package modelo.materiales;

import modelo.herramientas.Golpe;
import modelo.herramientas.Herramienta;

public class MaterialJugador extends Material{
		
	public MaterialJugador() {
		this.durabilidad = 0;
		this.identidad = "0";
		this.imagen = "jugador.png";
	}
	

	public void recibeGolpeDe(Herramienta unaHerramienta) {
		
	}

	@Override
	public Character getIdentificador() {
		return 'M';
	}

	@Override
	public void golpear(Golpe golpe) {

	}
}
