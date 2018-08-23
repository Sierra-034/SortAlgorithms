public class Selection extends Algorithm {

    public Selection(int[] data) { super(data); }

    public void sort() {
        System.out.println("Selection sort");

        for(int i = 0; i < data.length - 1; i++) {
            int indexMin = i;
            for(int j = i; j < data.length; j++)
                if(data[j] < data[indexMin])
                    indexMin = j;

            int temp = data[i];
            data[i] = data[indexMin];
            data[indexMin] = temp;
        }            
    } 

}