package Codechefandleetcode;
import java.util.*;
public class Subsetswithduplicates {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=0;
            if(i>0 && nums[i]==nums[i-1]){
                start=end+1;
            }
            int size=list.size();
            end= size-1;
            for(int j=start;j<size;j++){
                ArrayList<Integer> temp=new ArrayList<>(list.get(j));
                temp.add(nums[i]);
                list.add(temp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> ans=subsetsWithDup(nums);
        System.out.println(ans);
    }
}
