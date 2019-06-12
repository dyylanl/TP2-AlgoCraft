package modelo.constructores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.*;
import modelo.materiales.*;

public class MesaDeCrafteoTest{
	
	@Test
	public void MesaDeCrafteoCreaUnHachaDeMadera() {
		MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 0);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 1);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 3);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 4);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 7);
		
		Herramienta hachaDeMadera = mesaDeCrafteo.crearHerramienta();
		Assert.assertTrue(hachaDeMadera instanceof HachaDeMadera);
	}
	

	@Test
	public void MesaDeCrafteoCreaUnHachaDePiedra() {
		MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
		mesaDeCrafteo.agregarMaterialEnPosicion(new Piedra(), 0);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Piedra(), 1);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Piedra(), 3);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 4);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 7);
		
		Herramienta hachaDePiedra = mesaDeCrafteo.crearHerramienta();
		Assert.assertTrue(hachaDePiedra instanceof HachaDePiedra);
	}
	
	@Test
	public void MesaDeCrafteoCreaUnHachaDeMetal() {
		MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 0);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 1);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 3);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 4);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 7);
		
		Herramienta hachaDeMetal = mesaDeCrafteo.crearHerramienta();
		Assert.assertTrue(hachaDeMetal instanceof HachaDeMetal);
	}
	
	@Test
	public void MesaDeCrafteoCreaUnPicoDeMadera() {
		MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 0);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 1);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 2);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 4);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 7);
		
		Herramienta picoDeMadera = mesaDeCrafteo.crearHerramienta();
		Assert.assertTrue(picoDeMadera instanceof PicoDeMadera);
	}
	
	@Test
	public void MesaDeCrafteoCreaUnPicoDePiedra() {
		MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
		mesaDeCrafteo.agregarMaterialEnPosicion(new Piedra(), 0);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Piedra(), 1);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Piedra(), 2);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 4);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 7);
		
		Herramienta picoDePiedra = mesaDeCrafteo.crearHerramienta();
		Assert.assertTrue(picoDePiedra instanceof PicoDePiedra);
	}
	
	@Test
	public void MesaDeCrafteoCreaUnPicoDeMetal() {
		MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 0);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 1);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 2);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 4);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 7);
		
		Herramienta picoDeMetal = mesaDeCrafteo.crearHerramienta();
		Assert.assertTrue(picoDeMetal instanceof PicoDeMetal);
	}
	
	@Test
	public void MesaDeCrafteoCreaUnPicoFino() {
		MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 0);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 1);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Metal(), 2);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Piedra(), 3);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 4);
		mesaDeCrafteo.agregarMaterialEnPosicion(new Madera(), 7);
		
		Herramienta picoFino = mesaDeCrafteo.crearHerramienta();
		Assert.assertTrue(picoFino instanceof PicoFino);
	}

}