public class QuickSort {

    private int[] data;
    private int pivot;

    public QuickSort(int[] data) { this.data = data; }

    public void sort() {
        System.out.println("QuickSort");
        quickSort(0, data.length - 1);
    }

    private void quickSort(int left, int right) {
        if(left >= right) return;
        pivot = (left + right) / 2;
        makePartition(left, right);
        quickSort(left, pivot - 1);
        quickSort(pivot + 1, right);
    }

    private void makePartition(int left, int right) {
        int i = left, j = right - 1;
        int p = data[pivot];
        swap(pivot, right);

        while(true) {
            while(data[i] < p) i++;
            while(j >= 0 && data[j] >= p) j--;

            if(i >= j)
                break;

            swap(i, j);
            i++; j--;
        }

        swap(i, right);
        pivot = i;
    }

    private void swap(int a, int b) {
        int temp = data[a];
        data[a] = data[b]; 
        data[b] = temp;
    }
    
}