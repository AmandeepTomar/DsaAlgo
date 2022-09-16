package recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        // 0,0,1,2,3,5,8
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        int num = 4;
        System.out.println(fibonacciNumber.printFibonacciNumber(num));
    }

    /**
     * Calculate aficionado of 4. i.e 3.
     * printFibonacciNumber(4) = 2 + 1
     * 2=printFibonacciNumber(3) + 1=printFibonacciNumber(2) => 1=printFibonacciNumber(1)[1] + printFibonacciNumber(0)[0]
     * printFibonacciNumber(3)=> 1=printFibonacciNumber(2) + 1=printFibonacciNumber(1)
     * printFibonacciNumber(2)=> printFibonacciNumber(1) + printFibonacciNumber(0) // now the base condition reached
     */
    private int printFibonacciNumber(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0 || num == 1) {
            return num;
        }
        return printFibonacciNumber(num - 1) + printFibonacciNumber(num - 2);
    }
}
