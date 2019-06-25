package controlador;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import modelo.herramientas.Herramienta;
import modelo.jugador.Jugador;
import vista.BotoneraInventario;
import vista.InventarioVista;

public class ClickHerramientaEventHandler implements EventHandler<MouseEvent> {
    BotoneraInventario botonera;
    Herramienta herramienta;
    Jugador jugador;
    InventarioVista vistaInventario;

    public ClickHerramientaEventHandler(Jugador jugador,
                                        BotoneraInventario botonera,
                                        Herramienta herramienta,
                                        InventarioVista vistaInventario) {
        this.botonera = botonera;
        this.jugador = jugador;
        this.herramienta = herramienta;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(MouseEvent event) {
        this.botonera.botonEquipar.setDisable(false);
        EquiparBotonEventHandler equiparBotonEventHandler = new EquiparBotonEventHandler(jugador,
                botonera,
                herramienta,
                vistaInventario);
        botonera.botonEquipar.setOnAction(equiparBotonEventHandler);
    }
}
