package DSASheetbyArsh;
import java.util.*;
public class FindtheduplicateNumber {
    //class Solution {
        public int findDuplicate(int[] nums) {
            Arrays.sort(nums);
            int prev=nums[0];
            int ans=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]==prev){
                    return nums[i];
                    //break;
                }
                prev=nums[i];
            }
            return 0;
        }
    }

