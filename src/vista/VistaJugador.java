package vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import modelo.jugador.Jugador;
import modelo.mapas.Mapa;
import modelo.posicion.Posicion;

public class VistaJugador {

    private Jugador Jugador;
    GridPane gridPane;

    private int ancho = 12;
    private int alto = 8;

    public VistaJugador(Jugador Jugador, GridPane panel) {

        this.Jugador = Jugador;
        this.gridPane = panel;

    }


    private void actualizar() {


        Mapa mapa = jugador.getMapa();

        for (int y = 0 ; y < alto ; y++) {
            for (int x = 0 ; x < ancho; x++) {
                Celda ocupable = mapa.obtenerCelda(new Posicion(x,y));
                ObjetoMinecraft elemento = ocupable.obtenerElemento();
                Image imagen = new Image("vacio.png");
                if (elemento != null){
                    String ruta = elemento.getImagen();
                    imagen = new Image(ruta);
                }
                ImageView imageView = new ImageView(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                gridPane.add(imageView, x, y);

            }
        }
    }


}
