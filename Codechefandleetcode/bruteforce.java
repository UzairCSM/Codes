package Codechefandleetcode;

import java.util.ArrayList;
import java.util.List;

public class bruteforce {
    public static ArrayList<List<Integer>> out=new ArrayList<>();

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        ArrayList<Integer> list=new ArrayList<>();
      //  ArrayList<List<Integer>> out=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
            //    list.add(nums[i]);
              //  out.add(list);
              //  list.clear();
                count++;
            }
            //list.clear();
            if (i + 1 <= nums.length-1) {
                int sum=nums[i];
                list.add(nums[i]);
                for (int j = i + 1; j < nums.length; j++) {
                 //   sum+=nums[i];
                    sum+=nums[j];
                    list.add(nums[j]);
                    if (sum == k) {
                      //  out.add(list);
                      //  System.out.println(out);
                      //  list.clear();
                        count++;
                        break;
                    }
                }
             //   list.clear();
            }
        }
        return count;
    }
        public static void main(String[] args) {
            int[] nums={3,4,7,2,-3,1,4,2};
            int k=7;
            int ans=subarraySum(nums,k);
            System.out.println(ans);
       //    System.out.println(out);
    }
}
