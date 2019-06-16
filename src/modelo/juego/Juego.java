package modelo.juego;

import modelo.jugador.Jugador;
import modelo.mapas.Mapa;
import modelo.materiales.*;

import java.util.Map;

public class Juego {

    public Mapa mapa;


    public void iniciar(){

        this.mapa = new Mapa();
        cargarJugador();
        cargarTerreno();

    }


    public void cargarJugador(){

        Jugador jugador = new Jugador();
        this.mapa.posicionarJugador(jugador);

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
            this.mapa.posicionarMaterial(madera);

        }

    }


    public void cargarPiedra(){

        for(int i = 0; i <= 5; i++){

            Piedra piedra = new Piedra();
            this.mapa.posicionarMaterial(piedra);

        }

    }


    public void cargarMetal(){

        for(int i = 0; i <= 4; i++){

            Metal metal = new Metal();
            this.mapa.posicionarMaterial(metal);

        }

    }


    public void cargarDiamante(){

        Diamante diamante = new Diamante();
        this.mapa.posicionarMaterial(diamante);
        Diamante diamante1 = new Diamante();
        this.mapa.posicionarMaterial(diamante1);

    }


    public Mapa getMapa(){

        return this.mapa;

    }


}
