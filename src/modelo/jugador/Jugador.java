package modelo.jugador;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;
import modelo.interfaz.*;

public class Jugador implements ObjetoMinecraft{
	
	protected HachaDeMadera herramientaEquipada;
	public String imagen;
	public Posicion posicionActual;

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


    public Posicion moverArriba() {

    	this.posicionActual = posicionActual.getPosicionArriba();
    	return this.posicionActual;

    }

	public Posicion moverDerecha() {


		this.posicionActual = posicionActual.getPosicionDerecha();
		return this.posicionActual;

	}

	public Posicion moverIzquierda() {

		this.posicionActual = posicionActual.getPosicionIzquierda();
		return this.posicionActual;
	}

	public Posicion moverAbajo() {

		this.posicionActual = posicionActual.getPosicionAbajo();
		return this.posicionActual;

	}
}
