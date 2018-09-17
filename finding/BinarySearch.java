public class BinarySearch {

	private int[] data;

	public BinarySearch(int[] arr) { data = arr; }

	public int find(int n) {
		return binarySearchRecursive(0, n, data.length - 1);
	}

	private int binarySearchIterative(int n) {
		int left = 0, right = data.length - 1;

		while(left <= right) {
			int central = (left + right) / 2;
			if(n == data[central])
				return central;

			if(n < data[central])
				right = central - 1;
			else if(n > data[central])
				left = central + 1;
		}

		return -1;
	}

	private int binarySearchRecursive(int left, int n, int right) {
		System.out.printf("left:> %d, central:> %d, right:> %d\n", left, (left + right) / 2, right);
		if(left > right) return -1;

		int central = (left + right) / 2;
		if(n < data[central])
			central = binarySearchRecursive(left, n, central - 1);
		if(n > data[central])
			central = binarySearchRecursive(central + 1, n, right);

		return central;
	}

}