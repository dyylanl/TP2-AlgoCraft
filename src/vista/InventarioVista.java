package vista;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.constructores.MesaDeCrafteo;
import modelo.herramientas.Herramienta;
import modelo.jugador.Inventario;
import modelo.jugador.Jugador;
import modelo.materiales.Material;
import modelo.posicion.Posicion;

public class VistaInventario extends Stage {

    GridPane inventario;
    GridPane panel;
    Scene scene;
    BorderPane borderPane;
    Jugador jugador;
    MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();

    BotonesInventario botones = new BotonesInventario();


    public VistaInventario(Stage parent, Jugador jugador) {

        this.setTitle("Inventario");
        this.initOwner(parent);

        this.inventario = new GridPane();
        this.panel = new GridPane();
        this.jugador = jugador;
        this.borderPane = new BorderPane();


        inventario.setHgap(2);
        inventario.setVgap(2);

        panel.setHgap(2);
        panel.setVgap(2);

        VBox contenedorMedio = new VBox(new Label("Inventario"), this.inventario,
                new Label("Mesa Crafteo"),
                this.panel);
        contenedorMedio.setSpacing(10);
        borderPane.setCenter(contenedorMedio);
        this.setBotonera(jugador);
        scene = new Scene(borderPane, 640, 480);

    }

    public void mostrar(Inventario inventario) {
        this.actualizar(inventario);
        this.setScene(scene);
        this.showAndWait();
    }

    private void setBotonera(Jugador jugador) {

        String rutaDeImagen = "invnetario.png";

        Herramienta herramienta = jugador.getHerramientaEquipada();
        if (herramienta != null) {
            rutaDeImagen = herramienta.getImagen();
        }


        this.botones.botonEquipar = new Button();
        this.botones.botonEquipar.setText("Equipar");
        this.botones.botonEquipar.setDisable(true);


        this.botones.construirCrafteo = new Button();
        this.botones.construirCrafteo.setText("Craftear");
        this.botones.construirCrafteo.setOnAction(new HandlerConstruir(this, this.mesaDeCrafteo, this.jugador));


        this.botones.imagenHerramientaEquipada = new ImageView();
        Image imagen = new Image(rutaDeImagen);

        this.botones.imagenHerramientaEquipada.setImage(imagen);
        this.botones.imagenHerramientaEquipada.setFitWidth(32);
        this.botones.imagenHerramientaEquipada.setFitHeight(32);


        botones.filaPonerMesa = new ChoiceBox();
        botones.filaPonerMesa.setItems(FXCollections.observableArrayList(1, 2, 3));
        botones.columnaPonerMesa = new ChoiceBox();
        botones.columnaPonerMesa.setItems(FXCollections.observableArrayList(1, 2, 3));

        botones.filaPonerMesa.setValue(1);
        botones.columnaPonerMesa.setValue(1);

        botones.mensajeError = new Label("");
        botones.mensajeError.setStyle("-fx-color: red");

        VBox contenedorVertical = new VBox(new Label("Herramienta"), this.botones.imagenHerramientaEquipada,
                this.botones.botonEquipar, this.botones.botonPonerEn,
                new Label("Fila: "), botones.filaPonerMesa,
                new Label("Columna: "), botones.columnaPonerMesa,
                botones.construirCrafteo,
                botones.mensajeError);

        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));
        borderPane.setLeft(contenedorVertical);
    }

    public void actualizar(Inventario inventario) {


        this.actualizar(inventario);
        this.dibujarMesaCrafteo();
        String path = "inventario.png";

        Herramienta herramienta = jugador.getHerramientaEquipada();
        if (herramienta != null) {
            path = herramienta.getImagen();
        }
        Image imagen = new Image(path);

        this.botones.imagenHerramientaEquipada.setImage(imagen);
        this.botones.imagenHerramientaEquipada.setFitWidth(32);
        this.botones.imagenHerramientaEquipada.setFitHeight(32);

    }

    public void crearInventario(Inventario inventario) {



        int i=0;
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 9; x++) {
                ObjetoMinecraft objeto = null;
                ImageView imageView = new ImageView();
                if (index < inventario.obtenerCantidad()) {
                    objeto = inventario.obtenerObjeto(index);
                    i++;
                }
                Image imagen = new Image("inventario.png");
                if (objeto != null) {
                    if (objeto instanceof Herramienta) {
                        Herramienta herramienta = (Herramienta) objeto;
                        String ruta = herramienta.getImagen();
                        HandlerHerramienta handler = new HandlerHerramienta(jugador,
                                botones,
                                herramienta,
                                this);
                        imageView.setOnMouseClicked(handler);
                        imagen = new Image(ruta);
                    } else {
                        Material material = (Material) objeto;
                        String ruta = material.getImagen();
                        HandlerMaterialEnMesa handler = new HandlerMaterialEnMesa(inventario,
                                material,
                                mesaDeCrafteo,
                                this, botones, borderPane);
                        imageView.setOnMouseClicked(handler);
                        imagen = new Image(ruta);
                    }
                }

                imageView.setImage(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);

                inventario.add(imageView, x, y);

            }
        }
    }

}
