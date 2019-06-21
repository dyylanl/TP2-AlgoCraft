package modelo.constructores;

import java.util.Arrays;
import java.util.List;

import modelo.herramientas.*;

public abstract class ConstructorDeHerramientas{
	
	Mesa mesa;
	
	public abstract Herramienta ConstruirHerramienta();
	
	public boolean puedeConstruir(Mesa otraMesa) {
		return mesa.esEquivalente(otraMesa);
	}
	
	public static List<ConstructorDeHerramientas> getConstructores() {
		List<ConstructorDeHerramientas> constructores = Arrays.asList(new ConstructorDeHachaDeMadera(), 
				new ConstructorDeHachaDePiedra(),
				new ConstructorDeHachaDeMetal(),
				new ConstructorDePicoDeMetal(),
				new ConstructorDePicoDeMadera(),
				new ConstructorDePicoDePiedra(),
				new ConstructorDePicoFino()
				);
		return constructores;
	}
	
}