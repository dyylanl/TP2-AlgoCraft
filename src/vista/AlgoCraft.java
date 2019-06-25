package vista;

import controlador.ControladorDeEscena;
import controlador.ControladorDeInventario;
import controlador.ControladorDelJuego;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.juego.Juego;
import modelo.jugador.Jugador;

public class AlgoCraft extends Application {

    public static double width;
    public static double heigth;
    private Juego juego;
    /*private Group root;
    private static PlayerView player;*/


    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) {

        loadMainMenu(primaryStage);

    }

    
    public void loadMainMenu(Stage primaryStage) {


        try {

            BorderPane border = new BorderPane();
            border.setPadding(new Insets(20, 0, 20, 20));
            border.setId("background");


            // Botones
            Boton btnJugar = new Boton("Jugar");
            Boton btnCreditos = new Boton("Creditos");
            Boton btnSalir = new Boton("Salir del Juego");

            btnJugar.setMaxWidth(Double.MAX_VALUE);
            btnCreditos.setMaxWidth(Double.MAX_VALUE);
            btnSalir.setMaxWidth(Double.MAX_VALUE);

            // Agrego botones a VBox
            VBox vbButtons = new VBox();
            vbButtons.setAlignment(Pos.CENTER);
            vbButtons.setSpacing(10);
            vbButtons.setPadding(new Insets(0, 20, 10, 20));
            vbButtons.getChildren().addAll(btnJugar, btnCreditos, btnSalir);

            // Copyright
            Label copyright = new Label("TP2 Algoritmos 3 FIUBA. Do not distribute!");
            copyright.setAlignment(Pos.BOTTOM_CENTER);

            // Agrego lo anterior al BorderPane
            border.setCenter(vbButtons);
            border.setBottom(copyright);

            Scene scene = new Scene(border, 832, 512);
            primaryStage.setTitle("Algocraft 0.0.1");
            //primaryStage.getIcons().add(new Image(AlgoCraft.class.getResourceAsStream("../../../res/icon.png")));
            primaryStage.setScene(scene);
            //scene.getStylesheets().add(AlgoCraft.class.getResource("../../../res/AlgoCraft.css").toExternalForm());
            primaryStage.show();

            // Inicialiazo controlador de escena y vistas
            ControladorDeEscena controladorDeEscena = new ControladorDeEscena(scene);
            System.out.println("inicializando selector de herramientas");
            SelectorDeHerramientas selectorHerramientas = new SelectorDeHerramientas();
            System.out.println("lo inicio");
            InventarioVista inventarioVista = new InventarioVista(controladorDeEscena);
            System.out.println("Se inicio inventario vista");
            JuegoVista juegoVista = new JuegoVista(controladorDeEscena, selectorHerramientas);
            CreditosVista creditosVista = new CreditosVista(controladorDeEscena);
            controladorDeEscena.agregarEscena("main", border);
            controladorDeEscena.agregarEscena("inventario", inventarioVista.getPane());
            controladorDeEscena.agregarEscena("juego", juegoVista.getPane());
            controladorDeEscena.agregarEscena("creditos", creditosVista.getPane());
            btnJugar.setOnAction(e -> {
                controladorDeEscena.activate("juego");
            });
            btnCreditos.setOnAction(e -> {
                controladorDeEscena.activate("creditos");
            });
            btnSalir.setOnAction(e -> {
                Platform.exit();
            });

            // PRUEBA
            System.out.println("va a iniciar el juego");
            Juego juego = new Juego();
            Jugador jugador = juego.getJugador();
            ControladorDeInventario controladorDeInventario = new ControladorDeInventario(jugador.getInventario(), inventarioVista, selectorHerramientas);
            controladorDeInventario.actualizarVista();

            ControladorDelJuego controladorJuego = new ControladorDelJuego(juegoVista, juego, controladorDeInventario);
            controladorJuego.actualizarVista();

            selectorHerramientas.setOnMouseClicked(e -> {
                Integer posicion = selectorHerramientas.getPosicion(e);
                if (posicion != null) {
                    System.out.println(posicion);
                    jugador.seleccionarHerramienta(posicion);
                }
            });
        }

        catch (Exception e) {

            Alert error = new Alert(Alert.AlertType.INFORMATION);
            error.setTitle("ERROR");
            error.setHeaderText("Algo salio mal en tiempo de ejecucion...");
            error.setContentText("Tipo de error: " + e);
            error.initStyle(StageStyle.UTILITY);
            error.showAndWait();

        }
    }
}