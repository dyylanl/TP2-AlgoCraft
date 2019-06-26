package controlador;


import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import vista.*;

public class MoverJugadorEventHandler implements EventHandler<KeyEvent>{
	
	JuegoVista juegoVista;
	
	
	public MoverJugadorEventHandler(JuegoVista juegoVista) {
		this.juegoVista = juegoVista;
	}
	
	
	@Override
	public void handle(KeyEvent event) {
        if(event.getCode() == KeyCode.W) {
        	this.juegoVista.controlador.moverArriba(this.juegoVista.mapa);
        }
        if( event.getCode() == KeyCode.S) {
        	this.juegoVista.controlador.moverAbajo(this.juegoVista.mapa);
        }
        if (event.getCode() == KeyCode.D) {
        	this.juegoVista.controlador.moverDerecha(this.juegoVista.mapa);
        }
        if (event.getCode() == KeyCode.A) {
        	this.juegoVista.controlador.moverIzquierda(this.juegoVista.mapa);
        } 
        //event.consume();
    }
}