public class Application {

    public static void main(String[] args) {
        int[] data = Filler.getArray(40);
        Algorithm a = new Shell(data);
        a.print();
        long init = System.currentTimeMillis();
        a.sort();
        long last = System.currentTimeMillis();
        System.out.println();
        System.out.printf("Time:> %d\n", last - init);
        a.print();
    }
    
}