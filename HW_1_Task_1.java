/**
* https://leetcode.com/problems/reverse-words-in-a-string/
*/

import java.util.Scanner;

public class HW_1_Task_1 {
    public static void Main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String s = in.nextLine();
        String rev = reverseWords(s);
        System.out.println(rev);
    }

    /**
     *
     * @param s подается фраза в виде строки.
     * @return Возвращает строку слов в обратном порядке, объединенных одним
     *         пробелом.
     * @apiNote Изменяет порядок слов на противоположный.
     */

    public String reverseWords(String s) {
        int i = 0, j = i;
        String ans = "";
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ')
                i++;
            if (i >= s.length())
                break;
            j = i + 1;
            while (j < s.length() && s.charAt(j) != ' ')
                j++;
            String temp = s.substring(i, j);
            if (ans.length() == 0)
                ans = temp;
            else
                ans = temp + " " + ans;
            i = j + 1;
        }
        return ans;
    }
}