package Lab4.Calculator;

public class LogicalOP {

    //EXE Nr. 3
    public int checkBiggerNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is bigger");
            return a;
        } else {
            System.out.println(b + " is bigger");
            return b;
        }
    }

    //EXE Nr. 4

    public String checkToString(String a) {
        String result;
        if (a.equals("FastTrackIT")) {
            result = "Learning test comparison";
        } else {
            result = "Got to try some more";
        }
        return result;

    }

    //EXE Nr. 5

    public String stringAndNumber(String a, int b) {
        String result = "No value";
        if (a.equals("FastTrackIT") && (b <= 3)) {
            result = a + b;
        } else if (!a.equals("FastTrackIT") && (4 >= 4)) {
            result = b + a;
        }

        return result;
    }

    //EXE Nr. 6

    public String winterSnow(int a) {
        String result;
        if (a == 6 || a > 8)
            result = "The amount of snow this winter was(cm): " + a;
        else
            result = "The forecast snow is(cm):" + a;
        return result;


    }

    //EXE Nr. 7

    public String numberEuals4(int a) {
        String result;
        if (a > 3) {
            if (a != 4) {
                result = "The number is greater than 3 and not equal to 4";
            } else {
                result = "The number is equal to 4";
            }
        } else
            result = "The number is lower than 3";

        return result;
    }

    //EXE Nr.8

    public String switchCaseFormula(int a) {
        String result;

        switch (a) {

            case 1:
                result = "Numarul este 1";
                break;
            case 2:
                result = "Numarul este 2";
                break;
            case 3:
                result = "Numarul este 3";
                break;
            case 4:
                result = "Numarul este 4";
                break;
            case 5:
                result = "Numarul este 5";
                break;
            case 6:
                result = "Numarul este 6";
                break;
            case 7:
                result = "Numarul este 7";
                break;
            case 8:
                result = "Numarul este 8";
                break;
            case 9:
                result = "Numarul este 9";
                break;
            case 0:
                result = "Numarul este 0";
                break;
            default:
                result = "Numarul nu se afla in case";

        }
        return result;
    }

    //EXE Nr. 9
    public boolean isNumberEven(int a) {
        boolean status;
        if (a % 2 == 0)
            status = true;
        else
            status = false;
        return status;

    }

    //EXE Nr. 10
    public boolean isEligibleToVote(int varsta) {
        boolean status;
        if (varsta >= 18)
            status = true;
        else
            status = false;
        return status;

    }

    //EXE Nr. 11
    public int biggerNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber)
                return firstNumber;
            else
                return thirdNumber;
        } else if (secondNumber > thirdNumber)
            return secondNumber;
        else return thirdNumber;

    }


    //~~~~~~~~~~LAB 12 TEMA~~~~~~~~~~~~~
//EXE 1
    public void printNumbersTo100(int number) {

        for (int i = number; i <= 100; i++)
            System.out.println(i + ",");

    }

    //EXE 2
    public void printNumberToNegative100(int number) {
        for (int i = number; i >= -100; i--)
            System.out.println(i + ",");

    }

    //EXE 3,4
    public void numaratoareintre2Numere(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber && firstNumber != secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++)
                System.out.println(i + ",");
        } else {
            for (int i = secondNumber; i <= firstNumber; i++)
                System.out.println(i + ",");
        }


    }

    //EXE 5

    public void evenNumbersBetween0And100(int firstNumber, int secondNumber) {
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 0)
                System.out.println(i + ",");

    }

    //EXE 6
    public void unEvenNumbersBetween0And100(int firstNumber, int secondNumber) {
        for (int i = 1; i <= 100; i++)
            if (i % 2 != 0)
                System.out.println(i + ",");
    }
    //EXE 7


    public void sumOfNumbersFormXTo100(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++)
            sum += i;
        System.out.println("The sum of numbers from " + number + " to 100 is:" + sum);
    }

    //EXE 8
    public void printAverageFor1NumberAndAllTo100(int number) {
        int sum = 0;
        int counter = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
            counter++;
        }
        System.out.println((sum / counter));
    }


    //EXE 9

    public void printStarsForFun() {
        float stars;
        for (int i = 7; i > 1; i--) {
            stars = 0;
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    //~~~~~~~~~~Tema 12 WHILE~~~~~~~~~~~~~~~~~~
    //EXE 1
    public void printFromNumberTo100While(int number) {
        while (number <= 100) {
            System.out.println(number + ",");
            number++;

        }
    }

    //EXE 2
    public void printFromNumbertoNegative100While(int number) {

        while (number >= -100) {
            System.out.println(number + ",");
            number--;
        }
    }

    //EXE 3,4
    public void countFromNumberToNumberWhile(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            while (firstNumber < secondNumber) {
                System.out.println(firstNumber + ",");
                firstNumber++;
            }
        } else {
            while (firstNumber > secondNumber) {
                System.out.println(secondNumber + ",");
                secondNumber++;

            }

        }
    }

    //EXE 5
    public void showEvenNumberFrom1To100While() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i + ",");
            i++;
        }
    }

    //EXE 6
    public void showUnevenNumbersFrom1To100() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 1) {
                System.out.println(i + ",");
            }
            i++;
        }
    }

    //EXE 7
    public void showSumFrom2HudgeNumbers() {
        int i = 111;
        int count = 0;
        int sum = 0;
        while (i <= 8899) {
            sum += i;
            count++;
            i++;
        }
        System.out.println("Suma numerelor este " + sum);
        System.out.println("Media numerelor este " + (sum / count));

    }

    //EXE 8
    public void showNumbersDividedBy7(int firstNumber, int secondNumber) {
        int counter = 0;
        int sum = 0;
        while (firstNumber < secondNumber) {
            if (firstNumber % 7 == 0) {
                sum+=firstNumber;

            }
            firstNumber++;
            counter++;


        }
        System.out.println((sum/counter));
    }
    ///EXE 9
    public void sirulLuiFibonacci(){
        int a=1;
        int b=1;
        int aux;
        int counter=1;
        while(counter<=20){
            System.out.println(a);
            aux=a+b;
            a=b;
            b=aux;
            counter++;

        }
    }






}
