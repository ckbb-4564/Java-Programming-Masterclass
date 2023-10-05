public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            num *= -1;
        }
        int rev = 0;
        int tempNum = num;
        int lastDigit = 0;
        while (tempNum > 0) {
            lastDigit = tempNum % 10;
            rev += lastDigit;

            tempNum /= 10;
            rev *= 10;
        }
        rev /= 10;
        return rev == num;
    }
}