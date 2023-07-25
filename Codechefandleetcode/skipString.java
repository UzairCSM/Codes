package Codechefandleetcode;
import java.lang.*;
import java.util.*;
public class skipString {
    public static void recurpermute(int[] nums,List<List<Integer>> ans,int ind){
        if(ind== nums.length){
            List<Integer> my_list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                my_list.add(nums[i]);
            }
            ans.add(new ArrayList<>(my_list));
           // ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i< nums.length;i++){
         swap(ind,i,nums);
         recurpermute(nums,ans,ind+1);
         swap(ind,i,nums);
        }
    }
    public static void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        int ind=0;
        recurpermute(nums,ans,ind);
        return ans;
    }

        public static void main(String[] args) {
            int nums[] = {1, 2, 3};
            List<List<Integer>> ans = permute(nums);
            System.out.println(ans);
        }
    }
