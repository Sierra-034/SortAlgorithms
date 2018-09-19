/*Declara una lista de nodos*/
public class Lista {

	protected Nodo primero;

	public Lista() {
		primero = null;
	}

	public Lista insertarCabezaLista(int entrada) {
		Nodo nuevo = new Nodo(entrada);
		nuevo.setEnlace(primero);
		primero = nuevo;
		return this;
	}

	public void visualizar() {
		Nodo nodo = primero;
		int k = 0;

		while(nodo != null) {
			System.out.println(nodo.getDato() + " ");
			nodo = nodo.getEnlace();
			k++;
			System.out.print((k % 15 != 0 ? " " : "\n"));
		}
	}
}