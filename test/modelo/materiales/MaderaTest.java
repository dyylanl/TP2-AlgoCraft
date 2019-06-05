package modelo.materiales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class MaderaTest {
	
	@Test
	public void MaderaIniciaConDurabilidad10() {
		Material madera = new Madera();
		
		Assert.assertEquals(10, madera.getDurabilidad());
		
	}
}