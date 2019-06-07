package modelo.herramientas;


import modelo.golpeador.Golpeador;
import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public abstract class Herramienta{


    protected float durabilidad;
    protected int fuerza;
 ///   protected Golpeador golpeador;
    protected float factorDeDesgaste;

    public abstract void desgastarse();
/*
    public abstract Boolean validar(Material unMaterial);
*/
    public int getFuerza(){

        return this.fuerza;

    }

    public float getDurabilidad(){
        return this.durabilidad;

    }


	public void usar(Material unMaterial) {
		unMaterial.recibeGolpeDe(this);
		
	}


	public abstract void gopear(Madera unaMadera);
	
	public abstract void gopear(Piedra unaPiedra);
	
	public abstract void gopear(Metal unaMaetal);
	
	public abstract void gopear(Diamante unaDiamante);
}