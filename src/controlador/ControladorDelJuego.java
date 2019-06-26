package controlador;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.interfaz.ObjetoMinecraft;
import modelo.juego.Juego;
import modelo.posicion.Posicion;
import vista.JuegoVista;


public class ControladorDelJuego {

    private Juego juego;
    private JuegoVista juegoVista;
    private int jugadorPosX, jugadorPosY;

    public ControladorDelJuego(JuegoVista juegoVista, Juego  juego) {

        this.juego = juego;
        //this.juego.iniciar();
        this.juegoVista = juegoVista;
        juegoVista.setControlador(this);
        this.jugadorPosX = 0;
        this.jugadorPosY = 0;
    }
    
    public void obtenerJuegoCargado(Juego juego){
    	juego = this.juego;
    }
    
    public void actualizarVista() {

        for(int row = 0; row < 12 ; row++)
        {
            for(int col = 0; col < 12; col++)
            {
                Posicion posicion = new Posicion(row,col);
                ObjetoMinecraft objeto = juego.getMapa().obtenerObjeto(posicion);
                String nombreImagen = objeto.getImagen();
                //System.out.println(nombreImagen);
                juegoVista.agregarElemento(nombreImagen, row, col);
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
    	
    	//this.juegoVista.agregarElemento("negro.png", this.jugadorPosX, this.jugadorPosY);
    	
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
    	
    	//this.juegoVista.agregarElemento("negro.png", this.jugadorPosX, this.jugadorPosY);
    	
    	this.jugadorPosY++ ;
    	mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);

    }
    
    public void moverDerecha(GridPane mapa){
    	
    	if(!this.juego.getMovimientos().moverJugadorDerecha(this.juego.mapa)) return;
    		
	    Node jugadorNode =  getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY);
	    Node siguiente = getNodeFromGridPane(mapa, this.jugadorPosX+1, this.jugadorPosY);
	        	
	    mapa.getChildren().remove(jugadorNode);
	    mapa.getChildren().remove(siguiente);
	        	
	    //this.juegoVista.agregarElemento("negro.png", this.jugadorPosX, this.jugadorPosY);
	    
	    this.jugadorPosX ++;
	        	
	    mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);
	    		
    	
    	    
    }
    
    
    
    public void moverIzquierda(GridPane mapa){

    	if(!this.juego.getMovimientos().moverJugadorIzquierda(this.juego.mapa)) return;
        	
    	Node jugadorNode =  getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY);
        Node siguiente = getNodeFromGridPane(mapa, this.jugadorPosX-1, this.jugadorPosY);
        
       	mapa.getChildren().remove(jugadorNode);
       	mapa.getChildren().remove(siguiente);
        
       	//this.juegoVista.agregarElemento("negro.png", this.jugadorPosX, this.jugadorPosY);       	
       	
       	this.jugadorPosX --;
       	mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);    		
    	
    }
    
    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }
    

}
