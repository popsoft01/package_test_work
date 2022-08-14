package algorithmTask;

import java.util.Arrays;

public class IntergerArgurment {
    public static int[] sum(int[] a, int b) {
        int[] c = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    c[0] = i;
                    c[1] = j;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 3, 5};
        System.out.println(Arrays.toString(sum(array, 8)));
    }
}
