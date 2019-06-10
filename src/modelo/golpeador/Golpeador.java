package modelo.golpeador;

import modelo.herramientas.Herramienta;
import modelo.materiales.Material;

public class Golpeador{

    //Atributos:
    public String materialQueDania;



    //Metodos:
    public Golpeador(String unMaterial){

        this.materialQueDania = unMaterial;

    }
/*

    public void golpear(Material unMaterial,Herramienta unaHerramienta){

        if(unMaterial.getClase() == materialQueDania){

            unMaterial.reducirDurabilidad(unaHerramienta.getFuerza());
            unaHerramienta.desgastarse();

        }
        else{

            unaHerramienta.desgastarse();

        }
    }

*/

}