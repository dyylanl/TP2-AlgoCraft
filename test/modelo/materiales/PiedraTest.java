package modelo.materiales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.Hacha;
import modelo.herramientas.HachaDeMadera;
import modelo.herramientas.HachaDeMetal;
import modelo.herramientas.HachaDePiedra;

public class PiedraTest {
	
	@Test
	public void PiedraIniciaConUnaDurabilidadDe30() {
		Material piedra = new Piedra();
		Assert.assertEquals(30, piedra.getDurabilidad());
	}
	
	/*
	@Test
	public void PiedraEsGolpeadaPorPicoDePiedra() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Material piedra = new Piedra();
		piedra.recibeGolpeDe(hachaDePiedra);
		Assert.assertEquals(25,piedra.getDurabilidad());
	}
	*/
	/*
	@Test
	public void PiedraEsGolpeadaPorPicoDeMadera() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material piedra = new Piedra();
		piedra.resibeGolpeDe(hachaDeMadera);
		Assert.assertEquals(30,piedra.getDurabilidad());
		}
		*/
	
	@Test
	public void hachaDeMaderaGolpeaPiedraYPiedraNoReduceSuDurabilidad() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material piedra = new Piedra();	
		
		int durabilidadIni = piedra.getDurabilidad();
		
		hachaDeMadera.usar(piedra);	
		
		Assert.assertEquals(durabilidadIni , piedra.getDurabilidad());
	}
	
	@Test
	public void hachaDePiedraGolpeaPiedraYPiedraNoReduceSuDurabilidad() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Material piedra = new Piedra();	
		
		int durabilidadIni = piedra.getDurabilidad();
		
		hachaDePiedra.usar(piedra);	
		
		Assert.assertEquals(durabilidadIni , piedra.getDurabilidad());
	}
	
	@Test
	public void hachaDeMetalGolpeaPiedraYPiedraNoReduceSuDurabilidad() {
		Hacha hachaDeMetal = new HachaDeMetal();
		Material piedra = new Piedra();	
		
		int durabilidadIni = piedra.getDurabilidad();
		
		hachaDeMetal.usar(piedra);	
		
		Assert.assertEquals(durabilidadIni , piedra.getDurabilidad());
	}
}