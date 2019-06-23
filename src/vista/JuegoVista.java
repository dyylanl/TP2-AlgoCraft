package vista;

import controlador.ControladorDeEscena;
import controlador.ControladorDelJuego;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class JuegoVista {

    GridPane mapa;
    ControladorDelJuego controlador;
    private BorderPane main;

    public JuegoVista(ControladorDeEscena controladorDeEscena){

        this.main = new BorderPane();
        this.main.setId("juego");

        this.mapa = new GridPane();
        this.mapa.setStyle(("-fx-background-image: url('fondo.png')"));
        this.mapa.setAlignment(Pos.CENTER);

        HBox menu = new HBox();
        menu.setAlignment(Pos.CENTER);
        Boton btnInventario = new Boton("Inventario - [E]");
        Boton btnMenu = new Boton("Menu - [ESC]");
        btnInventario.setOnAction(e -> {
            controladorDeEscena.activate("inventario");
        });
        btnMenu.setOnAction(e -> {
            controladorDeEscena.activate("main");
        });
        menu.getChildren().addAll(btnMenu, btnInventario);


        VBox flechas = new VBox();
        flechas.setAlignment(Pos.BOTTOM_CENTER);
        HBox flechasAbajo = new HBox();
        Boton btnIzquierda = new Boton("A");
        Boton btnDerecha = new Boton("D");
        Boton btnAbajo = new Boton("S");
        flechasAbajo.getChildren().addAll(btnIzquierda,btnAbajo,btnDerecha);
        flechasAbajo.setAlignment(Pos.CENTER);
        Boton btnArriba = new Boton("W");
        flechas.getChildren().addAll(btnArriba, flechasAbajo);
        btnIzquierda.setOnAction( e -> {
        	controlador.moverIzquierda();
        });
        btnDerecha.setOnAction( e -> {
            controlador.moverDerecha();
        });
        btnAbajo.setOnAction( e -> {
            controlador.moverAbajo();
        });
        btnArriba.setOnAction( e -> {
            controlador.moverArriba();
        });
        
        this.main.setTop(menu);
        this.main.setBottom(flechas);
        this.main.setCenter(this.mapa);
    }

    
    public void setControlador(ControladorDelJuego controlador) {
        this.controlador = controlador;
    }


    public void agregarElemento(String nombreImagen, int fila, int col) {
        ImageView img = new ImageView(new Image(nombreImagen,50,0,true,true));
        mapa.add(img, col, fila);
    }


    public Pane getPane(){ return this.main; }
}
