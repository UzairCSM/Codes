package FrazArrayEasy;
import java.util.*;
public class DuplicatesSorted {
    class Solution {
        public int removeDuplicates(int[] nums) {
            HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                hs.add(nums[i]);
            }
            List<Integer> list = new ArrayList<Integer>(hs);
            Collections.sort(list);
            int i=0;
            for(int ele:list){
                nums[i++]=ele;
            }
            //  Arrays.sort(nums);
            return hs.size();
        }
    }
}
