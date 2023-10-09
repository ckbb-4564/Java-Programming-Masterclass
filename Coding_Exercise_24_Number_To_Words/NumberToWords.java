public class NumberToWords {
    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }
        return Integer.toString(num).length();
    }

    public static int reverse(int num) {
        int reversed = 0;
        int tempNum = Math.abs(num); // Make sure to work with the positive value

        while (tempNum > 0) {
            int lastDigit = tempNum % 10;
            reversed = (reversed * 10) + lastDigit;
            tempNum /= 10;
        }

        if (num < 0) {
            reversed = -reversed;
        }
        return reversed;
    }
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }
    
        if (num == 0) {
            System.out.println("Zero");
            return;
        }
    
        int reversed = reverse(num);
        int digits = getDigitCount(num);
        int currentDigit;
    
        while (digits > 0) {
            currentDigit = reversed % 10;
            switch (currentDigit) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
            if (digits > 1) {
                System.out.print(" ");
            }
            reversed /= 10;
            digits--;
        }
    
        System.out.println();
    }    
}