/* Lista aleatoria */

import java.util.Random;

public class ListaAleatoria {
	public static void main(String[] sierra034) {
		Random ran = new Random();
		Lista lista = new Lista();
		int k = ran.nextInt(40);

		while(k >= 0) {
			int dato = ran.nextInt(100) + 1;
			lista.insertarCabezaLista(dato);
			k--;
		}

		//Recorre la lista para escribir sus elementos
		System.out.println("Elementos de la lista generados al azar");
		lista.visualizar();
	}
}