package controlador;


import modelo.interfaz.ObjetoMinecraft;
import modelo.juego.Juego;
import modelo.jugador.Jugador;
import modelo.mapas.Mapa;
import modelo.posicion.Posicion;
import vista.JuegoVista;

import java.util.HashMap;

public class ControladorDelJuego {

    private Juego juego;
    private JuegoVista juegoVista;
    public Mapa mapa;
    public Jugador jugador;

    public ControladorDelJuego(JuegoVista juegoVista) {

        this.juego = new Juego();
        this.juego.iniciar();
        this.mapa = juego.getMapa();
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

        Posicion posicion = juego.getJugador().moverArriba();
        this.mapa.posicionarJugador(jugador,posicion);
        actualizarVista();
    }


    public void moverAbajo(){

        Posicion posicion = juego.getJugador().moverAbajo();
        this.mapa.posicionarJugador(jugador,posicion);
        actualizarVista();
    }


    public void moverDerecha(){

        Posicion posicion = juego.getJugador().moverDerecha();
        this.mapa.posicionarJugador(jugador,posicion);
        actualizarVista();
    }


    public void moverIzquierda(){

        Posicion posicion = juego.getJugador().moverIzquierda();
        this.mapa.posicionarJugador(jugador,posicion);
        actualizarVista();
    }

}
