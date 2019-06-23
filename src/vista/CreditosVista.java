package vista;

import controlador.ControladorDeEscena;
import controlador.ControladorDelJuego;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class CreditosVista {

    ControladorDelJuego controlador;
    private BorderPane main;

    public CreditosVista(ControladorDeEscena controladorDeEscena){

        this.main = new BorderPane();
        this.main.setId("Creditos");
        
        Boton btnVolver = new Boton("Volver");
        
        btnVolver.setOnAction(e -> {
            controladorDeEscena.activate("main");
        });
        
        HBox encabezado = this.contenedorSuperior(btnVolver);
       
        this.main.setTop(encabezado);
        this.main.setCenter(this.obtenerAutores());
    }

    private HBox contenedorSuperior(Boton botonVolver){
    	HBox contenedor = new HBox();
    	contenedor.setAlignment(Pos.CENTER);
    	contenedor.setSpacing(10);
    	
    	contenedor.getChildren().addAll(botonVolver, new Label("-----CREDITOS-----"));
    	
    	return contenedor;
        	
    }
    
    private VBox obtenerAutores(){
    	VBox contenedorAutores = new VBox ();
    	contenedorAutores.setAlignment(Pos.CENTER);
    	
    	Label autor1 = new Label("Joseph");
        Label autor2 = new Label("Dylan") ;
        Label autor3 = new Label("Albert") ;
        Label autor4 = new Label("Rocio") ;
        
        contenedorAutores.getChildren().addAll(autor1, autor2, autor3, autor4);
        
        return contenedorAutores;
    	
    }

    public Pane getPane(){ return this.main; }
}
