package DSASheetbyArsh;

public class ArraysNextfiveQuestions {
    public static int subarraysDivByK(int[] arr, int k) {
             int count=0;
             int i=0;
            int ans=helper(arr,k,count,i);
             return ans;
    }
    public static int   helper(int[] arr,int k,int count,int ind){
        if(ind==arr.length){
            return count;
        }
        int sum=0;
        for(int i=ind;i<arr.length;i++){
            sum+=arr[i];
           // System.out.println(sum);
           if(sum%k==0){
               count++;
           }
        }
        //System.out.println(count);
       return helper(arr,k,count,ind+1);
 }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int k=3;
        System.out.println(subarraysDivByK(arr,k));
    }
}
