package Lab5;

public class Main {

    public static void main(String[] args) {
        LogicalOP op = new LogicalOP();
        //  int[] myArray=op.getEvenArray();
        // for(int i=0;i<myArray.length;i++)
        //   System.out.println(myArray[i]);
        // op.showCharactersArray();
        int[] myArray = {-1, -2, 2, 3, 4, 5, 1, 7, 2, 2, 3, 4};
//int[] mySecondArray=op.removeANumberFromArray(myArray,2);
//for(int i=0;i<mySecondArray.length;i++)
        //  System.out.println(mySecondArray[i]);
        System.out.println(op.showSecondSmallestNumberInArray(myArray));


    }


}
