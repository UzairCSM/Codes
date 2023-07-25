package FrazArrayEasy;
import java.util.*;
public class MoveZeros {
    class Solution {
        public void moveZeroes(int[] nums) {
            int[] new_array=new int[nums.length+1];
            int pos=0;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    count++;
                }
                else{
                    new_array[pos]=nums[i];
                    pos++;
                }
            }
            for(int i=0;i<count;i++){
                new_array[pos]=0;
                pos++;
            }
            for(int i=0;i<nums.length;i++){
                nums[i]=new_array[i];
            }
        }
    }
}
