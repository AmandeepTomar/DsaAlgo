package recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        // printNumber(10);
        System.out.println(printNumbersBetweenTwoNumbers(10, 0));
        System.out.println(printNumbersBetweenTwoNumbers(0, 10));
    }

    private static void printNumber(int number) {
        if (number == 0) return;
        else {
            System.out.print(number - 1 + " ");
            printNumber(number - 1);
        }
    }

    private static int printNumbersBetweenTwoNumbers(int num1, int num2) {
        if (num1 > num2) {
            return printNumberInDecrement(num1, num2);
        } else {
            return printNumberInIncrement(num1, num2);
        }
    }

    private static int printNumberInIncrement(int num1, int num2) {
        if (num1 < num2) {
            System.out.print(num1 + " ");
            num1 = num1 + 1;
            return printNumberInIncrement(num1, num2);
        }
        return num2;
    }

    private static int printNumberInDecrement(int num1, int num2) {
        if (num1 > num2) {
            System.out.print(num1 + " ");
            num1--;
            return printNumberInDecrement(num1, num2);
        } else {
            // System.out.println(num1 + " ");
            return num1;
        }
    }
}
