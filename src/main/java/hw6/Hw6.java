package hw6;

import java.util.Arrays;

public class Hw6 {
    public static int[] task1(int[] arr) {
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) break;
        }
        if (i < 0) {
            throw new RuntimeException("4 not found in array");
        }
        return Arrays.copyOfRange(arr, i + 1, arr.length);
    }
}
