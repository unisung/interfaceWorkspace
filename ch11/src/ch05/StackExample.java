package ch05;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	Stack<Integer> stack=new Stack<>();
	
	stack.push(1);//����޼ҵ� push(��ü)
	System.out.println(stack.peek());//���帶������ ����� ��ü Ȯ�� peek()
	stack.push(2);
	System.out.println(stack.peek());
	stack.push(3);
	System.out.println(stack.peek());
	
	System.out.println("����");
	Integer value=stack.pop();//���� �������� ����� ��ü ���� pop();
	System.out.println("���ŵ� ��ü:"+value);
	System.out.println(stack.peek());
	
	value=stack.pop();
	System.out.println("���ŵ� ��ü:"+value);
	System.out.println(stack.peek());
	
	value=stack.pop();
	System.out.println("���ŵ� ��ü:"+value);
//	System.out.println(stack.peek());
	
	

	}

}
