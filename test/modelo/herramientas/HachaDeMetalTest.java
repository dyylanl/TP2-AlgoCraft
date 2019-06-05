package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


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
	
	@Test
	public void hachaDeMetalSeUsaContraMadera() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material madera = new Madera ();
		hachaDeMetal.usar(madera);
		
		Assert.assertEquals(395,hachaDeMetal.getDurabilidad());
	}
	
	@Test
	public void hachaDeMaderaSeUsaContraPiedra() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material piedra = new Piedra ();
		hachaDeMetal.usar(piedra);
		
		Assert.assertEquals(395,hachaDeMetal.getDurabilidad());
	}
	
	@Test
	public void hachaDeMaderaSeUsaContraMetal() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material metal = new Metal();
		hachaDeMetal.usar(metal);
		
		Assert.assertEquals(395,hachaDeMetal.getDurabilidad());
	}
}
