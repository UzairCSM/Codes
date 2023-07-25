package Codechefandleetcode;
import java.util.*;
public class LetterCombinationsofaNumber {

    public static void canPartitionKSubsets(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        boolean[] check1=new boolean[nums.length];
        int avg=0;
        for(int i=0;i< nums.length;i++){
            avg+=nums[i];
        }
        int check=avg/k;
      helper(nums,k,0,0,check,ans,check1);
        //take


    }
    public static void helper(int[] nums,int k,int ind,int sum,int check,List<Integer> ans,boolean[] check1){

    if(sum==check){



    }


        //take
        int element=nums[ind];
        ans.add(ind);
        check1[ind]=true;
        helper(nums,k,ind+1,sum+ind,check,ans,check1);
        ans.remove(ans.size()-1);
        helper(nums,k,ind+1,sum,check,ans,check1);

    }


    public static void main(String[] args) {
       int[] board={4,3,2,3,5,2,1};
     //  String word = "SEE";
        int k=4;
    //   boolean ans=canPartitionKSubsets(board,k);


    }
}
