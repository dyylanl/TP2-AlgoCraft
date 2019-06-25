package vista;


import controlador.*;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.constructores.CrafteadorHerramientas;
import modelo.constructores.MesaDeCrafteo;
import modelo.herramientas.Herramienta;
import modelo.interfaz.ObjetoMinecraft;
import modelo.jugador.Inventario;
import modelo.jugador.Jugador;
import modelo.materiales.Material;
import modelo.posicion.Posicion;

public class InventarioVista extends Stage {


    GridPane contenedorInventario;
    GridPane contenedorCrafteo;
    Scene scene;
    BorderPane borderPane;
    Jugador jugador;
    MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo(new CrafteadorHerramientas());
    BotoneraInventario botonera = new BotoneraInventario();


    public InventarioVista(Stage parent, Jugador jugador) {

        this.setTitle("Inventario");
        this.initOwner(parent);
        this.initModality(Modality.APPLICATION_MODAL);
        this.contenedorInventario = new GridPane();
        this.contenedorCrafteo = new GridPane();
        this.jugador = jugador;
        this.borderPane = new BorderPane();


        contenedorInventario.setHgap(2);
        contenedorInventario.setVgap(2);

        contenedorCrafteo.setHgap(2);
        contenedorCrafteo.setVgap(2);

        VBox contenedorMedio = new VBox(new Label("Inventario"), this.contenedorInventario,
                new Label("Mesa Crafteo"),
                this.contenedorCrafteo);
        contenedorMedio.setSpacing(10);
        borderPane.setCenter(contenedorMedio);
        this.setBotonera(jugador);
        scene = new Scene(borderPane, 640, 480);

    }


