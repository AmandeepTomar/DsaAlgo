package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers and provide the all possible no of permutations.
 * num={1,2,3};
 * ans =? [[123],[132],[213],[231][321],[312]]
 * */
public class PrintPermutations {

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int[] nums = {1,2,3};
        solve(nums,0,res);
        System.out.println(res);
    }

    private static void solve(int[] nums, int index, List<List<Integer>> res) {
        int n = nums.length;
        // base case 
        if (n==index){
            List<Integer> sublist = new ArrayList<>();
            for (int el:nums){
                sublist.add(el);
            }
            res.add(new ArrayList<>(sublist));
            return;
        }

        for (int i = index; i <n ; i++) {
            swap(nums,i,index);
            solve(nums,index+1,res);
            swap(nums,i,index);
        }

    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}
