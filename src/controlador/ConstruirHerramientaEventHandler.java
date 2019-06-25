package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.constructores.MesaDeCrafteo;
import modelo.herramientas.Herramienta;
import modelo.jugador.Jugador;
import vista.InventarioVista;

public class ConstruirHerramientaEventHandler implements EventHandler<ActionEvent> {

    InventarioVista vistaInventario;
    MesaDeCrafteo mesaDeCrafteo;
    Jugador jugador;

    public ConstruirHerramientaEventHandler(InventarioVista vistaInventario,
                                            MesaDeCrafteo mesaDeCrafteo,
                                            Jugador jugador) {
        this.jugador = jugador;
        this.mesaDeCrafteo = mesaDeCrafteo;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(ActionEvent event) {
        Herramienta herramienta = this.mesaDeCrafteo.crear();
        if (herramienta == null) {
            this.vistaInventario.ponerMensajeError("No se pudo construir ninguna herramienta");
        } else {
            jugador.obtenerInventario().agregarAlInventario(herramienta);
            mesaDeCrafteo.limpiar();
            this.vistaInventario.actualizar(this.jugador.obtenerInventario());
        }
    }
}