package modelo.constructores;

import modelo.herramientas.*;

public abstract class ConstructorDeHerramientas{
	
	Mesa mesa;
	
	public abstract Herramienta ConstruirHerramienta();
	
	public boolean puedeConstruir(Mesa otraMesa) {
		return mesa.esEquivalente(otraMesa);
	}
	
}