package recursion;

public class RecursionCommonProblems {
    public static void main(String[] args) {
        RecursionCommonProblems obj = new RecursionCommonProblems();
        int num = 16;
        System.out.println(obj.sumOfNumber(num));
        int sumOfDigits = 55;
        System.out.println(obj.sunOfDigitsInNumber(sumOfDigits));
        int powerof2 = 2;
        System.out.println(obj.power(2, powerof2));
        // find GCD
        System.out.println(obj.findGreatestCommonDivisor(48, 16));

        System.out.println(obj.findBinaryFromDecimal(10));

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(obj.productOfArray(arr, arr.length - 1));

        System.out.println(obj.recursiveRange(10));

        System.out.println(obj.reverseString("aman"));

        System.out.println(obj.isPalindrome("tacocat"));

        System.out.println(obj.findFirstUpperCase("appMillerS"));


    }

    /**
     * Sun of 4 .
     * 4+3+2+1 = 10;
     * sum of 6
     * 6+5+4+3+2+1 = 21
     * Sum of 10
     * 10+9+8+7+6+5+4+3+2+1 =
     */
    private int sumOfNumber(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) return num;
        return num + sumOfNumber(num - 1);
    }

    /**
     * sum of 54 digits is 5+4 i.e 9
     * 54 / 10 => 5 and reminder is 4 = 9
     */
    private int sunOfDigitsInNumber(int num) {
        if (num < 0) return -1;
        if (num < 10) return num;
        return sunOfDigitsInNumber(num % 10) + sunOfDigitsInNumber(num / 10);
    }

    /**
     * 2 pow 3  = 2*3*2*1=> 12
     * 2*2*2*2 = 12
     **/
    private int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    /**
     * Find The Greatest Common Divisor
     * gcd(8,12) => 2*2 = 4
     * 8 = 2*2*2
     * 12 = 2*2*3
     * <p>
     * Euclidean Algorithm
     * GCD(48,18)
     * Step 1 = 48/18 = 2 reminder 12
     * Step 2 = 18/12 = 1 reminder 6
     * Step 3 = 12 / 6 = 2 reminder 0
     * GCD(a,0) = a;
     * Formula Gcd(a,b) = gcd(b , a mod b)
     */
    private int findGreatestCommonDivisor(int a, int b) {
        if (a < 0 || b < 0) return -1;
        if (b == 0) {
            return a;
        }
        return findGreatestCommonDivisor(b, a % b);
    }

    /**
     * find Binary from decimal
     * 4/2 => 2 reminder 0
     * 2/2 => 1 reminder 0
     * 1/2 => 0 reminder 1
     * 1. divide by 2
     * 2. get the quotient for next iteration.
     * 3. get the reminder digit for the binary digit.
     * 4. repeat until the quotient is 0
     * <p>
     * Formula
     * fn = n mod 2 + 10*binary(n/2) example 4
     * num  quotient  reminder
     * 4    4/2=2      4%2 = 0
     * 2    2/2=1      2%2=0
     * 1    1/2=0      1%2=1
     * call this way it is working , forst we call for N=4 and calculate n=2 then n=1 and
     * now we get value for f(0),f(1) and f(2)
     * num%2 + 10*binary(num/2)
     * n=4,0 + 10*binary(2)=10*10 = 100
     * n=2,0 + 10*binary(1) = 10*1
     * n=1, 1+10*binary(0)= 1
     */
    private int findBinaryFromDecimal(int num) {
        if (num < 0) return -1;
        if (num == 0) return 0;
        return num % 2 + 10 * findBinaryFromDecimal(num / 2);
    }

    /**
     * int arr[] = {1, 2, 3, 4, 5};
     * ans = 120;
     */
    private int productOfArray(int arr[], int length) {
        if (length == 0) {
            return 1;
        }
        return arr[length] * productOfArray(arr, length - 1);
    }

    /**
     * Write a function called recursiveRange which accepts a number and adds up all the numbers from 0 to the number passed to the function.
     * recursiveRange
     * recursiveRange(6)  // 21
     * recursiveRange(10) // 55
     */
    private int recursiveRange(int num) {
        if (num < 0) return -1;
        if (num == 1) return 1;
        return num + recursiveRange(num - 1);
    }

    /***
     * String is AMAN
     * Ans is NAMA
     * reverseString(AMAN)
     * reverseString(MAN) + A
     * reverseString(AN) + M
     * reverseString(N) +A
     * emptyString + N
     */
    private String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    /**
     * base case
     * if(str.charAt[last]!=str.charAt[first])
     */
    private boolean isPalindrome(String str) {
        if (str.isEmpty()) return false;
        if (str.length() == 0 || str.length() == 1) return true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    /**
     * Given a string find its first uppercase letter
     * Example
     * Input : appmillerS
     * Output : S
     */
    private char findFirstUpperCase(String str) {
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        } else {
            return findFirstUpperCase(str.substring(1, str.length()));
        }
    }

    /**
     * Implement a function that capitalizes each word in String.
     * Example
     * input: i love java
     * output : I Love Java
     */
    private String capitalizesWord(String str) {
        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.charAt(str.length() - 2) == ' ')) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizesWord(str.substring(0,str.length()-1))+ Character.toString(chr);
    }
}