    private void setBotonera(Jugador jugador) {

        String path = "inventarioVacio.png";

        Herramienta herramienta = jugador.getHerramientaEquipada();
        if (herramienta != null) {
            path = herramienta.getImagen();
        }


        this.botonera.botonEquipar = new Button();
        this.botonera.botonEquipar.setText("Equipar");
        this.botonera.botonEquipar.setDisable(true);

        this.botonera.botonPonerEn = new Button();
        this.botonera.botonPonerEn.setText("Poner en la mesa:");
        this.botonera.botonPonerEn.setDisable(true);

        this.botonera.construirCrafteo = new Button();
        this.botonera.construirCrafteo.setText("Construir Herramienta");
        this.botonera.construirCrafteo.setOnAction(new ConstruirHerramientaEventHandler(this, this.mesaDeCrafteo, this.jugador));


        this.botonera.imagenHerramientaEquipada = new ImageView();
        Image imagen = new Image(path);

        this.botonera.imagenHerramientaEquipada.setImage(imagen);
        this.botonera.imagenHerramientaEquipada.setFitWidth(32);
        this.botonera.imagenHerramientaEquipada.setFitHeight(32);


        botonera.filaPonerMesa = new ChoiceBox();
        botonera.filaPonerMesa.setItems(FXCollections.observableArrayList(1, 2, 3));
        botonera.columnaPonerMesa = new ChoiceBox();
        botonera.columnaPonerMesa.setItems(FXCollections.observableArrayList(1, 2, 3));

        botonera.filaPonerMesa.setValue(1);
        botonera.columnaPonerMesa.setValue(1);

        botonera.mensajeError = new Label("");
        botonera.mensajeError.setStyle("-fx-color: red");

        VBox contenedorVertical = new VBox(new Label("Herramienta Equipada"), this.botonera.imagenHerramientaEquipada,
                this.botonera.botonEquipar, this.botonera.botonPonerEn,
                new Label("Fila: "), botonera.filaPonerMesa,
                new Label("Columna: "), botonera.columnaPonerMesa,
                botonera.construirCrafteo,
                botonera.mensajeError);

        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));
        borderPane.setLeft(contenedorVertical);
    }


    public void mostrar(Inventario inventario) {
        this.actualizar(inventario);
        this.setScene(scene);
        this.showAndWait();
    }


    public void actualizar(Inventario inventario) {

        //this.contenedorInventario.add(this.dibujarMesaCrafteo(inventario), 0, 1);
        this.dibujarInventario(inventario);
        this.dibujarMesaCrafteo();
        String path = "inventarioVacio.png";

        Herramienta herramienta = jugador.getHerramientaEquipada();
        if (herramienta != null) {
            path = herramienta.getImagen();
        }

        Image imagen = new Image(path);

        this.botonera.imagenHerramientaEquipada.setImage(imagen);
        this.botonera.imagenHerramientaEquipada.setFitWidth(32);
        this.botonera.imagenHerramientaEquipada.setFitHeight(32);

    }


    public void dibujarInventario(Inventario inventario) {

        int alto = 3;
        int ancho = 10;
        int index = 0;

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                ObjetoMinecraft guardable = null;
                ImageView imageView = new ImageView();
                if (index < inventario.obtenerCantidadDeObjetos()) {
                    guardable = inventario.obtenerGuardable(index);
                    index++;
                }
                Image imagen = new Image("inventarioVacio.png");
                if (guardable != null) {
                    if (guardable instanceof Herramienta) {
                        Herramienta herramienta = (Herramienta) guardable;
                        String ruta = herramienta.getImagen();
                        ClickHerramientaEventHandler handler = new ClickHerramientaEventHandler(jugador,
                                botonera,
                                herramienta,
                                this);
                        imageView.setOnMouseClicked(handler);
                        imagen = new Image(ruta);
                    } else {
                        Material material = (Material) guardable;
                        String ruta = "file:src/fiuba/algo3/vista/imagenes/" + material.getClass().getName() + ".png";
                        ClickMaterialInventarioEventHandler handler = new ClickMaterialInventarioEventHandler(inventario,
                                material,
                                mesaDeCrafteo,
                                this, botonera, borderPane);
                        imageView.setOnMouseClicked(handler);
                        imagen = new Image(ruta);
                    }
                }

                imageView.setImage(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);

                contenedorInventario.add(imageView, x, y);

            }
        }
    }


    public void dibujarMesaCrafteo() {

        int alto = 3;
        int ancho = 3;

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                Posicion posicion = new Posicion(x, y);
                Material material = this.mesaDeCrafteo.obtenerMaterial(posicion);
                String ruta = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";
                ImageView imageView = new ImageView();

                if (material != null) {
                    ruta = "file:src/fiuba/algo3/vista/imagenes/" + material.getClass().getName() + ".png";
                    ClickMaterialMesaEventHandler handler;
                    handler = new ClickMaterialMesaEventHandler(this.jugador.obtenerInventario(),
                            material,
                            mesaDeCrafteo,
                            this,
                            posicion);
                    imageView.setOnMouseClicked(handler);
                }else{
                    ClickNadaMesaSetPosicionEventHandler handler;
                    handler = new ClickNadaMesaSetPosicionEventHandler(
                            botonera,
                            this,
                            posicion);
                    imageView.setOnMouseClicked(handler);
                }
                Image imagen = new Image(ruta);
                imageView.setImage(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                contenedorCrafteo.add(imageView, x, y);

            }
        }
    }


    public void ponerMensajeError(String s) {
        botonera.mensajeError.setText(s);
    }



    /*
    public InventarioVista(Scene scene, ControladorDeEscena controladorDeEscena) {



        this.scene = scene;
        root = new BorderPane();
        root.setId("background");


        VBox contenedor = new VBox();
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setId("contenedor-casillas");


        Label titulo1 = new Label("Crafting");
        titulo1.setId("titulo-inventario");
       // this.inventario = crearInventario(3, 9);
        Label titulo2 = new Label("Inventario");
        titulo2.setId("titulo-inventario");
        //HBox mesaDeCrafteo = crearMesa();

       // contenedor.getChildren().addAll(titulo1, mesaDeCrafteo, titulo2, inventario);


        HBox menu = new HBox();
        menu.setAlignment(Pos.CENTER);
        Boton cerrar = new Boton("Cerrar - [E]");
        cerrar.setOnAction(e -> {
            controladorDeEscena.activate("juego");
        });
        menu.getChildren().addAll(cerrar);


        root.setTop(menu);
        root.setCenter(contenedor);


        root.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.E) {
                controladorDeEscena.activate("juego");
            }
        });
    }


    public Pane getPane() {

        return this.root;

    }

/*
    private GridPane crearInventario(int maxFil, int maxCol) {

        GridPane inventario = new GridPane();
        inventario.setAlignment(Pos.CENTER);

        for(int fila = 0; fila < maxFil; fila++) {

            for(int col = 0; col < maxCol; col++) {

                agregarCasilla(inventario, col, fila);

            }
        }

        return inventario;

    }


    private HBox crearMesa() {


        HBox contenedor = new HBox(10);
        contenedor.setAlignment(Pos.CENTER);
        GridPane mesa = crearInventario(3, 3);

        ImageView flecha = getImagen("flecha", 48);
        ImageView casilla = getImagen("casilla", 64);
        casilla.setId("casilla");

        contenedor.getChildren().addAll(mesa, flecha, casilla);

        return contenedor;

    }


    private void agregarElemento(GridPane inventario, String elemento, int fila, int columna) {

        if (elemento == null) return;

        StackPane stack = new StackPane();
        Image itemImage = new Image(getClass().getResourceAsStream(elemento), 38, 0, true, true);
        ImageView imageView = new ImageView(itemImage);
        stack.getChildren().add(imageView);
        inventario.add(stack, fila, columna);
        stack.setId("casilla");

        imageView.setOnMouseClicked(e -> {
            stack.getChildren().clear();
            this.seleccionado = imageView;
        });

        stack.setOnMouseReleased(e -> {
            if (this.seleccionado != null) {
                stack.getChildren().add(this.seleccionado);
                this.seleccionado = null;
            }
        });

    }


    private void agregarCasilla(GridPane inventario, int col, int fila) {

        StackPane stackBack = new StackPane();
        ImageView imageView = new ImageView(new Image("casilla.png", 48, 0, true, true));
        stackBack.getChildren().add(imageView);
        inventario.add(stackBack, col, fila);
        stackBack.setId("casilla");
        stackBack.setOnMouseReleased(e -> {

            if (this.seleccionado != null) {
                stackBack.getChildren().add(this.seleccionado);
                this.seleccionado = null;

            }
        });

    }


    private ImageView getImagen(String nombre, int tamanio) {

        return new ImageView(new Image(nombre, tamanio, 0, true, true));

    }


    public void agregar(String elemento, int fila, int columna) {

        this.agregarElemento(this.inventario, elemento, fila, columna);

    }
*/

}