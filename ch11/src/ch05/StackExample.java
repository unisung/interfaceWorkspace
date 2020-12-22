package ch05;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	Stack<Integer> stack=new Stack<>();
	
	stack.push(1);//저장메소드 push(객체)
	System.out.println(stack.peek());//가장마지막에 저장된 객체 확인 peek()
	stack.push(2);
	System.out.println(stack.peek());
	stack.push(3);
	System.out.println(stack.peek());
	
	System.out.println("제거");
	Integer value=stack.pop();//가장 마지막에 저장된 객체 제거 pop();
	System.out.println("제거된 객체:"+value);
	System.out.println(stack.peek());
	
	value=stack.pop();
	System.out.println("제거된 객체:"+value);
	System.out.println(stack.peek());
	
	value=stack.pop();
	System.out.println("제거된 객체:"+value);
//	System.out.println(stack.peek());
	
	

	}

}
