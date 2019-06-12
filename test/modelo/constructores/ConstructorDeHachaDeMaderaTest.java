package modelo.constructores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.*;
import modelo.materiales.*;

public class ConstructorDeHachaDeMaderaTest{
	
	@Test
	public void ConstructorDeHachaDeMaderaCreaUnHachaDeMadera() {
		ConstructorDeHachaDeMadera constructor = new ConstructorDeHachaDeMadera();
		Herramienta hachaDeMadera = constructor.ConstruirHerramienta();
		Assert.assertTrue(hachaDeMadera instanceof HachaDeMadera);
	}
	
	@Test
	public void ConstructorDeHachaDeMaderaDevuelveVerdaderoConLosMaterialesCorrespondientes() {
		ConstructorDeHachaDeMadera constructor = new ConstructorDeHachaDeMadera();
		int cantidadDeMateriales = 9;
		
		Mesa mesa = new Mesa(cantidadDeMateriales);
		mesa.agregarMaterialEnPosicion(new Madera(), 0);
		mesa.agregarMaterialEnPosicion(new Madera(), 1);
		mesa.agregarMaterialEnPosicion(new Madera(), 3);
		mesa.agregarMaterialEnPosicion(new Madera(), 4);
		mesa.agregarMaterialEnPosicion(new Madera(), 7);
		
		Assert.assertTrue(constructor.puedeConstruir(mesa));
	}
}