package controlador;


import modelo.juego.ModeloObservable;
import vista.VistaModeloDato;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorMouse extends MouseAdapter {


    ModeloObservable modelo;
    VistaModeloDato vista;


    public ControladorMouse(ModeloObservable modelo, VistaModeloDato vista) {

        this.modelo = modelo;
        this.vista = vista;

    }


    public void mousePressed(MouseEvent mouseEvent) {

        // Ojo al piojo.
        // El manejo de las coordenadas del mouse debe ser encapsulado por la clase Posicion
        // modelo.inicializarModeloDato(new Posicion(mouseEvent.getX(), mouseEvent.getY()));

        /*
        En este metodo hay que establecer la siguiente funcionalidad:
            Al hacer click en un material este debe desgastar si
            el jugador se encuentra al lado y tiene la herramienta correspondiente, de lo contrario no
            debe realizarse ninguna accion.
        Por el momento lo unico que hace es eliminar el material.
        Por lo tanto hay que corrobar si:
                                            *El jugador esta en la posicion permitida
                                            *El jugador tiene la herramienta correcta
         */

        modelo.inicializarModeloDato(vista.posicion);
        modelo.notifyObservers(vista);

    }


}
