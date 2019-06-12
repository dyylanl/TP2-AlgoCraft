package modelo.posicion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class PosicionTest{

	@Test
	public void PosicionSeteado3EnX2EnYDevuelve3EnX2EnY(){

		int posX = 3, posY= 2;

		Posicion posicion = new Posicion(posX, posY);
	

		Assert.assertTrue(posicion.x() == 3 && posicion.y()==2);
	}


	
}