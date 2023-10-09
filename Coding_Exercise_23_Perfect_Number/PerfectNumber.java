public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sumFactor = 0;
        for (int counter = 1; counter < number; counter++) {
            if (number % counter == 0) {
                sumFactor += counter;
            }
        }

        return sumFactor == number;
    }
}
