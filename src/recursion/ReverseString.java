package recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "543210";
        String res = "";
        reverseString(str, 0, res);
        System.out.println(res);
        char [] s= {'h','e','l','l','o'};
        reverseCharArrayInLine(s,0);
    }

    private static void reverseString(String str, int length, String res) {
        if (length == str.length()) return;
//        res = str.charAt(length) + res;
//        System.out.println(res);
        reverseString(str, length+1, res);
        res = res + str.charAt(length);
        System.out.print(res);
    }

    private static void reverseCharArrayInLine(char [] s,int index){
        if (index==s.length/2)
            return;
        reverseCharArrayInLine(s,index+1);
        swap(s,index,s.length-index-1);
        System.out.println("Reverse Array "+ Arrays.toString(s));
    }

    private static void swap(char[] s, int i1, int i2) {
        char temp = s[i1];
        s[i1] = s[i2];
        s[i2] = temp;
    }
}
