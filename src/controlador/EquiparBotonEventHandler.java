package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.herramientas.Herramienta;
import modelo.jugador.Jugador;
import vista.BotoneraInventario;
import vista.InventarioVista;

public class EquiparBotonEventHandler implements EventHandler<ActionEvent> {

    BotoneraInventario botonera;
    Herramienta herramienta;
    Jugador jugador;
    InventarioVista vistaInventario;

    public EquiparBotonEventHandler(Jugador jugador,
                                    BotoneraInventario botonera,
                                    Herramienta herramienta,
                                    InventarioVista vistaInventario) {
        this.botonera = botonera;
        this.jugador = jugador;
        this.herramienta = herramienta;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(ActionEvent event) {
        this.jugador.equipar(herramienta);
        this.botonera.botonEquipar.setDisable(true);
        this.vistaInventario.actualizar(this.jugador.obtenerInventario());
    }
}
