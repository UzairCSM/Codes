package StackQuestionsSet;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else if(ch==']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
           else  if(ch=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
           //st.push(ch);
            else if(ch=='[' || ch=='(' || ch=='{'){
                st.push(ch);
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="[(a+b)+{(c+d)*(e/f)]}";
        boolean ans=isValid(str);
        System.out.println(ans);
    }
}
