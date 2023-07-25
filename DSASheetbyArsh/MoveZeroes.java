package DSASheetbyArsh;

public class MoveZeroes {
   // class Solution {
        public void moveZeroes(int[] nums) {
            int pos=0;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    count++;
                }
                else{
                    nums[pos]=nums[i];
                    pos++;
                }
            }
            for(int i=0;i<count;i++){
                nums[pos]=0;
                pos++;
            }
        }
    }

