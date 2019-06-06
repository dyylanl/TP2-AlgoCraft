package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.*;

public class PicoDeMaderaTest {

	@Test
	public void PicoDeMaderaIniciaConDurabilidad100() {
		Pico pico = new PicoDeMadera();
		Assert.assertEquals(100f , pico.getDurabilidad());
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
	
	@Test
	public void PicoDeMaderaGolpeaMaderaEsFalse() {
		Pico pico = new PicoDeMadera();
		Material madera = new Madera();
		
		Assert.assertFalse(pico.validar(madera));
	}
	
	@Test
	public void PicoDeMaderaGolpeaDiamanteEsFalse() {
		Pico pico = new PicoDeMadera();
		Material diamante = new Diamante();
		
		Assert.assertFalse(pico.validar(diamante));
	}
	
	
	//ESTO SEPARAR EN OTRO PAKCAGE
	
	@Test
	public void PicoDeMaderaGolpeaMaderaYPicoReduceDurabilidadEn2() {
		Pico pico = new PicoDeMadera();
		Material madera = new Madera();
		
		float durabilidadIni = pico.getDurabilidad();
		
		pico.usar(madera);
		
		
		Assert.assertEquals(durabilidadIni-2, pico.getDurabilidad());
	}
	
	@Test
	public void PicoDeMaderaGolpeaMaderaYMaderaNoReduceDurabilidad() {
		Pico pico = new PicoDeMadera();
		Material madera = new Madera();
		
		int durabilidadIni = madera.getDurabilidad();
		
		pico.usar(madera);
		
		Assert.assertEquals(durabilidadIni, madera.getDurabilidad());
	}
	
	
}