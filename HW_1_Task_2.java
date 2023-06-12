/**
* 2) Дана последовательность целых чисел, оканчивающаяся нулем. 
* Найти сумму положительных чисел, после которых следует отрицательное число.
* Пример ввода:
* 1 2 1 2 -1 1 3 1 3 -1 0
* Логика расчета:
* 2 -1 переход -> 2 в сумму
* 3 -1 переход -> 3 в сумму
* Пример вывода: 5
*/

import java.util.Scanner;

public class HW_1_Task_2 {
    public static int sumPositiveNumbersFollowedByNegativeNumber() {
        var sc = new Scanner(System.in);
        System.out.print("Введите 1 элемент: ");
        int one = sc.nextInt();
        int count = 0;
        while (one != 0) {
            System.out.print("Введите следующий элемент: ");
            int two = sc.nextInt();
            if (two != 0) {
                if (one > 0 && two < 0) {
                    count += one;
                }
            }
            one = two;
        }
        sc.close();
        return count;
    }    
}
