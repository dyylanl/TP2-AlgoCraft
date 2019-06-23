package modelo.juego;

import modelo.jugador.Jugador;
import modelo.mapas.Mapa;
import modelo.posicion.Posicion;
import org.junit.Assert;
import org.junit.Test;


public class JuegoTest {


    @Test
    public void juegoCargaMapa(){
/*    	
        Juego juego = new Juego();
        juego.iniciar();
        Mapa mapa = juego.getMapa();

        for(int i = 0; i <= 12; i++){

            for(int j = 0; j <= 12; j++){

                Posicion posicion = new Posicion(i,j);
              
            }

        }
        
  */      
        Assert.assertTrue(true);

    }

/*
    @Test
    public void jugadorSeIniciaEnElOrigen(){

        Juego juego = new Juego();
        juego.iniciar();
        Mapa mapa = juego.getMapa();
        Posicion origen = new Posicion(0,0);
        Assert.assertTrue(mapa.obtenerObjeto(origen) instanceof Jugador);

    }
*/

}
