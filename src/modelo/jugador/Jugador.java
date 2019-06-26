package modelo.jugador;
import modelo.constructores.Mesa;
import modelo.materiales.*;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;

public class Jugador {
	
	public Herramienta herramientaEquipada;
	public String imagen;
	public Posicion posicionActual;
	private Mesa mesaDeCrafteo;
	private Inventario inventario;
	public boolean estaPosicionado;
	public Herramienta herramientaSeleccionada;
	public Mapa mapa;
	public Material materialSeleccionado;



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


    public void golpear(Material unMaterial){

		Herramienta herramienta = this.getHerramientaEquipada();
		herramienta.usarContra(unMaterial);

	}


	public void equipar(Herramienta herramienta) {
		if (this.herramientaEquipada != null) {
			this.inventario.agregarHerramienta(this.herramientaEquipada);
		}

		this.herramientaEquipada = herramienta;
	}

    public Inventario getInventario() {

		return this.inventario;

    }

	public Jugador(){

		this.herramientaEquipada = new HachaDeMadera();
		this.mesaDeCrafteo = new Mesa(9);
		this.inventario = new Inventario();
		this.posicionActual = new Posicion(0,0);
		this.inventario.agregarHerramienta(new HachaDeMadera());
		this.estaPosicionado = false;
		this.herramientaSeleccionada = new HachaDeMadera();
		this.imagen = "jugador.png";

	}

	public Jugador(Mapa mapa) {

		this.mesaDeCrafteo = new Mesa(9);
		this.inventario = new Inventario();
		this.posicionActual = new Posicion(0,0);
		this.inventario.agregarHerramienta(new HachaDeMadera());
		this.estaPosicionado = false;
		this.mapa = mapa;
		this.herramientaSeleccionada = new HachaDeMadera();

	}


}


