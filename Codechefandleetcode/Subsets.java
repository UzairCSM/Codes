package Codechefandleetcode;
import java.util.Arrays;
import java.util.*;

public class Subsets {
        // public static int[] arr=new int[]
        public static List<List<Integer>> subsets(int[] nums) {
            ArrayList<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>());
            for (int num : nums) {
                int size = ans.size();
                for (int i = 0; i < size; i++) {
                    ArrayList<Integer> temp = new ArrayList<>(ans.get(i));
                    System.out.println(temp);
                    temp.add(num);
                    ans.add(temp);
                }
            }
            return ans;
        }
        public static void main(String args[])
        {
            int[] nums={1,2,3};
            List<List<Integer>> ans=subsets(nums);
            System.out.println(ans);

        }
    }
