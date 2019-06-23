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

		Posicion posicionFutura = new Posicion(this.posicionActual.x+1,this.posicionActual.y);
		this.posicionActual = posicionFutura;

    }

	public void moverDerecha() {


		Posicion posicionFutura = new Posicion(this.posicionActual.x,this.posicionActual.y+1);
		this.posicionActual = posicionFutura;



	}

	public void moverIzquierda() {

		Posicion posicionFutura = new Posicion(this.posicionActual.x-1,this.posicionActual.y);
		this.posicionActual = posicionFutura;

	}

	public void moverAbajo() {

		Posicion posicionFutura = new Posicion(this.posicionActual.x,this.posicionActual.y-1);
		this.posicionActual = posicionFutura;


	}
}
