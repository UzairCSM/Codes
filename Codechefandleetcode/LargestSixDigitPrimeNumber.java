package Codechefandleetcode;

public class LargestSixDigitPrimeNumber {
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            if (number == 2 || number == 3) {
                return true;
            }

            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }

            int sqrt = (int) Math.sqrt(number);
            System.out.println(sqrt);
            for (int i = 5; i <= sqrt; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }

        public static int findLargestPrime() {
            int limit = 6000; // Largest 6-digit number
            if(limit%2==0){
                limit=limit-1;
            }
            int largestPrime = 0;

            for (int i = limit; i >= 1; i -= 2) {
                if (isPrime(i)) {
                    largestPrime = i;
                    break;
                }
            }

            return largestPrime;
        }

        public static void main(String[] args) {
            int largestPrime = findLargestPrime();
            System.out.println("The largest 6-digit prime number is: " + largestPrime);
        }
    }
