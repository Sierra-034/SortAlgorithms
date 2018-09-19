/* La clase nodo con las dos partes de un nodo y su constructor */
public class Nodo {

	private int dato;
	private Nodo enlace;

	public Nodo(int entero) {
		dato = entero;
		enlace = null;
	}

	public Nodo(int entero, Nodo nodo) {
		dato = entero;
		enlace = nodo;
	}

	public int getDato() {
		return dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
}