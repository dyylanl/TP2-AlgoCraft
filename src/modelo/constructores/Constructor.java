package modelo.constructores;

import java.util.*;

import modelo.herramientas.*;

public class Constructor{
	
	HashMap <String,Herramienta> contenedor;
	
	private static String hachaDeMadera = "110110010";
	private static String hachaDePiedra = "220210010";
	private static String hachaDeMetal = "330310010";
	private static String picoDeMadera = "111010010";
	private static String picoDePiedra = "222010010";
	private static String picoDeMetal = "333010010";
	private static String picoFino = "333210010";
	
	public Constructor() {
		contenedor = new HashMap <String,Herramienta>();
		
		contenedor.put(hachaDeMadera,crearHachaDeMadera());
		contenedor.put(hachaDePiedra,crearHachaDePiedra());
		contenedor.put(hachaDeMetal,crearHachaDeMetal());
		contenedor.put(picoDeMadera,crearPicoDeMadera());
		contenedor.put(picoDePiedra,crearPicoDePiedra());
		contenedor.put(picoDeMetal,crearPicoDeMetal());
		contenedor.put(picoFino,crearPicoFino());
	}
	
	private Herramienta crearHachaDeMadera() {
		return new HachaDeMadera();
	}
	
	private Herramienta crearHachaDePiedra() {
		return new HachaDePiedra();
	}
	
	private Herramienta crearHachaDeMetal() {
		return new HachaDeMetal();
	}
	
	private Herramienta crearPicoDeMadera() {
		return new PicoDeMadera();
	}
	
	private Herramienta crearPicoDePiedra() {
		return new PicoDePiedra();
	}
	
	private Herramienta crearPicoDeMetal() {
		return new PicoDeMetal();
	}
	
	private Herramienta crearPicoFino() {
		return new PicoFino();
	}

	public Herramienta getHerramienta(String string) {
		// TODO Auto-generated method stub
		return contenedor.get(string);
	}
}