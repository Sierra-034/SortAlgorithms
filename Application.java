public class Application {

    public static void main(String[] args) {
        int[] data = Filler.getArray(100000000);
        Algorithm a = new QuickSort(data);
        long init = System.currentTimeMillis();
        a.sort();
        long last = System.currentTimeMillis();
        System.out.println();
        System.out.printf("Time:> %d\n", last - init);
    }
    
}