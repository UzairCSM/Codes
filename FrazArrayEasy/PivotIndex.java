package FrazArrayEasy;
import java.util.*;
public class PivotIndex {
    class Solution {
        public int pivotIndex(int[] nums) {
            long sum=0;
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
            }
            long initial_left=0;
            //  long initial_left=0;
            long initial_right=0;
            long minus=0;
            // int check=0;
            int ind=-1;
            for(int i=0;i<nums.length;i++){
                minus=minus+nums[i];
                initial_right=sum-minus;
                if(initial_right==initial_left){
                    ind=i;
                    break;
                }
                else{
                    initial_left=initial_left+nums[i];
                }
                //  return ind;
            }
            return ind;
        }
    }
}
