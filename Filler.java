import java.util.Random;

public class Filler {

    private static final int SEED = 1;
    private static final int LIMIT = 1000000;

    public static int[] getArray(int n) {
        Random r = new Random();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(LIMIT);

        return array;
    }

}