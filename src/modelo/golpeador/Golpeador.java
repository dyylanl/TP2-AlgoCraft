package modelo.golpeador;

public class Golpeador{

    //Atributos:
    public String materialQueDania;



    //Metodos:
    public Golpeador(String unMaterial){

        this.materialQueDania = unMaterial;

    }


    public void golpear(Material unMaterial,Herramienta unaHerramienta){

        if(unMaterial.getClase() == materialQueDania){

            unMaterial.reducirDurabilidad(unaHerramienta.obtenerFuerza()):
            unaHerramienta.desgastarse();

        }
        else{

            unaHerramienta.desgastarse();

        }
    }



}