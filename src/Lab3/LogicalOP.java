package Lab3;

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
    public int biggerNumber(int firstNumber,int secondNumber,int thirdNumber){
        if(firstNumber>secondNumber) {
            if (firstNumber > thirdNumber)
                return firstNumber;
            else
                return thirdNumber;
        }else if(secondNumber>thirdNumber)
            return secondNumber;
        else return thirdNumber;

        }

    }

