package Lab5;

public class Calculator {

    //Tema Polimorfism
    public int sumNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public double sumNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    public int sumNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstNumber + secondNumber + thirdNumber;
        return result;
    }


    public int substractNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public double substractNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }

    public int substractNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstNumber - secondNumber - thirdNumber;
        return result;
    }


    public int multiplicationNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public double multiplicationNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    public int multiplicationNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstNumber * secondNumber * thirdNumber;
        return result;
    }


    public int divideTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public double divideTwoNumbers(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    public int divideRest(int firstnumber, int secondNumber) {
        int result = firstnumber % secondNumber;
        return result;
    }

    public double divideRest(double firstNumber, double secondNumber) {
        double result = firstNumber % secondNumber;
        return result;
    }
}

