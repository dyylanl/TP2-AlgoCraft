package modelo.materiales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class MetalTest {
	
	@Test
	public void MetalIniciaConDurabilidad50() {
		Material metal = new Metal();
		
		Assert.assertEquals(50, metal.getDurabilidad());
		
	}
}