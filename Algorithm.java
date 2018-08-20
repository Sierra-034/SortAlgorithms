public abstract class Algorithm {

    private int[] data;

    public Algorithm(int[] data) {
        this.data = data;
    }

    public abstract void sort();
}