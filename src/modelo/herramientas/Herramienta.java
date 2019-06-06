package modelo.herramientas;

import modelo.materiales.Material;
import modelo.golpeador.Golpeador;


public abstract class Herramienta{


    protected float durabilidad;
    protected int fuerza;
    protected Golpeador golpeador;
    protected float factorDeDesgaste;

    public abstract void desgastarse();


    public int getFuerza(){

        return this.fuerza;

    }

    public float getDurabilidad(){

        return this.durabilidad;

    }




}