package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public class PicoDePiedraTest {

	@Test
	public void PicoDePiedraIniciaConDurabilidad200() {
		Pico pico = new PicoDePiedra();
		Assert.assertEquals(200, pico.getDurabilidad());
	}

	@Test
	public void PicoDePiedraIniciaConFuerza4() {
		Pico pico = new PicoDePiedra();
		Assert.assertEquals(4, pico.getFuerza());
	}

}