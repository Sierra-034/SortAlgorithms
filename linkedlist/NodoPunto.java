/*Declaración de un nodo*/

public class NodoPunto {

	Punto dato;
	NodoPunto enlace;

	public Nodo(Punto p) {
		dato = p;
		enlace = null;
	}

	public Nodo(Punto p, Nodo n) {
		dato = p;
		enlace = n;
	}
}