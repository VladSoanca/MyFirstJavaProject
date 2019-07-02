package Lab5;

public class Calculator {


    public  int sumTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int substractTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public int multiplicationTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public int divideTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public int divideRest(int firstnumber, int secondNumber) {
        int result = firstnumber % secondNumber;
        return result;
    }
}

