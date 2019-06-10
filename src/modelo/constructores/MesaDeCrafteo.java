package modelo.constructores;

import modelo.materiales.*;
import modelo.herramientas.*;

public class MesaDeCrafteo{
	
	protected Material[] mesa;
	protected Constructor constructor; 
	private static int cantidad = 9;
	
	public MesaDeCrafteo(){
		mesa = new Material[cantidad];
		constructor = new Constructor();
		
		for(int i = 0; i < cantidad;i++) {
			mesa[i] = new SinMaterial();
		}
	}
	
	public void agregarMaterialEnPosicion(Material unMaterial,int unaPosicion) {
		mesa[unaPosicion] = unMaterial;
	}
	
	public Herramienta crearHerramienta() {
		Codificador codificador = new Codificador();
		String codigo = codificador.getCodigo(mesa,cantidad);
		return constructor.getHerramienta(codigo);
	}
	
	
}