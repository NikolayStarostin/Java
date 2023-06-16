/**
 *
 * @param array - массив целых чисел.
 * @return newArray - новый массив c замененными отрицательными элементами.
 * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

public class HW_2_Task_3 {
    public static void main(String[] args) {
        int[] array = replaceNegativeElements(new int[] { 1, 22, 33, 44, 5, -5, -3, 23, -7 });
        for (var el : array) {
            System.out.print(el + " ");
        }
    }

    public static int[] replaceNegativeElements(int[] array) {
        int[] newArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] < 100) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[i] = sum;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}