package controlador;

import vista.InventarioVista;


public class ClickHerramientaEventHandler implements EventHandler<MouseEvent> {
    BotonesInventario botonera;
    Herramienta herramienta;
    Jugador jugador;
    InventarioVista vistaInventario;

    public ClickHerramientaEventHandler(Jugador jugador,
                                        BotonesInventario botonera,
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
