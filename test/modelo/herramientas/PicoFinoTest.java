package modelo.herramientas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Material.*;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public class PicoFinoTest {

	@Test
	public void PicoFinoIniciaConDurabilidad1000() {
		Pico pico = new PicoFino();
		Assert.assertEquals(1000f, pico.getDurabilidad());
	}

	@Test
	public void PicoFinoIniciaConFuerza20() {
		Pico pico = new PicoFino();
		Assert.assertEquals(20, pico.getFuerza());
	}
	
	@Test
	public void PicoFinoSeUsaContraDiamanteYPierde100DeDurabilidad() {
		Pico picoFino = new PicoFino();
		Material diamante = new Diamante();
		float durabilidadInicial = picoFino.getDurabilidad();
	
		picoFino.usar(diamante);
		
		Assert.assertEquals(durabilidadInicial -100, picoFino.getDurabilidad());
	}
	
	@Test
	public void PicoFinoSeUsaContraMaderaYnoPierdeDurabilidad() {
		Pico picoFino = new PicoFino();
		Material madera = new Madera();
		float durabilidadInicial = picoFino.getDurabilidad();
	
		picoFino.usar(madera);
		
		Assert.assertEquals(durabilidadInicial, picoFino.getDurabilidad());
	}
	
	@Test
	public void PicoFinoSeUsaContraPiedraYNoPierdeDurabilidad() {
		Pico picoFino = new PicoFino();
		Material piedra = new Piedra();
		float durabilidadInicial = picoFino.getDurabilidad();
	
		picoFino.usar(piedra);
		
		Assert.assertEquals(durabilidadInicial, picoFino.getDurabilidad());
	}
	
	@Test
	public void PicoFinoSeUsaContraMEtalYNoPierdeDurabilidad() {
		Pico picoFino = new PicoFino();
		Material metal = new Metal();
		float durabilidadInicial = picoFino.getDurabilidad();
	
		picoFino.usar(metal);
		
		Assert.assertEquals(durabilidadInicial, picoFino.getDurabilidad());
	}
	
}