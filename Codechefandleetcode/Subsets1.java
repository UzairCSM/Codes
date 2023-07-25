package Codechefandleetcode;
import java.util.*;
public class Subsets1 {
    public static void solve(List<List<Integer>> ans, List<Integer> output, int ind, int nums[],int target,int sum) {
     //base case
     if(sum==target){
         ans.add(new ArrayList<>(output));
         return;
     }
     if(sum>target){
         return;
     }
        if(ind>= nums.length){
            return;
        }
     //take
      output.add(nums[ind]);
        sum+=nums[ind];
     solve(ans,output,ind+1,nums,target,sum);
     // not take
     output.remove(output.size()-1);
    sum-=nums[ind];
    while((ind+1 <nums.length) && (nums[ind]==nums[ind+1])){
        ind++;
    }
     solve(ans,output,ind+1,nums,target,sum);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int ind = 0;
        int sum=0;
        Arrays.sort(candidates);
        solve(ans, list, ind,candidates,target,sum);
        return ans;
    }

    public static void main(String[] args) {
        int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> ans =combinationSum(candidates,target);
        System.out.println(ans);
    }
}



