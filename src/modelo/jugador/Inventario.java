package modelo.jugador;

import modelo.herramientas.Herramienta;
import modelo.interfaz.ObjetoMinecraft;
import modelo.materiales.Material;

import java.util.ArrayList;
import java.util.List;

public class Inventario {


    private List<ObjetoMinecraft> elementos = new ArrayList<ObjetoMinecraft>();


    public int obtenerCantidadDeObjetos() {

        return elementos.size();

        }


   public void agregarAlInventario(ObjetoMinecraft material) {

        elementos.add(material);

        }


   public ObjetoMinecraft obtenerGuardable(int posicion) {

        return elementos.get(posicion);

    }


   public void removerGuardable(ObjetoMinecraft material) {

        elementos.remove(material);

        }


}
