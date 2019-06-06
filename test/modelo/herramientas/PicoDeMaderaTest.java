package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.*;

public class PicoDeMaderaTest {

	@Test
	public void PicoDeMaderaIniciaConDurabilidad100() {
		Pico pico = new PicoDeMadera();
		Assert.assertEquals(100, pico.getDurabilidad());
	}

	@Test
	public void PicoDeMaderaIniciaConFuerza2() {
		Pico pico = new PicoDeMadera();
		Assert.assertEquals(2, pico.getFuerza());
	}
	
	@Test
	public void PicoDeMaderaGolpeaMetalEsFalse() {
		Pico pico = new PicoDeMadera();
		Material metal = new Metal();
		
		Assert.assertFalse(pico.validar(metal));
	}
	
	@Test
	public void PicoDeMaderaGolpeaPiedraEsTrue() {
		Pico pico = new PicoDeMadera();
		Material piedra = new Piedra();
		
		Assert.assertTrue(pico.validar(piedra));
	}
	

}