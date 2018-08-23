public class Insertion extends Algorithm {

    public Insertion(int[] data) { super(data); }

    public void sort() {
        System.out.println("Insertion sort");

        for(int i = 1; i < data.length; i++)
            for(int j = i; j > 0; j--) {
                if(data[j - 1] < data[j])
                    break;
                
                int temp = data[j - 1];
                data[j - 1] = data[j];
                data[j] = temp;
            }
    }
        
}