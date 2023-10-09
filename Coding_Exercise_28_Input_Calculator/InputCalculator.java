import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                break;
            }
        }

        scanner.close();

        if (count > 0) {
            long average = Math.round((double) sum / count);
            System.out.println("SUM = " + sum + " AVG = " + average);
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }
}
