package StackQuestionsSet;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
   // public class StackQuestions {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            Stack<Character> st = new Stack<>();
            boolean flag =false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ')') {
                    if (st.peek() == '(') {
                        // System.out.println("false");
                        flag = true;
                        // return;
                        break;
                    } else {
                        //st.pop();
                        while (st.peek() != '(') {
                            st.pop();
                        }
                        st.pop();
                    }
                } else {
                    st.push(str.charAt(i));
                }
            }
            if (flag) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
