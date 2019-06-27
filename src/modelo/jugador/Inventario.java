package modelo.jugador;

import modelo.herramientas.Herramienta;
import modelo.materiales.Material;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Herramienta> herramientas = new ArrayList<>();
    private ArrayList<Material> materiales = new ArrayList<>();
    private int posicionHerramientaSeleccionada = 0;


    public void agregarHerramienta(Herramienta herramienta) {
        this.herramientas.add(herramienta);
    }

    public void agregarMaterial(Material material) {
        this.materiales.add(material);
    }

    public boolean contieneHerramienta(Herramienta herramienta) {

        return herramientas.contains(herramienta);
    }

    public boolean contieneMaterial(Material material) {

        return materiales.contains(material);
    }

    public ArrayList<Herramienta> getHerramientas(){

        return this.herramientas;

    }

    public ArrayList<Material> getMateriales() {
        return materiales;
    }


}
