package modelo.constructores;

import java.util.Arrays;
import java.util.List;

import modelo.herramientas.*;

public class ConstructorDeHerramientas {

	Mesa mesa;

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


	public Herramienta construirPicoDeMadera() {

		ConstructorDePicoDeMadera constructorDePicoDeMadera = new ConstructorDePicoDeMadera();
		return constructorDePicoDeMadera.ConstruirHerramienta();

	}

	public Herramienta construirPicoDePiedra() {

		ConstructorDePicoDePiedra constructorDePicoDePiedra = new ConstructorDePicoDePiedra();
		return constructorDePicoDePiedra.ConstruirHerramienta();

	}

	public Herramienta construirPicoDeMetal() {

		ConstructorDePicoDeMetal constructorDePicoDeMetal = new ConstructorDePicoDeMetal();
		return constructorDePicoDeMetal.ConstruirHerramienta();

	}

	public Herramienta construirHachaDeMadera() {

		ConstructorDeHachaDeMadera constructorDeHachaDeMadera = new ConstructorDeHachaDeMadera();
		return constructorDeHachaDeMadera.ConstruirHerramienta();

	}

	public Herramienta construirHachaDePiedra() {

		ConstructorDeHachaDePiedra constructorDeHachaDePiedra = new ConstructorDeHachaDePiedra();
		return constructorDeHachaDePiedra.ConstruirHerramienta();

	}

	public Herramienta construirHachaDeMetal() {

		ConstructorDeHachaDeMetal constructorDeHachaDeMetal = new ConstructorDeHachaDeMetal();
		return constructorDeHachaDeMetal.ConstruirHerramienta();

	}

	public Herramienta construirPicoFino() {

		ConstructorDePicoFino constructorDePicoFino = new ConstructorDePicoFino();
		return constructorDePicoFino.ConstruirHerramienta();

	}

}
