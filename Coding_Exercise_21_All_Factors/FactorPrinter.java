public class FactorPrinter {
    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
            return;
        }

        StringBuilder outputFactors = new StringBuilder();
        for (int factor = 1; factor <= num; factor++) {
            if (num % factor == 0) {
                outputFactors.append(factor).append(" ");
            }
        }

        System.out.println(outputFactors.toString().trim());
    }
}
