package vista;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.juego.Juego;
import modelo.jugador.Jugador;

public class Principal extends Application {

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




    }
    
    public void loadMainMenu(Stage primaryStage) {


        try {

            primaryStage.setTitle("TP2 ALGOCRAFT");
            Juego juego = new Juego();
            Marco contenedorPrincipal = new ContenedorPrincipal(stage, juego.obtenerJugador());
            Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);


            ControlesJugadorKeyPressEventHandler controlesEventHandler = new ControlesJugadorKeyPressEventHandler(contenedorPrincipal.obtenerVistaJugador(), juego.obtenerJugador());
            escenaJuego.setOnKeyPressed(controlesEventHandler);

            ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaJuego);
            Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640, 480);

            // add handler to this:
            // stage.setOnCloseRequest()

            stage.setScene(escenaBienvenidos);


            stage.show();
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