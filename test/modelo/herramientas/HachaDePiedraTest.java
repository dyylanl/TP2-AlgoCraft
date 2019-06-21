package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;

public class HachaDePiedraTest{
	
	@Test
	public void seCreaHachaDePiedraYDevuelve200DeDurabilidad() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Assert.assertEquals(200.0f,hachaDePiedra.getDurabilidad());
	}
	
	@Test
	public void SeCreaHachaDePiedraYDevuelve5DeFuerza() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Assert.assertEquals(5,hachaDePiedra.getFuerza());
	}
	
	
	@Test
	public void hachaDePiedraSeUsaContraMadera() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Material madera = new Madera ();
		hachaDePiedra.usar(madera);
		
		Assert.assertEquals(195f,hachaDePiedra.getDurabilidad());
	}
	
	@Test
	public void hachaDePiedraSeUsaContraPiedra() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Material piedra = new Piedra ();
		hachaDePiedra.usar(piedra);
		
		Assert.assertEquals(195f,hachaDePiedra.getDurabilidad());
	}
	
	@Test
	public void hachaDePiedraSeUsaContraMetal() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Material metal = new Metal();
		hachaDePiedra.usar(metal);
		
		Assert.assertEquals(195f,hachaDePiedra.getDurabilidad());
	}
	
	@Test
	public void hachaDePiedraSeUsaContraDiamante() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Material diamante = new Diamante();
		hachaDePiedra.usar(diamante);
		
		Assert.assertEquals(195f,hachaDePiedra.getDurabilidad());
	}
	
}
