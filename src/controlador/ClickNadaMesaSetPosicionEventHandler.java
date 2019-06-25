package controlador;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import modelo.posicion.Posicion;
import vista.BotoneraInventario;
import vista.InventarioVista;

public class ClickNadaMesaSetPosicionEventHandler implements EventHandler<MouseEvent> {

    BotoneraInventario botonera;
    InventarioVista vistaInventario;
    Posicion posicion;

    public ClickNadaMesaSetPosicionEventHandler(BotoneraInventario botonera,
                                                InventarioVista vistaInventario,
                                                Posicion posicion) {
        this.botonera = botonera;
        this.posicion = posicion;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(MouseEvent event) {

        this.botonera.filaPonerMesa.setValue(posicion.y + 1);
        this.botonera.columnaPonerMesa.setValue(posicion.x + 1);
        if(!botonera.botonPonerEn.isDisabled()){
            this.botonera.botonPonerEn.fire();
        }
    }
}
