package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.*;

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
	
	/*
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
	
	@Test
	public void hachaDeMaderaGolpeaMetalEsFalse() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material metal = new Metal();		
		Assert.assertFalse(hachaDeMadera.validar(metal));
	}
	
	@Test
	public void hachaDeMaderaGolpeaDiamanteEsFalse() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material diamante = new Diamante();		
		Assert.assertFalse(hachaDeMadera.validar(diamante));
	}
	*/
	
	// DESDE ACA SEPARAR A OTRO A PACKAGE
	
	@Test
	public void hachaDeMaderaGolpeaMaderaYHachaReduceSuDurabilidadEn2() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material madera = new Madera();	
		
		float durabilidadIni = hachaDeMadera.getDurabilidad();
		
		hachaDeMadera.usar(madera);	
		
		Assert.assertEquals(durabilidadIni-2 , hachaDeMadera.getDurabilidad());
	}
	
	@Test
	public void hachaDeMaderaGolpeaPiedraYHachaReduceSuDurabilidadEn2() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material piedra = new Piedra();	
		
		float durabilidadIni = hachaDeMadera.getDurabilidad();
		
		hachaDeMadera.usar(piedra);	
		
		Assert.assertEquals(durabilidadIni-2 , hachaDeMadera.getDurabilidad());
	}
	
	
	@Test
	public void hachaDeMaderaGolpeaMetalYHachaReduceSuDurabilidadEn2() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material metal = new Metal();	
		
		float durabilidadIni = hachaDeMadera.getDurabilidad();
		
		hachaDeMadera.usar(metal);	
		
		Assert.assertEquals(durabilidadIni-2 , hachaDeMadera.getDurabilidad());
	}
	
	@Test
	public void hachaDeMaderaGolpeaMetalYMetalNoReduceSuDurabilidad() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material metal = new Metal();	
		
		int durabilidadIni = metal.getDurabilidad();
		
		hachaDeMadera.usar(metal);	
		
		Assert.assertEquals(durabilidadIni , metal.getDurabilidad());
	}
	
	//FALTA OCNTRA HACHA DE DIAMANTE
	
	
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
