/*Declara una lista de nodos*/

public class Lista {

	private Nodo primero;

	public Lista() {
		primero = null;
	}

	public Lista(int number) {
		primero = new Nodo(number);
	}

	public void addElement(int number) {
		primero = new Nodo(number, primero);
	}
}