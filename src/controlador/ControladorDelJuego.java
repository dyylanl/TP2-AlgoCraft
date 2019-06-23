package controlador;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.*;
import modelo.Direccion.*;
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

    public ControladorDelJuego(JuegoVista juegoVista) {

        this.juego = new Juego();
        this.juego.iniciar();
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
                juegoVista.agregarElemento(nombreImagen, row, col);
            }
        }
    }

    public void moverArriba(){

        juego.moverJugador(new Arriba());
        actualizarVista();
    }
    public void moverAbajo(){

        juego.moverJugador(new Abajo());
        actualizarVista();
    }
    public void moverDerecha(GridPane mapa){
    	
    	Node jugadorNode =  getNodeFromGridPane(mapa, this.jugadorPosX, this.jugadorPosY);
    	Node siguiente = getNodeFromGridPane(mapa, this.jugadorPosX+1, this.jugadorPosY);
    	
    	mapa.getChildren().remove(jugadorNode);
    	mapa.getChildren().remove(siguiente);
    	
    	this.jugadorPosX ++;
    	mapa.add(jugadorNode, this.jugadorPosX, this.jugadorPosY);
    	System.out.println(this.jugadorPosX);
    	System.out.println(this.jugadorPosY);
    	//juego.moverJugador(new Derecha());
        
        //actualizarVista();
        
    }
    
    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }
    
    
    public void moverIzquierda(){

        juego.moverJugador(new Izquierda());
        actualizarVista();
    }

}
