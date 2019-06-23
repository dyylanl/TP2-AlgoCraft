package controlador;


import modelo.herramientas.Herramienta;
import modelo.jugador.Inventario;
import modelo.materiales.Material;
import vista.InventarioVista;

import java.util.ArrayList;
import java.util.HashMap;

public class ControladorDeInventario {

    private Inventario inventario;
    private InventarioVista inventarioVista;
    private HashMap<Character, String> materialesHash = new HashMap<>();


    public ControladorDeInventario(Inventario inventario, InventarioVista inventarioVista) {

        this.inventario = inventario;
        this.inventarioVista = inventarioVista;
        inicializarHash();

    }


    public void actualizarVista() {

        ArrayList<Material> materiales = inventario.getMateriales();
        ArrayList<Herramienta> herramientas = inventario.getHerramientas();
/*
        int columna = -1;
        for (int fila = 0; fila < materiales.size(); fila++) {

            if (fila % 9 == 0) {
                columna++;
            }

            inventarioVista.agregar(materialesHash.get(materiales.get(fila).getIdentificador()), fila % 9, columna);

        }

        for (int i = 0; i < herramientas.size(); i++) {
            inventarioVista.agregar(herramientas.get(i).getIdentificador(), i, i % 9);

        }*/

    }


    private void inicializarHash() {
        this.materialesHash.put('m', "madera");
        this.materialesHash.put('p', "piedra");
        this.materialesHash.put('M', "metal");
        this.materialesHash.put('d', "diamante");
    }


}