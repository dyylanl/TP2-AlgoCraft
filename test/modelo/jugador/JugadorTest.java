package modelo.jugador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.herramientas.Hacha;
import modelo.herramientas.HachaDeMadera;


public class JugadorTest {
	
	@Test
	public void jugadorIniciaConHachaDeMadera() {
		Jugador jugador = new Jugador();
		 
		Assert.assertTrue(jugador.getHerramientaEquipada() instanceof HachaDeMadera);
	}
}
