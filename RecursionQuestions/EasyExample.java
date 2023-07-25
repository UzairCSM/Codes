package RecursionQuestions;

public class EasyExample {
    public static void fun(int n){
        if(n==0){
            return;
        }
        //System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
   public static int factorial(int n){
        if(n==1 || n==0){
            return n;
        }
       return n*factorial(n-1);

   }
   public static int sumofdigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10+sumofdigits(n/10);
   }
   public static int productofdigits(int n){
        if(n%10==n){
            return n;
        }

        return (n%10) *productofdigits(n/10);

   }
   public static int reverseaNumber(int n,int number){
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)Math.pow(10,number) + reverseaNumber(n/10,--number);
   }

   public static boolean palindromeornot(int number){

        if(number==reverseaNumber(number,(int)(Math.log10(number)))){
            return true;
        }
        return false;
   }
   public static int countzeroes(int number,int count){
        if(number==0){
            return count;
        }
        int digit=number%10;
        if(digit==0){
            return countzeroes(number/10,count+1);
        }
        return countzeroes(number/10,count);

        }



    public static void main(String[] args) {
        fun(5);
        System.out.println(factorial(5));
        int digit=123456;
        int digits=(int)(Math.log10(digit))+1;
        System.out.println(digits);
        System.out.println(sumofdigits(1342));
        System.out.println(productofdigits(1342));
        System.out.println(reverseaNumber(digit,digits-1));
        System.out.println(palindromeornot(123321));
        System.out.println(countzeroes(30204000,0));


    }
}
