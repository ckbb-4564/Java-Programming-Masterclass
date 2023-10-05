public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }
        int rev = 0;
        int tempNum = num;
        int lastNum = 0;

        if (tempNum < 0) {
            tempNum *= -1;
        }

        while (tempNum > 0) {
            lastNum = tempNum % 10;
            rev += lastNum;

            tempNum /= 10;
            rev *= 10;
        }
        rev /= 10;
        int firstNum = rev % 10;
        int firstDigit = num < 0 ? firstNum * -1 : firstNum;
        int lastDigit = num % 10;
        return firstDigit + lastDigit;
    }
}