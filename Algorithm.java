public abstract class Algorithm {

    protected int[] data;

    public Algorithm(int[] data) {
        this.data = data;
    }

    public abstract void sort();

    protected void swap(int a, int b) {
        int temp = data[a];
        data[a] = data[b]; 
        data[b] = temp;
    }

    public void print() {
        for(int number : data) 
            System.out.printf("%d, ", number);

        System.out.println();
    }
}