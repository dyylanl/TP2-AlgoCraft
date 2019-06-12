package modelo.mapas;

import modelo.jugador.Jugador;
import modelo.materiales.*;
import modelo.posicion.*;

public class MaterialEnMapa extends ObjetoEnMapa{
	
	Material material;
	
	public MaterialEnMapa(Material material){
		this.material= material;
	}
	
	public Posicion miPosicion(){
		return material.miPosicion();
	}

}
