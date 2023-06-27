/**
 *
 * @param string s containing just the characters '(', ')', '{', '}', '[' and ']'
 * @return false or true.
 * @apiNote determine the input string.
 */


public class HW_4_Task_2 {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        char[] charArray = new char[s.length()];
        charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i += 2) {
            if (charArray[i] == '(' && charArray[i + 1] != ')') {
                return false;
            } else if (charArray[i] == '[' && charArray[i + 1] != ']') {
                return false;
            } else if (charArray[i] == '{' && charArray[i + 1] != '}') {
                return false;
            }
        }
        return true;
    }
}