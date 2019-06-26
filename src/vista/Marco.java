package vista;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.jugador.Jugador;

public class Marco extends BorderPane {

    Menu menuBar;
    JugadorVista vistaJugador;
    VistaInventario vistaInventario;
    GridPane gridPane;
    VBox contenedorCentral;

    Stage stage;

    public Marco(Stage stage, Jugador Jugador) {
        this.setControles(stage, Jugador);
        this.setMenu(stage);
        this.setCentro(Jugador);
        this.setConsola();
        this.setBotonera(Jugador);
        this.stage = stage;
    }

    private void setControles(Stage stage, Jugador jugador) {

    }

    private void setBotonera(Jugador Jugador) {

        Button botonMostrarInventario = new Button();
        botonMostrarInventario.setText("Mostrar inventario");
        this.vistaInventario = new VistaInventario(stage,Jugador);
        BotonInventarioHandler moveButtonHandler = new BotonInventarioHandler(vistaInventario, Jugador);
        botonMostrarInventario.setOnAction(moveButtonHandler);

        VBox contenedorVertical = new VBox(botonMostrarInventario);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new Menu(stage);
        this.setTop(menuBar);
    }

    private void setCentro(Jugador Jugador) {
        this.gridPane = new GridPane();

        vistaJugador = new VistaJugador(Jugador, gridPane);
        vistaJugador.dibujar();

        contenedorCentral = new VBox(gridPane);
        contenedorCentral.setAlignment(Pos.CENTER);
        contenedorCentral.setSpacing(20);
        contenedorCentral.setPadding(new Insets(25));

        this.setCenter(contenedorCentral);
    }

    private void setConsola() {


        VBox marco = new VBox();
        marco.setSpacing(10);
        marco.setPadding(new Insets(15));
        marco.setStyle("-fx-background-color: black;");

        this.setBottom(marco);
    }

    public Menu obtenerMenu() {
        return menuBar;
    }

    public VistaJugador obtenerVistaJugador() {
        return this.vistaJugador;
    }

}
