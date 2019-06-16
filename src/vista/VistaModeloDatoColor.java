package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import modelo.juego.ModeloObservable;
import modelo.posicion.Posicion;

public class VistaModeloDatoColor extends VistaModeloDato {


    private static final long serialVersionUID = -8589998189231718180L;
    private Color color;


    private Color nuevoColor() {

        Color color = ConstanteColores.coloresCool[0];

        if (modelo == null) {
            return color;
        }

        int colorIndex = modelo.getModeloDato(posicion);

        return ConstanteColores.coloresCool[colorIndex];
    }


    public VistaModeloDatoColor(Posicion posicion, ModeloObservable modelo) {

        super(posicion, modelo);

        this.color = nuevoColor();
    }


    public void paintComponent(Graphics grafico) {

        super.paintComponent(grafico);
        grafico.setColor(color);
        Dimension dimension = getSize();

        grafico.fill3DRect(0, 0, dimension.width, dimension.height, true);
    }


    @Override
    protected void updateVista() {

        color = nuevoColor();
        repaint();
    }

}