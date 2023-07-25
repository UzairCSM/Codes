package Codechefandleetcode;
public class BitManipulation {
   // public class BitManipulation {
        public static void printBinary(int n) {
            for (int i = 10; i >= 0; i--) {
                System.out.print((n >> i) & 1);
            }
            System.out.println();
        }
        public static void main(String[] args) {
            //for(int i=0;i<8;i++){
            //printBinary(i);
            for(int c='A';c<='E';c++){
                System.out.println((char)c);
                printBinary(c);
                char a= (char) ((char) c| (1<<5));
                System.out.println(a);

            }
            for( char c='a';c<='e';c++){
                System.out.println(c);
                printBinary((int)c);
//
                char A= (char) (c&(~(1<<5)));
                System.out.println(A);
            }

//           }
        }
    }

