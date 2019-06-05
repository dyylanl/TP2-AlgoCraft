package modelo.materiales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class DiamanteTest {
	
	@Test
	public void MetalIniciaConDurabilidad50() {
		Material diamante = new Diamante();
		
		Assert.assertEquals(100, diamante.getDurabilidad());
		
	}
}