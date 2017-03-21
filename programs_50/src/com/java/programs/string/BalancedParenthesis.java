package com.java.programs.string;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParenthesis {
	
	public static String  isBalancedParenthesis(String s){
	
		// if stack is empty it is balanced
		
		if (s.isEmpty()){
			
			 return "Balanced";
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		//iterate through the expression
		
		 for (int i = 0; i < s.length(); i++)
		 {
		 char ch = s.charAt(i);
		 
		 // if opening braces then push to stack 
		 
		 if (ch == '{' || ch == '(' || ch == '[')
			 
		 {
		 
			 stack.push(ch);
			 
		 }
		 // if closing brace then retrieve last element from stack and check if its pair with current brace
		 
		 else if (ch == '}' || ch == ')' || ch == ']')
		
		 {
			 
		 char lp= stack.peek();
		 
		 // if pairs then remove 
		 
		 if (ch == '}' && lp == '{' || ch == ')' && lp == '(' || ch == ']' && lp == '[')
			 
		 {
		 
			 stack.pop();
		 }	 
		 else {
			
			 return "Not Balanced";
		 }
	 }
		 
	}
		 return stack.isEmpty()?"Balanced":"Not Balanced";
		 
 }

		
	public static void main(String[] args) {
		
	//	BalancedParenthesis bp = new BalancedParenthesis();
		
		System.out.println(BalancedParenthesis.isBalancedParenthesis("((1*2}+{5+4)+[6*9)})"));
		System.out.println(BalancedParenthesis.isBalancedParenthesis("a*(b+c)-(d*e)"));
		
		System.out.println(BalancedParenthesis.isBalancedParenthesis("{m + {k *he)}]}"));
	}

}
