public class Shell extends Algorithm {

    private int gap = 1;

    public Shell(int[] data) { super(data); }

    public void sort() {
        System.out.println("Shell sort");

        selectGap();
        
        while(gap >= 1) {
            for(int i = gap; i < data.length; i++) {
                int j = i;
                while(j >= gap && data[j - gap] > data[j]) {
                    swap(j - gap, j);                    
                    j -= gap;
                }
            }

            reduceGap();
        }
    }

    private void selectGap() {
        while(gap < data.length) 
            gap = 3 * gap + 1;
    }

    private void reduceGap() {
        gap = (gap - 1) / 3;
    }
    
}