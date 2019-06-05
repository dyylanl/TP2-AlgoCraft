package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;


public class HachaDeMetalTest {
	
	@Test
	public void hachaDeMetalIniciaCon400DeDurabilidad() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Assert.assertEquals(400,hachaDeMetal.getDurabilidad());
	}
	
	
	@Test
	public void hachaDeMetalIniciaCon5DeFuerza() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Assert.assertEquals(10,hachaDeMetal.getFuerza());
	}
	
}
