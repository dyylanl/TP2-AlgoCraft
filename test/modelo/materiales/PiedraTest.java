package modelo.materiales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.Hacha;
import modelo.herramientas.HachaDeMadera;
import modelo.herramientas.HachaDePiedra;

public class PiedraTest {
	
	@Test
	public void PiedraEsGolpeadaPorPicoDePiedra() {
		Hacha hachaDePiedra = new HachaDePiedra();
		Material piedra = new Piedra();
		piedra.resibeGolpeDe(hachaDePiedra);
		Assert.assertEquals(25,piedra.getDurabilidad());
	}
	/*
	@Test
	public void PiedraEsGolpeadaPorPicoDeMadera() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material piedra = new Piedra();
		piedra.resibeGolpeDe(hachaDeMadera);
		Assert.assertEquals(30,piedra.getDurabilidad());
		}
		*/
}