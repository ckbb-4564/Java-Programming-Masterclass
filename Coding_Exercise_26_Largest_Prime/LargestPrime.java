public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 2;

        for (int factor = 2; factor <= number / 2; factor++) {
            while (number % factor == 0) {
                number /= factor;
                largestPrime = factor;
            }
        }

        return (number > 1) ? number : largestPrime;
    }
}
