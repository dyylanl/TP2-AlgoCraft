package modelo.materiales;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.herramientas.*;
import modelo.interfaz.*;
import modelo.posicion.*;
import modelo.materiales.*;
import modelo.mapas.*;

public abstract class Material implements ObjetoMinecraft{

	//Atributos:
	protected String identidad;
	protected int durabilidad;
	protected Posicion posicion;
	public String imagen;

	//Metodos:
	public abstract void recibeGolpeDe(Herramienta unaHerramienta);

	public boolean esEquivalante(Material otroMaterial) {
		return this.getIdentidad() == otroMaterial.getIdentidad();
	}

	public int getDurabilidad(){
		return durabilidad;
	}

	public void reducirDurabilidad(int fuerza){ 
		this.durabilidad -=fuerza; 
	}

	public String getIdentidad() {
		return identidad;
	}

	public Posicion getPosicion(){

		return this.posicion;

	}


	public String getImagen(){ return this.imagen; }

}
