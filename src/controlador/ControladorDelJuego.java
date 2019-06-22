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
    public void moverDerecha(){

        juego.moverJugador(new Derecha());
        actualizarVista();
    }
    public void moverIzquierda(){

        juego.moverJugador(new Izquierda());
        actualizarVista();
    }

}
