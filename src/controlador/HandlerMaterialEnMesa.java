package controlador;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import modelo.constructores.MesaDeCrafteo;
import modelo.jugador.Inventario;
import modelo.materiales.Material;
import modelo.posicion.Posicion;
import vista.InventarioVista;
/*
public class ClickMaterialMesaEventHandler implements EventHandler<MouseEvent> {
    Posicion posicion;
    InventarioVista vistaInventario;
    Inventario inventario;
    Material material;
    MesaDeCrafteo mesaDeCrafteo;

    public ClickMaterialMesaEventHandler(Inventario inventario,
                                         Material material,
                                         MesaDeCrafteo mesaDeCrafteo,
                                         InventarioVista vistaInventario,
                                         Posicion posicion) {
        this.vistaInventario = vistaInventario;
        this.inventario = inventario;
        this.material = material;
        this.mesaDeCrafteo = mesaDeCrafteo;
        this.posicion = posicion;
    }

    @Override
    public void handle(MouseEvent event) {
        this.inventario.agregarAlInventario(material);
        this.mesaDeCrafteo.removerMaterial(posicion);
        this.vistaInventario.actualizar(this.inventario);
    }
}*/