public class Selection extends Algorithm {

    public Selection(int[] data) { super(data); }

    public void sort() {
        System.out.println("Selection sort");

        for(int i = 0; i < data.length - 1; i++) {
            int indexMin = selectMinFrom(i);
            swap(i, indexMin);
        }            
    } 

    private int selectMinFrom(int index) {
        int indexMin = index;
        for(int j = index + 1; j < data.length; j++)
            if(data[j] < data[indexMin])
                indexMin = j;

        return indexMin;
    }

}