package controlador;

import javafx.geometry.Pos;
import modelo.Direccion.Abajo;
import modelo.Direccion.Arriba;
import modelo.Direccion.Derecha;
import modelo.Direccion.Izquierda;
import modelo.interfaz.ObjetoMinecraft;
import modelo.juego.Juego;
import modelo.posicion.Posicion;
import vista.JuegoVista;

import java.util.HashMap;

public class ControladorDelJuego {

    private Juego juego;
    private JuegoVista juegoVista;
    private HashMap<Character, String> BloquesHash = new HashMap<>();


    public ControladorDelJuego(JuegoVista juegoVista) {

        this.juego = new Juego();
        this.juego.iniciar();
        this.juegoVista = juegoVista;
        juegoVista.setControlador(this);

    }

    public void actualizarVista() {

        for(int row = 0; row < 12 ; row++)
        {
            for(int col = 0; col < 13; col++)
            {
                Posicion posicion = new Posicion(row,col);
                ObjetoMinecraft objeto = juego.getMapa().obtenerObjeto(posicion);
                String nombreImagen = objeto.getImagen();
                juegoVista.agregarElemento(nombreImagen,row, col);
            }
        }
    }

    public void moverArriba(){

        juego.getJugador().moverArriba();
        actualizarVista();
    }
    public void moverAbajo(){

        juego.getJugador().moverAbajo();
        actualizarVista();
    }
    public void moverDerecha(){

        juego.getJugador().moverDerecha();
        actualizarVista();
    }
    public void moverIzquierda(){

        juego.getJugador().moverIzquierda();
        actualizarVista();
    }

}
