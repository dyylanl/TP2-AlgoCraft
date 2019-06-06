package modelo.materiales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.Hacha;
import modelo.herramientas.HachaDeMadera;

public class MetalTest {
	
	@Test
	public void MetalIniciaConDurabilidad50() {
		Material metal = new Metal();
		
		Assert.assertEquals(50, metal.getDurabilidad());
	
	}
	
	@Test
	public void HachaDeMaderaGolpeaMetalYNoSeReduceSuDurabilidad() {
		Material metal = new Metal();
		Hacha hachaDeMadera = new HachaDeMadera();
		int durabilidadInicial = metal.getDurabilidad();
		hachaDeMadera.usar(metal);
		Assert.assertEquals(durabilidadInicial,metal.getDurabilidad());
	}
}