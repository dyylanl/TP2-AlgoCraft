package modelo.jugador;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import modelo.constructores.MesaDeCrafteo;
import modelo.materiales.*;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;
import modelo.interfaz.*;

public class Jugador implements ObjetoMinecraft{
	
	public Herramienta herramientaEquipada;
	public String imagen;
	public Posicion posicionActual;
	private MesaDeCrafteo mesaDeCrafteo;
	private Inventario inventario;


	public Jugador() {
		
		this.herramientaEquipada = new HachaDeMadera();
		this.imagen = "jugador.png";
		this.posicionActual = new Posicion(0,0);
		this.mesaDeCrafteo = new MesaDeCrafteo();
		this.inventario = new Inventario();

	}


	public Herramienta getHerramientaEquipada() {
		return herramientaEquipada;
	}


	public void moverAUnaPosicion(Posicion nuevaPosicion) {

		this.posicionActual = nuevaPosicion;
		
	}


	public Posicion miPosicion() {

		return posicionActual;
	}


	public String getImagen() {

		return this.imagen;

	}


    public Posicion moverArriba() {

    	this.posicionActual = posicionActual.getPosicionArriba();
    	return this.posicionActual;

    }


	public Posicion moverDerecha() {


		//this.posicionActual = posicionActual.getPosicionDerecha();
		return this.posicionActual.getPosicionDerecha();

	}


	public Posicion moverIzquierda() {

		this.posicionActual = posicionActual.getPosicionIzquierda();
		return this.posicionActual;
	}


	public Posicion moverAbajo() {

		this.posicionActual = posicionActual.getPosicionAbajo();
		return this.posicionActual;

	}


	public void setHerramientaEquipada(Herramienta nuevaHerramienta){

		this.herramientaEquipada = nuevaHerramienta;

	}


	public void agregarMaterialAInventario(Material material) {

		this.inventario.setMaterial(material);

	}


	public void agregarHerramientaAInventario(Herramienta herramienta) {

		this.inventario.setHerramienta(herramienta);

	}


}
