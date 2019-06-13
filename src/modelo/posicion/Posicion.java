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
		return (this.x == otraPos.x && this.y == otraPos.y);
		
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
	    int result = 1;
	    result = prime * result + x;
        result = prime * result + y;
        return result;	
	}

	public Posicion getPosicionArriba() {
		return new Posicion(this.x, this.y + 1);
	}

	public Posicion getPosicionAbajo() {
		return new Posicion(this.x, this.y -1);
	}

	public Posicion getPosicionDerecha() {
		return new Posicion(this.x + 1, this.y);
	}

	public Posicion getPosicionIzquierda() {
		return new Posicion(this.x - 1, this.y + 1);
	}

	public boolean estaEnLimmites(int limiteInfX, int limiteInfY ,int limiteSupX ,int limiteSupY) {
		
		boolean ok1 = (this.x >= limiteInfX && this.x <= limiteSupX);
		boolean ok2 = (this.y >= limiteInfY && this.y <= limiteSupY);
		
		return (ok1 && ok2);
	}
	
}