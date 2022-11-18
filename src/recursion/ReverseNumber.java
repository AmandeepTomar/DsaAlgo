package recursion;

public class ReverseNumber {
    public int res =0;

    public static void main(String[] args) {
        int num = 543210;
        // reverseNumberUsingRecursion(num);
        ReverseNumber obj=new ReverseNumber();
        obj.reverseNumber(num, obj.res);
        System.out.println(obj.res);
    }

    private static void reverseNumberUsingRecursion(int num) {
        if (num == 0) return;
        System.out.print(num % 10);
        reverseNumberUsingRecursion(num / 10);

    }

    /**
     * We can return 54321 into 12345 but when ever we want to reverse the no and want to return the number like reverse 5000.
     * so it will be 0005 but no value of 0 when it will be added prior to any number.
     * To achive this we need to use the string.
     * or somehow we can find the no of digits and then add 0 in prefix of the digits.
     */
    private void reverseNumber(int num, int res) {
        if (num == 0) return;
        else {
            res = res * 10 + num % 10;
            reverseNumber(num / 10, res);
        }

    }
}
