package git_test3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] createArray(int size, int min, int max) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(max - min + 1) + min;
        }
        return a;
    }
    
    public static void main(String[] args) {
        int[] a = createArray(10, 1, 10);
        Sort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}