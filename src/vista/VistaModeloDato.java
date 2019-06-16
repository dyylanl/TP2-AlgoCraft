package vista;

import controlador.ControladorMouse;
import modelo.juego.ModeloObservable;
import modelo.posicion.Posicion;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

public abstract class VistaModeloDato extends JPanel implements Observer {

    private static final long serialVersionUID = -973667959098244571L;
    protected ModeloObservable modelo;
    public Posicion posicion;


    public void update(Observable o, Object arg) {

        VistaModeloDato vista = (VistaModeloDato) arg;

        if (vista.posicion.equals(this.posicion)) {
            updateVista();
        }
    }


    public VistaModeloDato(Posicion posicion, ModeloObservable modelo) {

        this.posicion = posicion;
        this.modelo = modelo;
        this.modelo.addObserver(this);
        addMouseListener(new ControladorMouse(modelo, this));

    }


    protected abstract void updateVista();


}