public class SharedDigit {
    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if ((firstNum < 10) || (firstNum > 99)) {
            return false;
        }
        if ((secondNum < 10) || (secondNum > 99)) {
            return false;
        }
        int currentFirstNumDigit = 0;
        int currentSecondNumDigit = 0;
        
        while (firstNum > 0) {
            int tempSecondNum = secondNum;
            currentFirstNumDigit = firstNum % 10;
            while (tempSecondNum > 0) {
                currentSecondNumDigit = tempSecondNum % 10;
                if (currentFirstNumDigit == currentSecondNumDigit) {
                    return true;
                }
                tempSecondNum /= 10;
            }
            firstNum /= 10;
        }
        return false;
    }
}