package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public class PicoFinoTest {

	@Test
	public void PicoFinoIniciaConDurabilidad1000() {
		Pico pico = new PicoFino();
		Assert.assertEquals(1000, pico.getDurabilidad());
	}

	@Test
	public void PicoFinoIniciaConFuerza20() {
		Pico pico = new PicoFino();
		Assert.assertEquals(20, pico.getFuerza());
	}

}