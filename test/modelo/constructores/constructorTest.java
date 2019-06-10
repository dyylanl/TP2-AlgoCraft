package modelo.constructores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.*;

public class constructorTest{
	
	@Test
	public void constructorDevuelveHachaDeMadera() {
		Constructor constructor = new Constructor();
		
		Herramienta hachaDeMadera = constructor.getHerramienta("110110010");
		
		Assert.assertTrue(hachaDeMadera instanceof HachaDeMadera);
	}
	
	@Test
	public void constructorDevuelveHachaDePiedra() {
		Constructor constructor = new Constructor();
		
		Herramienta hachaDePiedra = constructor.getHerramienta("220210010");
		
		Assert.assertTrue(hachaDePiedra instanceof HachaDePiedra);
	}
	
	@Test
	public void constructorDevuelveHachaDeMetal() {
		Constructor constructor = new Constructor();
		
		Herramienta hachaDeMetal = constructor.getHerramienta("330310010");
		
		Assert.assertTrue(hachaDeMetal instanceof HachaDeMetal);
	}
	
	@Test
	public void constructorDevuelvePicoDeMadera() {
		Constructor constructor = new Constructor();
		
		Herramienta picoDeMadera = constructor.getHerramienta("111010010");
		
		Assert.assertTrue(picoDeMadera instanceof PicoDeMadera);
	}
	
	@Test
	public void constructorDevuelvePicoDePiedra() {
		Constructor constructor = new Constructor();
		
		Herramienta picoDePiedra = constructor.getHerramienta("222010010");
		
		Assert.assertTrue(picoDePiedra instanceof PicoDePiedra);
	}
	
	
	@Test
	public void constructorDevuelvePicoDeMetal() {
		Constructor constructor = new Constructor();
		
		Herramienta picoDeMetal = constructor.getHerramienta("333010010");
		
		Assert.assertTrue(picoDeMetal instanceof PicoDeMetal);
	}
	
	@Test
	public void constructorDevuelvePicoFico() {
		Constructor constructor = new Constructor();
		
		Herramienta picoFino = constructor.getHerramienta("333210010");
		
		Assert.assertTrue(picoFino instanceof PicoFino);
	}
}