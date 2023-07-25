package RecursionQuestions;

public class power {
    public static int powerfun(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
       // int left= powerfun(x,n/2);
       //  int right=powerfun(x,n/2);
       //  return left*right;
        return x*powerfun(x,n-1);
    }

    public static void main(String[] args) {
        int x=2;
        int n=8;
        int ans=powerfun(x,n);
        System.out.println(ans);
    }
}
