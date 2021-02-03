package hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"aa", "bb", "cc", "dd", "ee"};
        swap(arr1, 1, 2);
        System.out.println(Arrays.toString(arr1));
        Integer[] arr2 = new Integer[]{1, 2, 3, 4, 5};
        swap(arr2, 1, 2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
