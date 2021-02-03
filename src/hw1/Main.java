package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"aa", "bb", "cc", "dd", "ee"};
        swap(arr1, 1, 2);
        System.out.println(Arrays.toString(arr1));
        Integer[] arr2 = new Integer[]{1, 2, 3, 4, 5};
        swap(arr2, 1, 2);
        System.out.println(Arrays.toString(arr2));

        Integer[] arr3 = new Integer[]{1,2,3,4,5};
        List<Integer> list3 = arrayToList(arr3);
        System.out.println(list3);

        String[] arr4 = new String[]{"1","2","3","4","5a"};
        List<String> list4 = arrayToList(arr4);
        System.out.println(list4);
    }

    public static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T> ArrayList<T> arrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

}
