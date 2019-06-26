package modelo.jugador;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import modelo.constructores.MesaDeCrafteo;
import modelo.excepciones.HerramientaNoSeleccionadaException;
import modelo.excepciones.HerramientaRotaException;
import modelo.excepciones.JugarSinHerramientaEquipadaException;
import modelo.excepciones.MaterialRotoException;
import modelo.materiales.*;
import modelo.herramientas.*;
import modelo.posicion.*;
import modelo.mapas.*;

public class Jugador {
	
	public Herramienta herramientaEquipada;
	public String imagen;
	public Posicion posicionActual;
	private MesaDeCrafteo mesaDeCrafteo;
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


	public void golpearMaterial(Material material) {
		try {
			if (this.herramientaEquipada == null) {
				throw new JugarSinHerramientaEquipadaException();
			}
			this.herramientaEquipada.usarContra(material);
		} catch (MaterialRotoException ex) {
			this.inventario.agregarMaterial(material);
			throw ex;
		} catch (HerramientaRotaException ex) {
			this.herramientaEquipada = null;
			throw ex;
		}
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
		this.mesaDeCrafteo = new MesaDeCrafteo();
		this.inventario = new Inventario();
		this.posicionActual = new Posicion(0,0);
		this.inventario.agregarHerramienta(new HachaDeMadera());
		this.estaPosicionado = false;
		this.herramientaSeleccionada = new HachaDeMadera();
		this.imagen = "jugador.png";

	}

	public Jugador(Mapa mapa) {

		this.mesaDeCrafteo = new MesaDeCrafteo();
		this.inventario = new Inventario();
		this.posicionActual = new Posicion(0,0);
		this.inventario.agregarHerramienta(new HachaDeMadera());
		this.estaPosicionado = false;
		this.mapa = mapa;
		this.herramientaSeleccionada = new HachaDeMadera();

	}

	public boolean inventarioContieneHerramienta(Herramienta herramienta) {
		return this.inventario.contieneHerramienta(herramienta);
	}

	public boolean inventarioContieneMaterial(Material material) {
		return this.inventario.contieneMaterial(material);
	}


	public void setPosicion(int fila, int columna) {

		this.posicionActual.x =(columna);
		this.posicionActual.y =(fila);
		this.estaPosicionado = true;
	}

	public int getPosicionColumna() {
		return this.posicionActual.x;
	}

	public int getPosicionFila() {
		return this.posicionActual.y;
	}

	public void seleccionarMaterial(int posicion) {

		this.materialSeleccionado = this.inventario.seleccionarMaterial(posicion);

	}

	public void seleccionarHerramienta(int posicion) {

		this.herramientaSeleccionada = this.inventario.seleccionarHerramienta(posicion);

	}

	public void deseleccionarHerramienta(){

		this.herramientaSeleccionada = null;
	}

	public void colocarEnMesa(int posicion) {
		this.mesaDeCrafteo.colocar(this.materialSeleccionado, posicion);
	}

	public void craftear() {

		this.inventario.agregarHerramienta(this.mesaDeCrafteo.construir());
	}

	public void agregarMaterialAInventario(Material material) {
		this.inventario.agregarMaterial(material);
	}

	public void agregarHerramientaAInventario(Herramienta herramienta) {
		this.inventario.agregarHerramienta(herramienta);
	}

	public boolean estaPosicionado(){
		return this.estaPosicionado;
	}

	// ---------- EL JUGADOR TENDRIA QUE TENER ESTOS METODOS:

/*	public void golpear(Direccion direccion){

		if(this.herramientaSeleccionada == null){
			throw new HerramientaNoSeleccionadaException();
		}
		direccion.golpear(mapa, herramientaSeleccionada, this);
		if(herramientaSeleccionada.getDurabilidad() <= 0){

			inventario.desecharHerramientaRota();
			this.herramientaSeleccionada = null;
		}
	}

*/
	public double getDurabilidadHerramientaActual() {
		return this.herramientaSeleccionada.getDurabilidad();
	}


}


