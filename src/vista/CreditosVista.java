package vista;

import controlador.ControladorDeEscena;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class CreditosVista {

    BorderPane pane;
    ControladorDeEscena controladorDeEscena;

    public CreditosVista(ControladorDeEscena controladorDeEscena) {
        this.controladorDeEscena = controladorDeEscena;
        pane = new BorderPane();
        pane.setId("background");

        // Top
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        Text titulo = new Text("Creditos");
        titulo.setId("titulo");
        hBox.setId("titulo-hbox");
        hBox.getChildren().add(titulo);

        // Center
        VBox contenedor = new VBox();
        contenedor.setAlignment(Pos.TOP_CENTER);
        ImageView logo = new ImageView(new Image("logoCreditos.png", 400, 0, true, true));
        StackPane r = new StackPane();
        r.setId("logo-creditos");
        r.setMaxHeight(60);
        VBox.setVgrow(r, Priority.ALWAYS);
        r.getChildren().add(logo);
        Text tituloCred = new Text("Integrantes del proyecto:");
        Text vacio = new Text("");
        Text nombre1 = new Text("Ledesma, Dylan.");
        Text nombre2 = new Text("Albert");
        Text nombre3 = new Text("Joseph");
        Text nombre4 = new Text("Rocio");
        tituloCred.setId("titulo-creditos");
        vacio.setId("vacio");
        nombre1.setId("nombre");
        nombre2.setId("nombre");
        nombre3.setId("nombre");
        nombre4.setId("nombre");
        contenedor.getChildren().addAll(r, tituloCred,vacio, nombre1, nombre2, nombre3, nombre4);
        contenedor.setLayoutY(2000);

        // Bottom
        HBox volver = new HBox();
        volver.setId("boton-volver");
        volver.setAlignment(Pos.CENTER);
        Button btnVolver = new Button();
        btnVolver.setGraphic(new Label("Volver"));
        btnVolver.setOnAction(e -> {
            controladorDeEscena.activate("main");
        });
        volver.getChildren().add(btnVolver);

        pane.setTop(hBox);
        pane.setCenter(contenedor);
        pane.setBottom(volver);
    }

    public Pane getPane() {
        return this.pane;
    }
}
