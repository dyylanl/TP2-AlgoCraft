package controlador;


import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import vista.*;

public class HandlerMover implements EventHandler<KeyEvent>{
	
	VistaJuego juegoVista;
	GridPane mapa;
	
	public HandlerMover(JuegoVista juegoVista, GridPane mapa) {
		this.juegoVista = juegoVista;
		this.mapa = mapa;
	}
	
	
	@Override
	public void handle(KeyEvent event) {
		
        if(event.getCode() == KeyCode.W) {
        	this.juegoVista.controlador().moverArriba(mapa);
        }
        if( event.getCode() == KeyCode.S) {
        	this.juegoVista.controlador().moverAbajo(mapa);
        }
        if (event.getCode() == KeyCode.D) {
        	this.juegoVista.controlador().moverDerecha(mapa);
        }
        if (event.getCode() == KeyCode.A) {
        	this.juegoVista.controlador().moverIzquierda(mapa);
        } 
        
        //event.consume();
		
	}
}