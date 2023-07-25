package RecursionQuestions;

public class Displayanarray {
    public static void Displayarray(int[] nums,int ind){

        if(ind>= nums.length){
            return;
        }
      //  System.out.println(nums[ind]); same
        Displayarray(nums,ind+1);
       // System.out.println(nums[ind]); reverse
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        int ind=0;
        Displayarray(nums,ind);
    }
}
