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
	
	
}