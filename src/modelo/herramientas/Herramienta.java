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

    public float getDurabilidad(){

        return this.durabilidad;

    }




}