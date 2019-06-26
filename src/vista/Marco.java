package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.jugador.Jugador;

public class Marco extends BorderPane {

    Menu menu;
    VistaJugador vistaJugador;
    VistaInventario vistaInventario;

    Stage stage;

    public Marco(Stage stage, Jugador Jugador) {
        this.setControles(stage, Jugador);
        this.cargarBotones(Jugador);
        this.stage = stage;
    }

    private void setControles(Stage stage, Jugador jugador) {

    }

    private void cargarBotones(Jugador Jugador) {

        Button botonMostrarInventario = new Button();
        botonMostrarInventario.setText("Mostrar inventario");
        this.vistaInventario = new VistaInventario(stage,Jugador);
        HandlerInventario moveButtonHandler = new HandlerInventario(vistaInventario, Jugador);
        botonMostrarInventario.setOnAction(moveButtonHandler);

        VBox contenedorVertical = new VBox(botonMostrarInventario);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }




    private void establecerConsola() {


        VBox marco = new VBox();
        marco.setSpacing(10);
        marco.setPadding(new Insets(15));
        this.setBottom(marco);
    }

    public Menu obtenerMenu() {

        return menu;

    }

    public VistaJugador obtenerVistaJugador() {
        return this.vistaJugador;
    }

}
