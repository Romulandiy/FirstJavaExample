package tasks;

import java.util.*;

/**
 * Created by Roman on 19.01.2017.
 * <p>
 * 4) Дан массив чисел, отсортировать их в порядке возрастания, без использования коллекций
 * <p>
 * int array[] = {-1, -3, 33, 413, -5, -6, 3, 4, 5};
 */
public class ArrayNumberTask4 {

    public static void main(String[] args) {
        int array[] = {-1, -3, 33, 413, -5, -6, 3, 4, 5};
        int t;

        sortArr(array);

        String intArrayString = Arrays.toString(array);
        System.out.println("Длина массива: " + array.length);
        System.out.println("Массив по возрастанию : " + intArrayString);

    }

    private static void sortArr(int[] array) {
        int t;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
