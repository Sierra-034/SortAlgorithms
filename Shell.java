public class Shell extends Algorithm {

    public Shell(int[] data) { super(data); }

    public void sort() {
        System.out.println("Shell sort");

        //Selecting a gap
        int gap = 1;
        while(gap < data.length) 
            gap = 3 * gap + 1;

        while(gap >= 1) {
            for(int i = gap; i < data.length; i++) {
                int j = i;
                while(j >= gap && data[j - gap] > data[j]) {
                    int temp = data[j - gap];
                    data[j - gap] = data[j];
                    data[j] = temp;                    
                    j -= gap;
                }
            }

            //Reduce gap
            gap = (gap - 1) / 3;
        }
    }
    
}