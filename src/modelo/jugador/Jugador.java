package modelo.jugador;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import modelo.constructores.MesaDeCrafteo;
import modelo.excepciones.HerramientaRotaException;
import modelo.excepciones.JugarSinHerramientaEquipadaException;
import modelo.excepciones.MaterialRotoException;
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


    public Inventario obtenerInventario() {
		return this.inventario;
    }


	public void golpearMaterial(Material material) {
		try {
			if (this.herramientaEquipada == null) {
				throw new JugarSinHerramientaEquipadaException();
			}
			this.herramientaEquipada.usarContra(material);
		} catch (MaterialRotoException ex) {
			this.inventario.agregarAlInventario(material);
			throw ex;
		} catch (HerramientaRotaException ex) {
			this.herramientaEquipada = null;
			throw ex;
		}
	}


	public void equipar(Herramienta herramienta) {
		if (this.herramientaEquipada != null) {
			this.inventario.agregarAlInventario(this.herramientaEquipada);
		}
		this.inventario.removerGuardable(herramienta);
		this.herramientaEquipada = herramienta;
	}
}
