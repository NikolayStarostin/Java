package Homework_3.Task_4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @param ArrayList - целочисленный список.
 * @return минимальное, максимальное и среднее списка.
 * @apiNote Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

public class HW_3_Task_4 {
    public static void main(String[] args) {
        final int n = 10; // кол-во элементов в первоначальном списке
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rnd.nextInt(0, 35));
        }
        System.out.println(arr);
        MinMaxVal(arr);
        MeanVal(arr);
    }

    public static void MinMaxVal(ArrayList<Integer> arr) {
        Integer minArr = arr.get(0);
        Integer maxArr = arr.get(0);
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) < minArr) {
                minArr = arr.get(i);
            }
            if (arr.get(i) > maxArr) {
                maxArr = arr.get(i);
            }
        }
        System.out.println("Минимальное значение - " + minArr);
        System.out.println("Максимальное значение - " + maxArr);
    }

    public static void MeanVal(ArrayList<Integer> arr) {
        Integer sumElem = 0;
        Double arithmean = 0.0;
        Double count = 0.0;
        for (int i = 0; i < arr.size(); i++) {
            sumElem = sumElem + arr.get(i);
            count++;
        }
        arithmean = sumElem / count;
        System.out.println("Среднеарифметическое значение - " + arithmean);
    }
}