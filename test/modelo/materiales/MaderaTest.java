package modelo.materiales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.Hacha;
import modelo.herramientas.HachaDeMadera;

public class MaderaTest {
	
	@Test
	public void MaderaIniciaConDurabilidad10() {
		Material madera = new Madera();
		
		Assert.assertEquals(10, madera.getDurabilidad());
		
	}
	
	@Test
	public void hachaDeMaderaGolpeaMaderaYMaderaReduceSuDurabilidadEn2() {
		Hacha hachaDeMadera = new HachaDeMadera();
		Material madera = new Madera();	
		
		int durabilidadIni = madera.getDurabilidad();
		
		hachaDeMadera.usar(madera);	
		
		Assert.assertEquals(durabilidadIni-2 , madera.getDurabilidad());
	}
	
}