package Codechefandleetcode;

public class twopointer {
    public static int subarraySum(int[] nums, int k) {
        int i = 0;
        int j = 1;
        int count = 0;
        int sum=nums[i];
        int sum1=0;

        while(j<=nums.length){
        if ((sum == k)&&(i<=nums.length-1)){
            i++;
            j++;
            sum+=nums[i];
            count++;
        }
      //  else if()
        else if ((i<nums.length && j< nums.length)&&(sum + nums[j] == k)) {
            sum=nums[j];
            count++;
            i++;
            j++;
        } else if ((i<nums.length && j< nums.length)&&(nums[i] + nums[j] > k)) {
            sum=nums[j];
             i++;
             j++;
        }
        else if((i<nums.length && j< nums.length)&&(sum+nums[j]<k)){
            sum+=nums[j];
            i++;
            j++;
        }

    }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=2;
            int ans=subarraySum(nums,k);
        System.out.println(ans);
    }
}