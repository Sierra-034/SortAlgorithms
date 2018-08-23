public abstract class Algorithm {

    protected int[] data;

    public Algorithm(int[] data) {
        this.data = data;
    }

    public abstract void sort();

    public void print() {
        for(int number : data) 
            System.out.printf("%d, ", number);

        System.out.println();
    }
}