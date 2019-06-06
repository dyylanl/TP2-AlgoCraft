package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public class HachaDeMaderaTest {
	
	@Test
	public void hachaDeMaderaIniciaCon100DeDurabilidad() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Assert.assertEquals(100.0f,hachaDeMadera.getDurabilidad());
	}
	
	
	@Test
	public void hachaDeMaderaIniciaCon5DeFuerza() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Assert.assertEquals(2,hachaDeMadera.getFuerza());
	}
	
	@Test
	public void hachaDeMaderaGolpeaPiedraEsFalse() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material piedra = new Piedra();		
		Assert.assertFalse(hachaDeMadera.validar(piedra));
	}
	
	@Test
	public void hachaDeMaderaGolpeaMaderaEsTrue() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material madera = new Madera();		
		Assert.assertTrue(hachaDeMadera.validar(madera));
	}
	
	/*
	@Test
	public void hachaDeMaderaSeUsaContraMadera() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material madera = new Madera ();
		hachaDeMadera.usar(madera);
		
		Assert.assertEquals(98.0f,hachaDeMadera.getDurabilidad());
	}
	
	@Test
	public void hachaDeMaderaSeUsaContraPiedra() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material piedra = new Piedra ();
		hachaDeMadera.usar(piedra);
		
		Assert.assertEquals(98.0f,hachaDeMadera.getDurabilidad());
	}
	
	@Test
	public void hachaDeMaderaSeUsaContraMetal() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material metal = new Metal();
		hachaDeMadera.usar(metal);
		
		Assert.assertEquals(98.0f,hachaDeMadera.getDurabilidad());
	}
	*/
}
