package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.constructores.MesaDeCrafteo;
import modelo.jugador.Inventario;
import modelo.materiales.Material;
import modelo.posicion.Posicion;
import vista.BotoneraInventario;
import vista.InventarioVista;

public class BotonPonerEnHandler implements EventHandler<ActionEvent> {
    BotoneraInventario botonera;
    Material material;
    Inventario inventario;
    InventarioVista vistaInventario;
    MesaDeCrafteo mesa;

    public BotonPonerEnHandler(Inventario inventario, BotoneraInventario botonera, Material material,
                               InventarioVista vistaInventario,  MesaDeCrafteo mesa) {
        this.botonera = botonera;
        this.inventario = inventario;
        this.material = material;
        this.vistaInventario = vistaInventario;
        this.mesa = mesa;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        int posicionX = (int) botonera.columnaPonerMesa.getValue();
        int posicionY = (int) botonera.filaPonerMesa.getValue();
        Posicion posicion = new Posicion(posicionX - 1, posicionY - 1);
        this.inventario.removerGuardable(material);
        this.mesa.agregarMaterial(posicion, material);
        this.botonera.botonPonerEn.setDisable(true);
        this.vistaInventario.actualizar(this.inventario);
    }
}
