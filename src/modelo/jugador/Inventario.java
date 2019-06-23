package modelo.jugador;

import modelo.herramientas.Herramienta;
import modelo.materiales.Material;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Herramienta> herramientas;
    private ArrayList<Material> materiales;


    public Inventario() {

        this.herramientas = new ArrayList<>();
        this.materiales = new ArrayList<>();

    }


    public void setHerramienta(Herramienta herramienta) {

        this.herramientas.add(herramienta);

    }


    public void setMaterial(Material material) {

        this.materiales.add(material);

    }


    public boolean contieneHerramienta(Herramienta herramienta) {

        int indice = 0;
        boolean herramientaEncontrada = false;

        while((!herramientaEncontrada) && (indice < herramientas.size())){


            if (herramienta.esEquivalente(this.herramientas.get(indice))) {

                herramientaEncontrada = true;

            }

            indice++;

        }

        return herramientaEncontrada;
    }


    public boolean contieneMaterial(Material material) {

        int indice = 0;
        boolean materialEncontrado = false;

        while((!materialEncontrado) && (indice < materiales.size())){

            if (material.esEquivalante(this.materiales.get(indice))) {
                materialEncontrado = true;
            }

            indice++;

        }

        return materialEncontrado;
    }


    public ArrayList<Herramienta> getHerramientas(){

        return this.herramientas;

    }


    public ArrayList<Material> getMateriales() {

        return materiales;

    }


}
