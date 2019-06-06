package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.*;


public class PicoDeMetalTest {

	@Test
	public void PicoDeMetalIniciaConDurabilidad400() {
		Pico pico = new PicoDeMetal();
		Assert.assertEquals(400, pico.getDurabilidad());
	}

	@Test
	public void PicoDeMetalIniciaConFuerza12() {
		Pico pico = new PicoDeMetal();
		Assert.assertEquals(12, pico.getFuerza());
	}
	
	@Test
	public void PicoDeMetalSeUsaContraPiedraEsTrue() {
		Pico pico = new PicoDeMetal();
		Material piedra = new Piedra();
		
		Assert.assertTrue(pico.validar(piedra));
	}
	
	

}