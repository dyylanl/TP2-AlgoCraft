package modelo.posicion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class PosicionTest{

	@Test
	public void PosicionSeteado3EnXDevuelve3EnX(){

		Posicion posicion = new Posicion();
		int posX = 3;

		posicion.setX(posX);
		Assert.assertEquals(3, posicion.x());
	}

	@Test
	public 	void PosicionSeteado2EnYDevuelve2EnX(){

		Posicion posicion = new Posicion();
		int posY = 2;

		posicion.setY(posY);
		Assert.assertEquals(2, posicion.y());
	}

	@Test
	public 	void ComparoPosicion2enX1enYConOtraPosicionIgualEsTrue() {

		Posicion posicion = new Posicion();
		int posX = 2, posY = 1;
		posicion.setX(posX);
		posicion.setY(posY);

		Posicion otraPosicion = new Posicion();
		otraPosicion.setX(2);
		otraPosicion.setY(1);

		Assert.assertTrue(posicion.igualPosicionA(otraPosicion));
	}


}