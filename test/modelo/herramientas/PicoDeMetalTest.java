package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.*;


public class PicoDeMetalTest {

	@Test
	public void PicoDeMetalIniciaConDurabilidad400() {
		Pico pico = new PicoDeMetal();
		Assert.assertEquals(400f, pico.getDurabilidad());
	}
	
	@Test
	public void PicoDeMetalIniciaConFuerza12() {
		Pico pico = new PicoDeMetal();
		Assert.assertEquals(12, pico.getFuerza());
	}
	
	/*
	@Test
	public void PicoDeMetalSeUsaContraPiedraEsTrue() {
		Pico pico = new PicoDeMetal();
		Material piedra = new Piedra();
		
		Assert.assertTrue(pico.validar(piedra));
	}
	*/
	
	@Test
	public void PiecoDeMetalSeUsaContraPiedraYNoSeReduceSuDurabilidad() {
		Pico picoDeMetal = new PicoDeMetal();
		Material piedra = new Piedra();
		float durabilidadInicial = picoDeMetal.getDurabilidad();
		picoDeMetal.usar(piedra);
		Assert.assertEquals(durabilidadInicial, picoDeMetal.getDurabilidad());
	}
	

	@Test
	public void PiecoDeMetalSeUsaContraMetalYNoSeReduceSuDurabilidad() {
		Pico picoDeMetal = new PicoDeMetal();
		Material metal = new Metal();
		float durabilidadInicial = picoDeMetal.getDurabilidad();
		picoDeMetal.usar(metal);
		Assert.assertEquals(durabilidadInicial, picoDeMetal.getDurabilidad());
	}
	

	@Test
	public void PiecoDeMetalSeUsaContraMaderaYNoSeReduceSuDurabilidad() {
		Pico picoDeMetal = new PicoDeMetal();
		Material madera = new Madera();
		float durabilidadInicial = picoDeMetal.getDurabilidad();
		picoDeMetal.usar(madera);
		Assert.assertEquals(durabilidadInicial, picoDeMetal.getDurabilidad());
	}
	

	@Test
	public void PiecoDeMetalSeUsaContraDiamanteYNoSeReduceSuDurabilidad() {
		Pico picoDeMetal = new PicoDeMetal();
		Material diamante = new Diamante();
		float durabilidadInicial = picoDeMetal.getDurabilidad();
		picoDeMetal.usar(diamante);
		Assert.assertEquals(durabilidadInicial, picoDeMetal.getDurabilidad());
	}

}