package modelo.juego;

import modelo.posicion.Posicion;
import java.util.Observable;

public class ModeloObservable extends Observable {


    private int modeloDatos[][];


    public ModeloObservable() {

        modeloDatos = new int[13][13];

    }


    public int getModeloDato(Posicion posicion) {

        return modeloDatos[posicion.x][posicion.y];

    }


    public void setModeloDato(Posicion posicion, int dato) {

        modeloDatos[posicion.x][posicion.y] = dato;

    }


    public void inicializarModeloDato(Posicion posicion) {

        modeloDatos[posicion.x][posicion.y] = 0;
        setChanged();

    }


}
