package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


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

}