package controlador;


import vista.InventarioVista;



public class ClickMaterialInventarioEventHandler implements EventHandler<MouseEvent> {
   InventarioVista vistaInventario;
    Inventario inventario;
    Material material;
    MesaDeCrafteo mesaDeCrafteo;
    BotonesInventario botonera;
    BorderPane borderPane;

    public ClickMaterialInventarioEventHandler(Inventario inventario, Material material, MesaDeCrafteo mesaDeCrafteo,
                                               InventarioVista vistaInventario, BotonesInventario botonera,
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
