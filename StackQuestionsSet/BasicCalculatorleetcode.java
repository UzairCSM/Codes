package StackQuestionsSet;

import java.util.Stack;

public class BasicCalculatorleetcode {
    public static void calculate(String s) {


        int sum=0;
        int sum1=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                int x=s.charAt(i)-'0';
                sum=sum+x;
            }
            else if((s.charAt(i)=='+') || (s.charAt(i)=='-')){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='(' && s.charAt(i)!=')'){
                if(st.peek()=='+'){
                    sum=sum+s.charAt(i)-'0';
                    st.pop();
                }
                else if(st.peek()=='-'){
                    sum=sum-s.charAt(i)-'0';
                    st.pop();
                }
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) {

    }
}
