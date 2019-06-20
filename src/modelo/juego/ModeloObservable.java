package modelo.juego;

import modelo.jugador.Jugador;
import modelo.posicion.Posicion;

import java.util.Observable;

public class ModeloObservable extends Observable {


    private int modeloDatos[][];
    Jugador jugador;


    public ModeloObservable() {

        modeloDatos = new int[13][13];
        this.jugador = new Jugador();

    }


    public int getModeloDato(Posicion posicion) {

        return modeloDatos[posicion.x][posicion.y];

    }


    public void setModeloDato(Posicion posicion, int dato) {

        modeloDatos[posicion.x][posicion.y] = dato;
        setChanged();

    }


    public void inicializarModeloDato(Posicion posicion) {

        int objeto = modeloDatos[posicion.x][posicion.y];

        if(objeto == 0){System.out.println("VACIO");}
        if(objeto == 1){System.out.println("JUGADOR");}
        if(objeto == 2){System.out.println("MADERA");}
        if(objeto == 3){System.out.println("PIEDRA");}
        if(objeto == 4){System.out.println("METAL");}
        if(objeto == 5){System.out.println("DIAMANTE");}

        setChanged();

    }


}