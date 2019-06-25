package modelo.constructores;

import modelo.excepciones.DispocisionNoExisteException;
import modelo.herramientas.Herramienta;

import java.util.HashMap;

public class Constructor {

    private HashMap<String, ConstructorDeHerramientas> recetas = new HashMap<String, ConstructorDeHerramientas>();

    public Constructor() {
        this.agregarReceta("mm-mm--m-", new ConstructorDeHachaDeMadera());
        this.agregarReceta("pp-pm--m-", new ConstructorDeHachaDePiedra());
        this.agregarReceta("MM-Mm--m-", new ConstructorDeHachaDeMetal());
        this.agregarReceta("mmm-m--m-", new ConstructorDePicoDeMadera());
        this.agregarReceta("ppp-m--m-", new ConstructorDePicoDePiedra());
        this.agregarReceta("MMM-m--m-", new ConstructorDePicoDeMetal());
        this.agregarReceta("MMMpm--m-", new ConstructorDePicoFino());
    }

    public boolean puedoCraftear(String receta) {
        return this.recetas.containsKey(receta);
    }

    public void agregarReceta(String receta, ConstructorDeHerramientas constructor) {
        this.recetas.put(receta, constructor);
    }
/*

    public Herramienta craftear(String receta) {

        if (this.puedoCraftear(receta)) {
            return this.recetas.get(receta).construir();
        }
        throw new DispocisionNoExisteException();
    }*/
}