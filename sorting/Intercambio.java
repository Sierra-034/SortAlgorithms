public class Intercambio extends Algorithm {

    public Intercambio(int[] data) { super(data); }

    public void sort() {
        System.out.println("Intercambio");

        for(int i = 0; i < data.length - 1; i++)
            for(int j = i + 1; j < data.length; j++)
                if(data[j] < data[i]) 
                    swap(i, j);
    }
    
}