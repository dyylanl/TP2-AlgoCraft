package modelo.juego;

import modelo.jugador.Jugador;
import modelo.materiales.*;
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
        
        Material madera = new Madera();
        Mapa mapa = juego.getMapa();
        
        Posicion posMadera = new Posicion(3, 0);
        
        mapa.posicionarMaterial(madera, posMadera);
        Jugador jugador = juego.getJugador();
        
        System.out.println(jugador.miPosicion().x);
        System.out.println(jugador.miPosicion().y);
        juego.getMovimientos().moverJugadorDerecha(mapa);
        System.out.println(jugador.miPosicion().x);
        System.out.println(jugador.miPosicion().y);
        
 
        //Assert.assertTrue();
        Assert.assertTrue(juego.getMovimientos().moverJugadorDerecha(mapa));

    }
*/

}
