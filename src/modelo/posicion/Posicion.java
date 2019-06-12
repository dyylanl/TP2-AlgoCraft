package modelo.posicion;

public class Posicion{
	protected int x;
	protected int y;
	
	public Posicion(){
	
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int x(){
		return x;
	}

	public int y(){
		return y;
	}
	public Boolean igualPosicionA(Posicion otraPosicion){

		return ((this.x == otraPosicion.x()) && (this.y == otraPosicion.y()));

	}

	public void nuevaPosicion(Posicion nuevaPosicion){
		this.x = nuevaPosicion.x();
		this.y = nuevaPosicion.y();
	}

}