import java.util.Random;
import java.util.Scanner;

public class Application {

	public static int[] data;

	public static void main(String[] sierra034) {
		data = new int[20];
		fillArray();
		QuickSort sort = new QuickSort(data);
		BinarySearch search = new BinarySearch(data);
		print();
		sort.sort();
		print();

		Scanner in = new Scanner(System.in);
		System.out.print("find: ");
		int number = in.nextInt();
		System.out.printf("%d is at: %d\n", number, search.find(number));
	}

	public static void fillArray() {
		Random ran = new Random(1);
		for(int i = 0; i < data.length; i++) 
			data[i] = ran.nextInt(100) + 1;
	}

	public static void print() {
		for(int n : data)
			System.out.printf("%d, ", n);

		System.out.println();
	}
}