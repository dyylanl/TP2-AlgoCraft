package modelo.herramientas;


import modelo.golpeador.Golpeador;
import modelo.materiales.Material;


public abstract class Herramienta{


    protected float durabilidad;
    protected int fuerza;
 ///   protected Golpeador golpeador;
    protected float factorDeDesgaste;

    public abstract void desgastarse();

    public abstract Boolean validar(Material unMaterial);

    public int getFuerza(){

        return this.fuerza;

    }

    public float getDurabilidad(){

        return this.durabilidad;

    }




}