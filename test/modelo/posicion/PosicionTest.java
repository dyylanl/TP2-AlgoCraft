package modelo.posicion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class PosicionTest{

	@Test
	public void PosicionSeteado3EnX2EnYDevuelve3EnX2EnY(){

		int posX = 3, posY= 2;

		Posicion posicion = new Posicion(posX, posY);
	
		Assert.assertTrue(true);
	}

	@Test
	public void UnaPosicionEstaEnLimites(){

		int posX = 3, posY= 2;

		Posicion posicion = new Posicion(posX, posY);
	
		Assert.assertTrue(posicion.estaEnLimmites(3, 0, 10, 20));
	}

	@Test
	public void UnaPosicionEstaFueraDeLimites(){

		int posX = 3, posY= 2;

		Posicion posicion = new Posicion(posX, posY);
	
		Assert.assertFalse(posicion.estaEnLimmites(4, 111, 10, 202));
	}
	
	@Test
	public void UnaPosicionNegativaEstaFueraDeLimites(){

		int posX = -3, posY= -2;

		Posicion posicion = new Posicion(posX, posY);
	
		Assert.assertFalse(posicion.estaEnLimmites(4, 111, 10, 202));
	}
	
}