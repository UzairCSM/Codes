import java.util.Arrays;
import java.util.Objects;
import java.util.*;
public class ImportantNotes {
    public static boolean isVowel(char ch11) {
        switch (Character.toLowerCase(ch11)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
    public static boolean isLowerCase(char check) {
        return Character.isLowerCase(check);
    }

    public static boolean isUpperCase(char ch) {
        return Character.isUpperCase(ch);
    }
    public static boolean isLowerCase1(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isUpperCase1(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
    public static char toggleCase(char ch) {
        if (Character.isLowerCase(ch)) {
            // Convert lowercase to uppercase by subtracting 32 from the ASCII value
            return (char) (ch - 32);
        } else if (Character.isUpperCase(ch)) {
            // Convert uppercase to lowercase by adding 32 to the ASCII value
            return (char) (ch + 32);
        }
        // If the character is not a letter, return it as is
        return ch;
    }
   // Alphanumeric characters include letters and numbers.
    // Java program to illustrate the
// Character.isLetterOrDigit() method
    public static void isLetterOrDigit(){
            // assign character
            char c1 = 'D', c2 = '/';

            // Function to check if the character is letter or digit
            boolean bool1 = Character.isLetterOrDigit(c1);
            System.out.println(c1 + " is a letter/digit ? " + bool1);

            // Function to check if the character is letter or digit
            boolean bool2 = Character.isLetterOrDigit(c2);
            System.out.println(c2 + " is a letter/digit ? " + bool2);
        }

    public static void main(String[] args) {
        //1)
        String str1="Hello";
        String str2="Hello";
        // string values are compared using
        Objects.equals(str1, str2);
        // if unequality we want to check then !Objects.equals(str1, str2);

        //2)
        String s="a man has many arms";
        String[] str=s.split(" ");
        System.out.println(Arrays.toString(str));

        //3)
        // method starts with
        String s1="appleisagoodfruit";
        if(s1.startsWith("apple")){
            System.out.println(true);
        }

        //4) to get ascii value of any character
         char ch='A';
        System.out.println(ch+0);
        char ch1='a';
        System.out.println(ch1+0);

        //5)
        //how to get character if integer value is given in java
        // using type casting
        int intValue = 65;
        char charValue = (char) intValue;
        System.out.println(charValue); // Output: A

        // Using Character class
        int intValue1 = 97;
        char charValue1 = Character.toChars(intValue1)[0];
        System.out.println(charValue1); // Output: a

       // if we want to store char a at oth index and z at 25 then
        char[] alphabet = new char[26];
        char letter = 'a';

        for (int i = 0; i < 26; i++) {
            alphabet[i] = letter;
            letter++; // Increment the letter by 1 to get the next character
        }
// Printing the characters at each index
        for (int i = 0; i < 26; i++) {
            System.out.println("Index " + i + ": " + alphabet[i]);
        }
        //The expression char - char is an arithmetic operation between two char values in Java.
        //When you perform such an operation, the characters are implicitly
        // converted to their corresponding ASCII values before the subtraction occurs.
//        The result of the subtraction is an integer value.
//        In Java, when you subtract two char values, the result is an int value representing the difference between their ASCII values.
        //  For example, let'set consider the expression 'd' - 'a':
           char c='a';
           int ans=c-'a';
        System.out.println(ans);


        //6) Important operation in Treeset

        SortedSet<Integer> set = new TreeSet<>();

        // Adding Element to SortedSet
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(9);

        // Returning the set with elements
        // strictly less than the passed value
        System.out.println("Elements strictly less than 7 in set are : "
                + set.headSet(7));
        System.out.println(set.headSet(7).size());


        //7) to check whether character is vowel or consonant
        char ch11='u';
        System.out.println(isVowel(ch11));

        //8) to check whether charcater is lowercase or uppercse in java
        int check='A';
        System.out.println(isLowerCase(ch));


        //9)if lowercase convert to uppercase and viseversa
        System.out.println(toggleCase('u'));

    }
}





