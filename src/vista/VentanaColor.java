package vista;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import modelo.juego.ModeloObservable;
import modelo.posicion.Posicion;

public class VentanaColor extends JFrame {

    private static final long serialVersionUID = 7787529771808926374L;

    public VentanaColor(int cantidadFilasYColumnas, ModeloObservable modelo) {

        setTitle("MINECRAFT");
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(cantidadFilasYColumnas, cantidadFilasYColumnas));

        for (int x = 0; x < cantidadFilasYColumnas; x++) {

            for (int y = 0; y < cantidadFilasYColumnas; y++) {

                contenedor.add(new VistaModeloDatoColor(new Posicion(x, y), modelo));

            }
        }

    }

}

