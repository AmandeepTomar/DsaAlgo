package big_O;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CalculateTimeComplexity {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5};
        findSumAndAverage(arr);
        printPairsFromArray(arr);
        reverseArray(arr);
        findTimeComplexityOfFib(10);
    }

    private static void findSumAndAverage(int[] arr) {
        int sum = 0; //--------O(1)
        int product = 1;
        for (int i = 0; i < arr.length; i++) { //--------O(N)
            sum = sum + arr[i]; //--------O(1)
            product *= arr[i];
        }
        int avg = sum / arr.length; //--------O(1)
        System.out.println("Sum is = " + sum + " Average is = " + avg + " Product is = " + product); //--------O(1)

        // Tn = O(1)+O(N)*O(1)+2O(1)
        // Tn = 3 O(1) + O(N)
        // tn = O(N) this is complexity.
    }

    /**
     * Example arr[]={1,3,4,5};
     * First we take 1 and print all the elements => 11,13,14,15
     * First we take 3 and print all the elements => 31,33,34,35
     * First we take 4 and print all the elements => 41,43,44,45
     * First we take 5 and print all the elements => 51,53,54,55
     * it has Time complexity of O(N pow 2)
     * because
     * Tn = O(N)*3O(N)*O(1) = N pow 2 , we minimize or remove the constant.
     */
    private static void printPairsFromArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // -------O(N)
            for (int j = 0; j < arr.length; j++) { // // -------O(N)
                System.out.print(arr[i] + "" + arr[j]);// -------O(1)
                if (j != arr.length - 1) // -------O(1)
                    System.out.print(", "); // -------O(1)
            }
            System.out.println(); // -------O(1)
        }
    }

    /**
     * tn = o(1)+O(n/2*[3 O(1)])+o(1)
     * tn = 2O(1)+O(3n/2)
     * / removing constant
     * tn = O(n/2) => O(N)
     */
    private static void reverseArray(int[] arr) {
        System.out.println("Actual Array " + Arrays.toString(arr)); // ---O(1)
        for (int i = 0; i < arr.length / 2; i++) { //---O(n/2)
            int temp = arr[arr.length - 1 - i];// ---O(1)
            arr[arr.length - 1 - i] = arr[i]; // ---O(1)
            arr[i] = temp; // ---O(1)
        }
        System.out.println("Reverse Array " + Arrays.toString(arr)); // ---O(1)
    }

    /**
     * complexity of findFIbComplexity = branches pow(depths)
     * => 2 pow(N).
     * Now Complexity of findTimeComplexityOfFib =>
     * findFIbComplexity(1) = 2 pow 1. steps
     * findFIbComplexity(2) = 2 pow 2.
     * findFIbComplexity(3) = 2 pow 3.
     * findFIbComplexity(n) = 2 pow n.
     * <p>
     * total work = 2 pow 1. + 2 pow 2 + 2 pow 3+...........+2 pow n.
     * = 2 pow n+1 -2
     * = O(2 pow N).
     */
    private static void findTimeComplexityOfFib(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(findFIbComplexity(i)+" on "+i);
        }
    }

    private static int findFIbComplexity(int num) {
        if (num == 0) return 0;
        if (num == 1) {
            return 1;
        }
        return findFIbComplexity(num - 1) + findFIbComplexity(num - 2);
    }


}
