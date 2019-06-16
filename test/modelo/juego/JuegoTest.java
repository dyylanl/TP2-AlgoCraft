package modelo.juego;


import modelo.mapas.Mapa;
import modelo.posicion.Posicion;
import org.junit.Assert;
import org.junit.Test;


public class JuegoTest {


    @Test
    public void juegoIniciaMapaCorrectamente(){

        Juego juego = new Juego();
        juego.iniciar();
        Mapa mapa = juego.getMapa();
        Posicion posicionJugador = new Posicion(0,0);
        Assert.assertFalse(mapa.obtenerObjeto(posicionJugador) == null);

    }


}
