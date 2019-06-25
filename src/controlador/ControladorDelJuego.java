package controlador;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.*;
import modelo.interfaz.ObjetoMinecraft;
import modelo.juego.Juego;
import modelo.posicion.Posicion;
import vista.JuegoVista;

import java.util.HashMap;

public class ControladorDelJuego {

    private Juego juego;
    private JuegoVista juegoVista;
    private HashMap<Character, String> BloquesHash = new HashMap<>();
    private int jugadorPosX, jugadorPosY;
    private ControladorDeInventario controladorDeInventario;


    public ControladorDelJuego(JuegoVista juegoVista, Juego  juego, ControladorDeInventario controladorDeInventario) {

        this.controladorDeInventario = controladorDeInventario;
        this.juego = juego;
        //this.juego.iniciar();
        this.juegoVista = juegoVista;
        juegoVista.setControlador(this);
        this.jugadorPosX = 0;
        this.jugadorPosY = 0;
    }


    public void actualizarVista() {

        for(int row = 0; row < 12 ; row++)
        {
            for(int col = 0; col < 12; col++)
            {
                Posicion posicion = new Posicion(row,col);
                ObjetoMinecraft objeto = juego.getMapa().obtenerObjeto(posicion);
                String nombreImagen = objeto.getImagen();
                System.out.println(nombreImagen);
                juegoVista.agregarElemento(nombreImagen, col, row);
            }
        }
    }


    public void moverArriba(GridPane mapa){
    	
    	if(!this.juego.getMovimientos().moverJugadorArriba(this.juego.mapa)){
    		
    		return;
    	}
    	
    	Node jugadorNode =  getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY);
    	Node siguiente = getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY-1);
    	
    	mapa.getChildren().remove(jugadorNode);
    	mapa.getChildren().remove(siguiente);
    	
    	this.jugadorPosY --;
    	mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);
   
    }


    public void moverAbajo(GridPane mapa){
    	
    	if(!this.juego.getMovimientos().moverJugadorAbajo(this.juego.mapa)){
    		
    		return;
    	}
    	
    	Node jugadorNode =  getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY);
    	Node siguiente = getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY+1);
    	
    	mapa.getChildren().remove(jugadorNode);
    	mapa.getChildren().remove(siguiente);
    	
    	this.jugadorPosY++ ;
    	mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);

    }


    public void moverDerecha(GridPane mapa){
    	
    	if(!this.juego.getMovimientos().moverJugadorDerecha(this.juego.mapa)) return;
    		
	    Node jugadorNode =  getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY);
	    Node siguiente = getNodeFromGridPane(mapa, this.jugadorPosX+1, this.jugadorPosY);
	        	
	    mapa.getChildren().remove(jugadorNode);
	    mapa.getChildren().remove(siguiente);
	        	
	    this.jugadorPosX ++;
	        	
	    System.out.println(this.jugadorPosX);
	    System.out.println(this.jugadorPosY);
	        	
	    mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);
	    		
    	
    	    
    }
    

    public void moverIzquierda(GridPane mapa){

    	if(!this.juego.getMovimientos().moverJugadorIzquierda(this.juego.mapa)) return;
        	
    	Node jugadorNode =  getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY);
        Node siguiente = getNodeFromGridPane(mapa, this.jugadorPosX-1, this.jugadorPosY);
        
       	mapa.getChildren().remove(jugadorNode);
       	mapa.getChildren().remove(siguiente);
        	
       	this.jugadorPosX --;
       	mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);    		
    	
    }

/*
    public void golpearIzquierda() {
        juego.getJugador().golpear(new HaciaIzquierda());
        actualizarVista();
        controladorDeInventario.actualizarVista();
    }


    public void golpearDerecha() {
        juego.getJugador().golpear(new HaciaDerecha());
        actualizarVista();
        controladorDeInventario.actualizarVista();
    }


    public void golpearArriba() {
        juego.getJugador().golpear(new HaciaArriba());
        actualizarVista();
        controladorDeInventario.actualizarVista();
    }


    public void golpearAbajo() {
        juego.getJugador().golpear(new HaciaAbajo());
        actualizarVista();
        controladorDeInventario.actualizarVista();
    }
*/

    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }
    

}
