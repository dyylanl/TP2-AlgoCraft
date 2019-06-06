package modelo.herramientas;

import modelo.materiales.Material;
import modelo.golpeador.Golpeador;


public abstract class Herramienta{


    private float durabilidad;
    private int fuerza;
    private Golpeador golpeador;


    public abstract void desgastarse();


    public int getFuerza(){

        return this.fuerza;

    }

    public int getDurabilidad(){

        return this.durabilidad;

    }




}