package vista;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class AlgoCraft extends Application {

    public static double width;
    public static double heigth;
    private Group root;
    private static PlayerView player;


    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){


        loadMainMenu(primaryStage);



        /*
        width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;
        theStage.setTitle("MINECRAFT");

        root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        drawStage(root);

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.W) {
                    player.moveVertical(-10);
                }
                if( event.getCode() == KeyCode.S) {
                    player.moveVertical(10);
                }
                if (event.getCode() == KeyCode.D) {
                    player.moveHorizontal(10);
                }
                if (event.getCode() == KeyCode.A) {
                    player.moveHorizontal(-10);
                }
                event.consume();
            }

        });

        theStage.show();*/
    }


    private void drawStage(Group root) {

        setBackground();
        setMaterials();
        player = new PlayerView(root);
        Button botonGolpear = new Button();
        botonGolpear.setText("Golpear");
        root.getChildren().add(botonGolpear);

    }


    private void setBackground() {
        ImageView background= new ImageView();
        background.setImage(new Image("fondo.png"));
        background.setFitHeight(heigth*1.25);
        background.setFitWidth(width*1.25);
        root.getChildren().add(background);
    }


    private void setMaterials() {

        ImageView madera = new ImageView();
        madera.setImage(new Image("madera.png"));
        madera.setFitHeight(heigth*0.05);
        madera.setFitWidth(width*0.05);
        madera.setPreserveRatio(true);
        root.getChildren().add(madera);

    }


    public void loadMainMenu(Stage primaryStage){

        BorderPane border = new BorderPane();
        border.setPadding(new Insets(25,0,25,25));
        border.setId("background");

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
        vbButtons.getChildren().addAll(botonJugar, botonOpciones, botonCreditos,botonSalir);

        // Agrego VBox al BorderPane
        border.setCenter(vbButtons);

        Scene scene = new Scene(border, 900, 600);
        primaryStage.setTitle("Algocraft");
        primaryStage.setScene(scene);
        //primaryStage.getIcons().add(new Image("algocraft.png"));
        primaryStage.show();

    }

}