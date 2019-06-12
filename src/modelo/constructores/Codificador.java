package modelo.constructores;

import modelo.materiales.*;

public class Codificador {
	
	protected String codigo;
	
	public Codificador() {
		codigo = "";
	}
	
	public String getCodigo(Material[] mesa, int tamano) {
		for(int i = 0;i < tamano;i++) {
			codigo = codigo + mesa[i].getIdentidad();
		}
		return codigo;
	}
}
