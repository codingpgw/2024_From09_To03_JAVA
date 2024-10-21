package com.pcwk.ehr.ed01;

import java.util.Stack;

public class J02StackBracketCheck {
	
	public static boolean brachketCheck(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c : s.toCharArray()) {
//			System.out.println(c);
			
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else if(c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				
				if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
					return false;
				}
			}
		}
		//스택이 비어 있으면 괄호가 모두 짝이 맞음
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		//() {} []
		
		String test01 = "(){}[]";
		String test02 = "({[)]}";
		String test03 = "({[]})";
		System.out.printf("%s : %b%n",test01,brachketCheck(test01));
		System.out.printf("%s : %b%n",test02,brachketCheck(test02));
		System.out.printf("%s : %b%n",test03,brachketCheck(test03));

	}

}
