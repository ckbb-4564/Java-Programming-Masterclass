public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        if (!isValid(firstNum)) {
            return false;
        }
        if (!isValid(secondNum)) {
            return false;
        }
        if (!isValid(thirdNum)) {
            return false;
        }
        
        int rightFirstNum = firstNum % 10;
        int rightSecondNum = secondNum % 10;
        int rightThirdNum = thirdNum % 10;
        
        if (rightFirstNum == rightSecondNum || rightFirstNum == rightThirdNum || rightSecondNum == rightThirdNum) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isValid(int number) {
        return (number < 10 || number > 1000) ? false : true;
    }
}