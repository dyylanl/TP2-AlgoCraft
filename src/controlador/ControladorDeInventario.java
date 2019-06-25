package controlador;


import modelo.constructores.MesaDeCrafteo;
import modelo.herramientas.Herramienta;
import modelo.jugador.Inventario;
import modelo.materiales.*;
import modelo.materiales.Material;
import vista.InventarioVista;
import vista.SelectorDeHerramientas;
import java.util.ArrayList;
import java.util.HashMap;


public class ControladorDeInventario {

    private SelectorDeHerramientas selectorHerramientas;
    private ArrayList<Material> materiales;
    private ArrayList<Herramienta> herramientas;
    private InventarioVista inventarioVista;
    private HashMap<Character, String> materialesHash = new HashMap<>();
    private MesaDeCrafteo mesaCrafteo = new MesaDeCrafteo();

    public ControladorDeInventario(Inventario inventario, InventarioVista inventarioVista, SelectorDeHerramientas selectorHerramientas) {
        System.out.println("Iniciando constructor de Controlador de inventario");
        this.materiales = inventario.getMateriales();
        this.herramientas = inventario.getHerramientas();
        this.selectorHerramientas = selectorHerramientas;
        this.inventarioVista = inventarioVista;
        inicializarHash();
        inventarioVista.setControlador(this);
    }

    public void actualizarVista() {
        System.out.println("Actualizando vista de controlador de inventario");
        this.inventarioVista.limpiar();
        System.out.println("inventarioVista limpiado");
        int j = -1;
        for (int i = 0; i < this.materiales.size(); i++) {
            if (i % 9 == 0) {
                j++;
            }
            inventarioVista.agregar(materialesHash.get(this.materiales.get(i).getIdentificador()), i % 9, j);
            System.out.println("Se agregaron los materiales al inventario vista");
        }

        this.selectorHerramientas.limpiar();
        System.out.println("Selector de herramientas limpio");
        for (int i = 0; i < herramientas.size(); i++) {
            System.out.println("Agregando herramientas al selector");
            System.out.println("El identificador de la herramienta es: "+herramientas.get(i).getIdentificador());
            this.selectorHerramientas.agregar(herramientas.get(i).getIdentificador(), i);
        }
        System.out.println("Saliendo de vista de controlador de inventario");
    }

    private void inicializarHash() {
        this.materialesHash.put('m', "madera");
        this.materialesHash.put('p', "piedra");
        this.materialesHash.put('M', "metal");
        this.materialesHash.put('d', "diamante");
    }

    public void agregarAMesaCrafteo(char identificador, int pos){
        Material[] materiales = new Material[4];
        materiales[0] = new Madera();
        materiales[1] = new Metal();
        materiales[2] = new Piedra();
        materiales[3] = new Diamante();
        Material material = null;
        int index = 0;
        while (material == null || index < 4){
            if (identificador == materiales[index].getIdentificador()){
                material = materiales[index];
            }
            index++;
        }
        mesaCrafteo.colocar(material, pos);
    }

    public Herramienta crearHerramienta() {
        return mesaCrafteo.construir();
    }
}
