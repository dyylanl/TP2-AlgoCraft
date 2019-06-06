package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.*;

public class PicoDePiedraTest {

	@Test
	public void PicoDePiedraIniciaConDurabilidad200() {
		Pico pico = new PicoDePiedra();
		Assert.assertEquals(200f, pico.getDurabilidad());
	}

	@Test
	public void PicoDePiedraIniciaConFuerza4() {
		Pico pico = new PicoDePiedra();
		Assert.assertEquals(4, pico.getFuerza());
	}

	@Test
	public void PicoDePiedraGolpeaMaderaEsFalse() {
		Pico pico = new PicoDePiedra();
		Material madera = new Madera();
		
		Assert.assertFalse(pico.validar(madera));
	}
	
	@Test
	public void PicoDePiedraGolpeaPiedraEsTrue() {
		Pico pico = new PicoDePiedra();
		Material piedra = new Piedra();
		
		Assert.assertTrue(pico.validar(piedra));
	}

	@Test
	public void PicoDePiedraGolpeaMetalEsTrue() {
		Pico pico = new PicoDePiedra();
		Material Metal = new Metal();
		
		Assert.assertTrue(pico.validar(Metal));
	}

	
}