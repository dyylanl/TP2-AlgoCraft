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

    }


    // FALTA TERMINAR EL METODOO
    public void actualizarVista() {

        ArrayList<Material> materiales = inventario.getMateriales();
        ArrayList<Herramienta> herramientas = inventario.getHerramientas();
    }

}