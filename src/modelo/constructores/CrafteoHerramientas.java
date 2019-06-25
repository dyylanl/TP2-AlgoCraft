package modelo.constructores;

import modelo.herramientas.Herramienta;
import modelo.materiales.Material;
import modelo.posicion.Posicion;

import java.util.HashMap;

public abstract class CrafteoHerramientas {

    protected HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();

    protected ConstructorDeHerramientas constructor = new ConstructorDeHerramientas();

    public abstract Herramienta crearHerramienta();

    public boolean igual(HashMap<Posicion, Material> crafteo_) {
        boolean igual = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Posicion posicion = new Posicion(i, j);
                Material materialDeHerramienta = crafteo.get(posicion);
                Material materialRecibido = crafteo_.get(posicion);

                if (materialDeHerramienta == null && materialRecibido != null ||
                        materialDeHerramienta != null && materialRecibido == null) {
                    igual = false;
                } else if ((materialDeHerramienta != null && materialRecibido != null)
                        && materialDeHerramienta.getClass() != materialRecibido.getClass()) {
                    igual = false;
                }
            }
        }

        return igual;
    }
}
