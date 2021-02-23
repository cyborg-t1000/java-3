package hw6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println(Arrays.toString(Hw6.task1(arr1)));
//        int[] arr2 = new int[]{ 1, 2, 2, 3, 1, 1, 7 };
//        System.out.println(Arrays.toString(Hw6.task1(arr2)));

        System.out.println(Hw6.task2(arr1));

        int[] arr3 = new int[]{1, 1, 1, 4, 4, 1, 4, 4};
        System.out.println(Hw6.task2(arr3));
        int[] arr4 = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println(Hw6.task2(arr4));
        int[] arr5 = new int[]{4, 4, 4, 4};
        System.out.println(Hw6.task2(arr5));
        int[] arr6 = new int[]{1, 4, 4, 1, 1, 4, 3};
        System.out.println(Hw6.task2(arr6));
    }
}
