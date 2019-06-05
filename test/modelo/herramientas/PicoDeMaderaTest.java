package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public class PicoDeMaderaTest {

	@Test
	public void PicoDeMaderaIniciaConDurabilidad100() {
		Pico pico = new PicoDeMadera();
		Assert.assertEquals(100, pico.getDurabilidad());
	}

	@Test
	public void PicoDePiedraIniciaConFuerza2() {
		Pico pico = new PicoDeMadera();
		Assert.assertEquals(2, pico.getFuerza());
	}

}