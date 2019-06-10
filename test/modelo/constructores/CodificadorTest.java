package modelo.constructores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import modelo.constructores.*;
import modelo.materiales.*;

public class CodificadorTest{
	
	@Test
	public void codificadorDevuelveElCodigoDeUnHachaDeMadera() {
		Codificador codificador = new Codificador();
		Material[] listaDeMateriales = new Material[9];
		listaDeMateriales[0] = new Madera();
		listaDeMateriales[1] = new Madera();
		listaDeMateriales[2] = new SinMaterial();
		listaDeMateriales[3] = new Madera();
		listaDeMateriales[4] = new Madera();
		listaDeMateriales[5] = new SinMaterial();
		listaDeMateriales[6] = new SinMaterial();
		listaDeMateriales[7] = new Madera();
		listaDeMateriales[8] = new SinMaterial();
		
		String codigo = codificador.getCodigo(listaDeMateriales, 9);
		Assert.assertEquals(codigo,"110110010");
	}
	
	@Test
	public void codificadorDevuelveElCodigoDeUnHachaDePiedra() {
		Codificador codificador = new Codificador();
		Material[] listaDeMateriales = new Material[9];
		listaDeMateriales[0] = new Piedra();
		listaDeMateriales[1] = new Piedra();
		listaDeMateriales[2] = new SinMaterial();
		listaDeMateriales[3] = new Piedra();
		listaDeMateriales[4] = new Madera();
		listaDeMateriales[5] = new SinMaterial();
		listaDeMateriales[6] = new SinMaterial();
		listaDeMateriales[7] = new Madera();
		listaDeMateriales[8] = new SinMaterial();
		
		String codigo = codificador.getCodigo(listaDeMateriales, 9);
		Assert.assertEquals(codigo,"220210010");
	}
	
	@Test
	public void codificadorDevuelveElCodigoDeUnHachaDeMetal() {
		Codificador codificador = new Codificador();
		Material[] listaDeMateriales = new Material[9];
		listaDeMateriales[0] = new Metal();
		listaDeMateriales[1] = new Metal();
		listaDeMateriales[2] = new SinMaterial();
		listaDeMateriales[3] = new Metal();
		listaDeMateriales[4] = new Madera();
		listaDeMateriales[5] = new SinMaterial();
		listaDeMateriales[6] = new SinMaterial();
		listaDeMateriales[7] = new Madera();
		listaDeMateriales[8] = new SinMaterial();
		
		String codigo = codificador.getCodigo(listaDeMateriales, 9);
		Assert.assertEquals(codigo,"330310010");
	}
	
	@Test
	public void codificadorDevuelveElCodigoDeUnPicoDeMadera() {
		Codificador codificador = new Codificador();
		Material[] listaDeMateriales = new Material[9];
		listaDeMateriales[0] = new Madera();
		listaDeMateriales[1] = new Madera();
		listaDeMateriales[2] = new Madera();
		listaDeMateriales[3] = new SinMaterial();
		listaDeMateriales[4] = new Madera();
		listaDeMateriales[5] = new SinMaterial();
		listaDeMateriales[6] = new SinMaterial();
		listaDeMateriales[7] = new Madera();
		listaDeMateriales[8] = new SinMaterial();
		
		String codigo = codificador.getCodigo(listaDeMateriales, 9);
		Assert.assertEquals(codigo,"111010010");
	}
	
	@Test
	public void codificadorDevuelveElCodigoDeUnPicoDePiedra() {
		Codificador codificador = new Codificador();
		Material[] listaDeMateriales = new Material[9];
		listaDeMateriales[0] = new Piedra();
		listaDeMateriales[1] = new Piedra();
		listaDeMateriales[2] = new Piedra();
		listaDeMateriales[3] = new SinMaterial();
		listaDeMateriales[4] = new Madera();
		listaDeMateriales[5] = new SinMaterial();
		listaDeMateriales[6] = new SinMaterial();
		listaDeMateriales[7] = new Madera();
		listaDeMateriales[8] = new SinMaterial();
		
		String codigo = codificador.getCodigo(listaDeMateriales, 9);
		Assert.assertEquals(codigo,"222010010");
	}
	
	@Test
	public void codificadorDevuelveElCodigoDeUnPicoDeMetal() {
		Codificador codificador = new Codificador();
		Material[] listaDeMateriales = new Material[9];
		listaDeMateriales[0] = new Metal();
		listaDeMateriales[1] = new Metal();
		listaDeMateriales[2] = new Metal();
		listaDeMateriales[3] = new SinMaterial();
		listaDeMateriales[4] = new Madera();
		listaDeMateriales[5] = new SinMaterial();
		listaDeMateriales[6] = new SinMaterial();
		listaDeMateriales[7] = new Madera();
		listaDeMateriales[8] = new SinMaterial();
		
		String codigo = codificador.getCodigo(listaDeMateriales, 9);
		Assert.assertEquals(codigo,"333010010");
	}
	
	@Test
	public void codificadorDevuelveElCodigoDeUnPicoFino() {
		Codificador codificador = new Codificador();
		Material[] listaDeMateriales = new Material[9];
		listaDeMateriales[0] = new Metal();
		listaDeMateriales[1] = new Metal();
		listaDeMateriales[2] = new Metal();
		listaDeMateriales[3] = new Piedra();
		listaDeMateriales[4] = new Madera();
		listaDeMateriales[5] = new SinMaterial();
		listaDeMateriales[6] = new SinMaterial();
		listaDeMateriales[7] = new Madera();
		listaDeMateriales[8] = new SinMaterial();
		
		String codigo = codificador.getCodigo(listaDeMateriales, 9);
		Assert.assertEquals(codigo,"333210010");
	}
}