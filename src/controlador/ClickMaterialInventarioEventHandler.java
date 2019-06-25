package controlador;


import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import modelo.constructores.MesaDeCrafteo;
import modelo.jugador.Inventario;
import modelo.materiales.Material;
import vista.BotoneraInventario;
import vista.InventarioVista;

public class ClickMaterialInventarioEventHandler implements EventHandler<MouseEvent> {
   InventarioVista vistaInventario;
    Inventario inventario;
    Material material;
    MesaDeCrafteo mesaDeCrafteo;
    BotoneraInventario botonera;
    BorderPane borderPane;

    public ClickMaterialInventarioEventHandler(Inventario inventario, Material material, MesaDeCrafteo mesaDeCrafteo,
                                               InventarioVista vistaInventario, BotoneraInventario botonera,
                                               BorderPane borderPane) {
        this.vistaInventario = vistaInventario;
        this.inventario = inventario;
        this.material = material;
        this.mesaDeCrafteo = mesaDeCrafteo;
        this.botonera = botonera;
        this.borderPane = borderPane;
    }

    @Override
    public void handle(MouseEvent event) {
        int posicionX;
        int posicionY;

        this.botonera.botonPonerEn.setDisable(false);
        BotonPonerEnHandler boton = new BotonPonerEnHandler(this.inventario,
                this.botonera,
                this.material,
                this.vistaInventario,
                this.mesaDeCrafteo);
        this.botonera.botonPonerEn.setOnAction(boton);
    }
}
