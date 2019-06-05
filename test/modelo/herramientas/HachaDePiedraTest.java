package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class HachaDePiedraTest{
	
	@Test
	public void seCreaHachaDePiedraYDevuelve200DeDurabilidad() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Assert.assertEquals(200,hachaDePiedra.getDurabilidad());
	}
	
	@Test
	public void SeCreaHachaDePiedraYDevuelve5DeFuerza() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Assert.assertEquals(5,hachaDePiedra.getFuerza());
	}
	
}
