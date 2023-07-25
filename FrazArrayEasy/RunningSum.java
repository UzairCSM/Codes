package FrazArrayEasy;
import java.util.*;
public class RunningSum {
    class Solution {
        public int[] runningSum(int[] nums) {
            int sum=0;
            int pos=0;
            int[] new_array=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                new_array[pos]=sum;
                pos++;
            }
            return new_array;
        }
    }
}
