import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @param подается последовательность N целых чисел.
 * @return sum - сумма простых чисел
 * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
 */

public class HW_2_Task_1 {
    public static void main(String[] args) {
        System.out.println(sumPrimeNumbers());
    }

    public static int sumPrimeNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        Integer integer;
        BigInteger bigInteger;
        for (int i = 0; i < n; i++) {
            integer = sc.nextInt();
            bigInteger = BigInteger.valueOf(integer);
            if (bigInteger.isProbablePrime((int) Math.log(integer))) {
                sum += integer;
            }
        }
        sc.close();
        return sum;
    }
}
