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

        if(posicion.x > 12){
            modeloDatos[posicion.x-1][posicion.y] = dato;
        }
        if(posicion.y > 12){
            modeloDatos[posicion.x][posicion.y-1] = dato;
        }
        else{
            modeloDatos[posicion.x][posicion.y] = dato;

        }

    }


    public void inicializarModeloDato(Posicion posicion) {

        modeloDatos[posicion.x][posicion.y] = 0;
        setChanged();

    }

}
