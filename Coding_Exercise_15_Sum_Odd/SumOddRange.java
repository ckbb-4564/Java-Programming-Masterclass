public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num <= 0) {
            return false;
        }
        if (num % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0) {
            return -1;
        }

        if (start > end) {
            return -1;
        }

        int total = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }
        return total;
    }
}