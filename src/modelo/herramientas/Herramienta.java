package modelo.herramientas;


import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public abstract class Herramienta {


    protected float durabilidad;
    protected int fuerza;
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

	public abstract void golpear(Madera unaMadera);
	
	public abstract void golpear(Piedra unaPiedra);
	
	public abstract void golpear(Metal unaMaetal);
	
	public abstract void golpear(Diamante unaDiamante);

    public abstract String getIdentificador();

    public boolean esEquivalente(Herramienta otraHerramienta){

        return this.getClass() == otraHerramienta.getClass();

    }

    public abstract void desgastar(int danio);

    public abstract void usarContra(Material materialARecolectar);
    
    public boolean estaDestruido() {
    	return (this.durabilidad <= 0);
    }
    
    public abstract String getImagen();
}