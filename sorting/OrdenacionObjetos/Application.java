import java.util.Random;
import java.util.Vector;

public class Application {

	public static Vector<Racional> v = new Vector<Racional>(10);

	public static void main(String[] args) throws Exception {
		fillVector();
		System.out.println(v.toString());
		bubbleSort();
		System.out.println();
		System.out.println();
		System.out.println(v.toString());
	}

	public static void fillVector() throws Exception {
		Random ran = new Random();
		for(int i = 0; i < 10; i++) {
			Racional racional = new Racional(
				ran.nextInt(100), ran.nextInt(100) + 1);
			v.addElement(racional);
		}
	}

	public static void bubbleSort() {
		int n = v.size();
		for(int i = n - 1; i > 0; i--)
			for(int j = 0; j < i; j++) 
				if(v.elementAt(j).compare(v.elementAt(j + 1)) >= 0) {
					Racional temp = v.set(j, v.elementAt(j + 1));
					v.set(j + 1, temp);
				}
	}

}