package modelo.posicion;

public class Posicion{
	protected int x;
	protected int y;
	
	public Posicion(int x, int y){
		this.x = x;
		this.y = y;
		
	}

	@Override
	public boolean equals(Object obj){
		
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Posicion otraPos = (Posicion) obj;
        //return this.igualPosicionA(otraPos);
		return igualPosicionA(otraPos);
		
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
	    int result = 1;
	    result = prime * result + x;
        result = prime * result + y;
        return result;	
	}

	public int x(){
		return x;
	}

	public int y(){
		return y;
	}
	
	public boolean igualPosicionA(Posicion otraPosicion){

		return ((this.x == otraPosicion.x()) && (this.y == otraPosicion.y()));

	}

}