package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;


public class HachaDeMaderaTest {
	
	@Test
	public void hachaDeMaderaIniciaCon100DeDurabilidad() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Assert.assertEquals(100,hachaDeMadera.getDurabilidad());
	}
	
	
	@Test
	public void hachaDeMaderaIniciaCon5DeFuerza() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Assert.assertEquals(2,hachaDeMadera.getFuerza());
	}
	
}
