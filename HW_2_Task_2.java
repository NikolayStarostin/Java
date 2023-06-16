import java.util.Scanner;

/**
 *
 * @param подается последовательность N целых чисел.
 * @return boolean - является ли последовательность возрастающей.
 * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */

public class HW_2_Task_2 {
    public static void main(String[] args) {
        System.out.println(isSequanceIncreasing());
    }

    public static boolean isSequanceIncreasing() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int two = sc.nextInt();
            if (two < one) {
                sc.close();
                return false;
            }
            one = two;
        }
        sc.close();
        return true;
    }
}