package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public class HachaDeMetalTest {
	
	@Test
	public void hachaDeMetalIniciaCon400DeDurabilidad() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Assert.assertEquals(400.0f,hachaDeMetal.getDurabilidad());
	}
	
	
	@Test
	public void hachaDeMetalIniciaCon5DeFuerza() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Assert.assertEquals(10,hachaDeMetal.getFuerza());
	}
	
	@Test
	public void hachaDeMetalSeUsaContraMaderaYSeReduceSuDurabilidad() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material madera = new Madera ();
		float durabilidadInicial = hachaDeMetal.getDurabilidad();
		hachaDeMetal.usar(madera);	
		Assert.assertEquals(durabilidadInicial - 5,hachaDeMetal.getDurabilidad());
	}
	
	@Test
	public void hachaDeMetalSeUsaContraPiedraYSeReduceSuDurabilidad() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material piedra = new Piedra ();
		float durabilidadInicial = hachaDeMetal.getDurabilidad();
		hachaDeMetal.usar(piedra);
		Assert.assertEquals(durabilidadInicial -5,hachaDeMetal.getDurabilidad());
	}
	
	@Test
	public void hachaDeMetalSeUsaContraMetalYSeReduceSuDurabilidad() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material metal = new Metal();
		float durabilidadInicial = hachaDeMetal.getDurabilidad();
		hachaDeMetal.usar(metal);
		
		Assert.assertEquals(durabilidadInicial -5,hachaDeMetal.getDurabilidad());
	}
	
	@Test
	public void hachaDeMetalSeUsaContraDiamanteYSeReduceSuDurabilidad() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material diamante = new Diamante();
		float durabilidadInicial = hachaDeMetal.getDurabilidad();
		hachaDeMetal.usar(diamante);	
		Assert.assertEquals(durabilidadInicial -5,hachaDeMetal.getDurabilidad());
	}
	
}
