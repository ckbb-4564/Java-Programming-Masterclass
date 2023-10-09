public class DiagonalStar {
    public static void printSquareStar(int num) {
        if (num < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= num; row++) {
                for (int column = 1; column <= num; column++) {
                    if (row == 1 || row == num || column == 1 || column == num || row == column || column == (num - row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
