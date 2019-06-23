package modelo.jugador;
import javafx.scene.image.Image;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;
import modelo.interfaz.*;

public class Jugador implements ObjetoMinecraft{
	
	protected HachaDeMadera herramientaEquipada;
	public String imagen;
	
	Posicion posicionActual;

	public Jugador() {
		
		herramientaEquipada = new HachaDeMadera();
		this.imagen = "jugador.png";
	}
	
	public HachaDeMadera getHerramientaEquipada() {
		return herramientaEquipada;
	}


	public void moverAUnaPosicion(Posicion nuevaPosicion){	 
		this.posicionActual = nuevaPosicion;
		
	}


	public Posicion miPosicion(){
		return posicionActual;
	}


	public String getImagen(){ return this.imagen;}


    public void moverArriba() {

    	this.posicionActual = posicionActual.getPosicionArriba();

    }

	public void moverDerecha() {


		this.posicionActual = posicionActual.getPosicionDerecha();


	}

	public void moverIzquierda() {

		this.posicionActual = posicionActual.getPosicionIzquierda();

	}

	public void moverAbajo() {

		this.posicionActual = posicionActual.getPosicionAbajo();


	}
}
