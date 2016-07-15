package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by helmeter on 6/8/16.
 */
public class removeElemet {

    public static int removeElement(int[] nums, int val) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==val){
                for(int j=i;j<nums.length;j++){
                    nums[j] =nums[j+1];
                }
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {

        int[] nums = {3,2,2,3};

        System.out.print(removeElement(nums,3));


    }
}
