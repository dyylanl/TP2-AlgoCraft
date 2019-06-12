package modelo.juego;

import modelo.jugador.Jugador;
import modelo.mapas.Mapa;
import modelo.materiales.*;

import java.util.Map;

public class Juego {

    public void iniciar(){

        Mapa mapa = new Mapa(9,13);
        cargarTerreno(mapa);
        cargarJugador(mapa);

    }

    public void cargarJugador(Mapa unMapa){

        Jugador jugador = new Jugador();
        unMapa.posicionarJugador(jugador);
    }


    public void cargarTerreno(Mapa unMapa){

        cargarMadera(unMapa);
        cargarPiedra(unMapa);
        cargarMetal(unMapa);
        cargarDiamante(unMapa);

    }

    public void cargarMadera(Mapa unMapa){

        Madera madera = new Madera();
        unMapa.posicionarMaterial(madera);
        Madera madera1 = new Madera();
        unMapa.posicionarMaterial(madera1);
        Madera madera2 = new Madera();
        unMapa.posicionarMaterial(madera2);
        Madera madera3 = new Madera();
        unMapa.posicionarMaterial(madera3);
        Madera madera4 = new Madera();
        unMapa.posicionarMaterial(madera4);
        Madera madera5 = new Madera();
        unMapa.posicionarMaterial(madera5);

    }


    public void cargarPiedra(Mapa unMapa){

        Piedra piedra = new Piedra();
        unMapa.posicionarMaterial(piedra);
        Piedra piedra1 = new Piedra();
        unMapa.posicionarMaterial(piedra1);
        Piedra piedra2 = new Piedra();
        unMapa.posicionarMaterial(piedra2);
        Piedra piedra3 = new Piedra();
        unMapa.posicionarMaterial(piedra3);
        Piedra piedra4 = new Piedra();
        unMapa.posicionarMaterial(piedra4);

    }


    public void cargarMetal(Mapa unMapa){

        Metal metal = new Metal();
        unMapa.posicionarMaterial(metal);
        Metal metal1 = new Metal();
        unMapa.posicionarMaterial(metal1);
        Metal metal2 = new Metal();
        unMapa.posicionarMaterial(metal2);
        Metal metal3 = new Metal();
        unMapa.posicionarMaterial(metal3);

    }


    public void cargarDiamante(Mapa unMapa){

        Diamante diamante = new Diamante();
        unMapa.posicionarMaterial(diamante);

    }

}
