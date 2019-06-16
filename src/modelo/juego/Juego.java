package modelo.juego;

import modelo.interfaz.ObjetoMinecraft;
import modelo.jugador.Jugador;
import modelo.mapas.Mapa;
import modelo.materiales.*;
import modelo.posicion.Posicion;
import vista.VentanaColor;

import javax.swing.*;
import java.util.Map;

public class Juego {


    public Mapa mapa;
    public ModeloObservable modelo;


    public void iniciar(){

        this.modelo = new ModeloObservable();
        this.mapa = new Mapa(this.modelo);
        cargarJugador();
        cargarTerreno();
        crearVetanaColor();
    }


    public void cargarJugador(){

        Jugador jugador = new Jugador();
        Posicion posicion = this.mapa.posicionarJugador(jugador);
        this.modelo.setModeloDato(posicion,1);

    }


    public void cargarTerreno(){

        cargarMadera();
        cargarPiedra();
        cargarMetal();
        cargarDiamante();

    }


    public void cargarMadera(){

        for(int i = 0; i <= 8; i++){

            Madera madera = new Madera();
            Posicion posicion = this.mapa.posicionarMaterial(madera);
            this.modelo.setModeloDato(posicion,2);

        }

    }


    public void cargarPiedra(){

        for(int i = 0; i <= 5; i++){

            Piedra piedra = new Piedra();
            Posicion posicion = this.mapa.posicionarMaterial(piedra);
            this.modelo.setModeloDato(posicion,3);

        }

    }


    public void cargarMetal(){

        for(int i = 0; i <= 4; i++){

            Metal metal = new Metal();
            Posicion posicion = this.mapa.posicionarMaterial(metal);
            this.modelo.setModeloDato(posicion,4);

        }

    }


    public void cargarDiamante(){

        Diamante diamante = new Diamante();
        Posicion pos1 = this.mapa.posicionarMaterial(diamante);
        Diamante diamante1 = new Diamante();
        Posicion pos2 = this.mapa.posicionarMaterial(diamante1);
        this.modelo.setModeloDato(pos1,5);
        this.modelo.setModeloDato(pos2,5);


    }


    public Mapa getMapa(){

        return this.mapa;

    }


    private void crearVetanaColor() {

        JFrame ventanaColor = new VentanaColor(13, this.modelo);

        ventanaColor.setSize(500, 500);

        ventanaColor.setLocation(8, 0);

        ventanaColor.setVisible(true);

        ventanaColor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}