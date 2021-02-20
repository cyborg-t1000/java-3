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

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());

        System.out.println(box1.compare(box2));

        box1.move(box2);
        System.out.println(box1);
        System.out.println(box2);

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
