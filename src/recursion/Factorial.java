package recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int num = 4;
        System.out.println(factorial.writeFactorial(num));
    }

    private int writeFactorial(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * writeFactorial(num - 1);
    }
}
