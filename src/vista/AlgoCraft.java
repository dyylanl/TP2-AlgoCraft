package vista;

import controlador.ControladorDeEscena;
import controlador.ControladorDelJuego;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.juego.Juego;

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
            border.setPadding(new Insets(25, 0, 25, 25));
            border.setId("background");
            border.setStyle("-fx-background-image: url('fondo.png')");


            Boton botonJugar = new Boton("Jugar");
            Boton botonOpciones = new Boton("Opciones");
            Boton botonCreditos = new Boton("Creditos");
            Boton botonSalir = new Boton("Salir del Juego");

            BotonSalirEventHandler botonSalirEventHandler = new BotonSalirEventHandler(botonSalir);
            botonSalir.setOnAction(botonSalirEventHandler);
            botonJugar.setMaxWidth(Double.MAX_VALUE);
            botonOpciones.setMaxWidth(Double.MAX_VALUE);
            botonCreditos.setMaxWidth(Double.MAX_VALUE);
            botonSalir.setMaxWidth(Double.MAX_VALUE);


            VBox vbButtons = new VBox();
            vbButtons.setAlignment(Pos.CENTER);
            vbButtons.setSpacing(10);
            vbButtons.setPadding(new Insets(0, 25, 15, 25));
            vbButtons.getChildren().addAll(botonJugar, botonOpciones, botonCreditos, botonSalir);
            border.setCenter(vbButtons);


            Scene scene = new Scene(border, 900, 600);
            primaryStage.setTitle("Algocraft");
            primaryStage.setScene(scene);


            //primaryStage.show();
            ControladorDeEscena controladorDeEscena = new ControladorDeEscena(scene);
            JuegoVista juegoVista = new JuegoVista(controladorDeEscena);
            controladorDeEscena.agregarEscena("main", border);
            controladorDeEscena.agregarEscena("juego", juegoVista.getPane());
            
            
            CreditosVista creditos = new CreditosVista(controladorDeEscena); 
            controladorDeEscena.agregarEscena("creditos", creditos.getPane());


            botonJugar.setOnAction(e -> {
                controladorDeEscena.activate("juego");
            });
            botonCreditos.setOnAction(e -> {
                controladorDeEscena.activate("creditos");
            });
            botonSalir.setOnAction(e -> {
                Platform.exit();
            });


            this.juego = new Juego();
            ControladorDelJuego controladorJuego = new ControladorDelJuego(juegoVista, juego);
            controladorJuego.actualizarVista();

            primaryStage.show();


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