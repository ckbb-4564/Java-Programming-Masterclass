public class EvenDigitSum {
    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }
        int evenSum = 0;
        int currentDigit = 0;
        while (num > 0) {
            currentDigit = num % 10;
            if (currentDigit % 2 == 0) {
                evenSum += currentDigit;
            }
            num /= 10;
        }
        return evenSum;
    }
}