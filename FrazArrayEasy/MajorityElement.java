package FrazArrayEasy;
import java.util.*;
public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            int max=Integer.MIN_VALUE;
            Set<Integer> keys=hm.keySet();
            int ans=0;
            for(int key:keys){
                if(hm.get(key)>max){
                    max=hm.get(key);
                    ans=key;

                }
            }
            return ans;
        }
    }
}
